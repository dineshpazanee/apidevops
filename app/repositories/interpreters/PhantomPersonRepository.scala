package repositories.interpreters


import java.util.UUID
import javax.inject.Inject

import cats.Monad
import com.datastax.driver.core.PagingState
import com.outworkers.phantom.CassandraTable
import com.outworkers.phantom.connectors.CassandraConnection
import com.outworkers.phantom.dsl._
import models.{Gender, Person}
import play.api.Configuration
import repositories.{Page, PersonRepository}

import scala.concurrent.{ExecutionContext, Future}
import scala.util.Try

class PhantomPersonRepository @Inject()(config: Configuration, connection: CassandraConnection, ec: ExecutionContext)
  extends CassandraTable[PhantomPersonRepository, Person] with PersonRepository[Future] {
  // See https://github.com/outworkers/phantom/wiki/Using-the-Database-class-and-understanding-connectors
  implicit val session: Session = connection.session
  implicit val keySpace: KeySpace = connection.provider.space
  override val tableName: String = config.getString("db.table.person").getOrElse("person_info")
  implicit val executionContext: ExecutionContext = ec

  object id extends UUIDColumn(this) with PartitionKey

  //object firstName extends StringColumn(this) 
  object firstName extends StringColumn(this) {
    override def name: String = "firstName"
  }

  object lastName extends StringColumn(this) {
    override def name: String = "lastName"
  }

 
  object userId extends StringColumn(this) with Index
  
  object email extends StringColumn(this) {
    override def name: String = "email"
  }
  
  object password extends StringColumn(this) {
    override def name: String = "password"
  }
  
  object gender extends StringColumn(this) {
    override def name: String = "gender"
  }

 // object gender extends EnumColumn[Gender.Value](this)

  override implicit val monad: Monad[Future] = cats.instances.future.catsStdInstancesForFuture
  
/*  override def create(person: Person): Future[Person]  = {
  store(person)
    .consistencyLevel_=(ConsistencyLevel.ALL)
    .future()
    .map(_ => person)
}*/

  override def create(person: Person): Future[Person] =
    insert.value(_.id, person.id)
      .value(_.firstName, person.firstName)
      .value(_.lastName, person.lastName)
      .value(_.userId, person.userId)
      .value(_.password, person.password)
      .value(_.email, person.email)
      .value(_.gender, person.gender)
      .consistencyLevel_=(ConsistencyLevel.LOCAL_QUORUM)
      .future()
      .map(_ => person)

  // https://github.com/outworkers/phantom/wiki/Querying#query-api
  override def find(personId: UUID): Future[Option[Person]] =
    select.where(_.id eqs personId)
      .consistencyLevel_=(ConsistencyLevel.LOCAL_QUORUM)
      .one()
      
  def findUser(user_Id: String): Future[Option[Person]] = {
    select.where(_.userId eqs user_Id).one()
  }    

  // can be more fancy https://github.com/outworkers/phantom/wiki/Querying#update-queries
  override def update(person: Person): Future[Person] = create(person)

  override def deleteById(personId: UUID): Future[UUID] =
    delete.where(_.id eqs personId)
      .consistencyLevel_=(ConsistencyLevel.LOCAL_QUORUM)
      .future()
      .map(_ => personId)

  override def findAll(pagingState: Option[String]): Future[Page[Seq[Person]]] = {
    // See https://docs.datastax.com/en/developer/java-driver/2.1/manual/paging/
    val cassandraPagingState = for {
      pageString <- pagingState
      pageState <- Try(PagingState.fromString(pageString)).toOption
    } yield pageState

    // See https://github.com/outworkers/phantom/issues/559
    for {
      result <- select.all.paginateRecord { statement =>
        cassandraPagingState.foreach(pagingState => statement.setPagingState(pagingState))
        statement.setFetchSize(4)
      }
    } yield Page(result.records, Option(result.pagingState).map(_.toString))
  }
}