package repositories.interpreters


import java.util.UUID
import javax.inject.Inject

import cats.Monad
import com.datastax.driver.core.PagingState
import com.outworkers.phantom.CassandraTable
import com.outworkers.phantom.connectors.CassandraConnection
import com.outworkers.phantom.dsl._
import models.{Gender, MainMenu}
import play.api.Configuration
import repositories.{Page, MenuRepository}

import scala.concurrent.{ExecutionContext, Future}
import scala.util.Try

class MenuRepositoryImpl @Inject()(config: Configuration, connection: CassandraConnection, ec: ExecutionContext)
  extends CassandraTable[MenuRepositoryImpl, MainMenu] with MenuRepository[Future] {
  
  implicit val session: Session = connection.session
  implicit val keySpace: KeySpace = connection.provider.space
  override val tableName: String = config.getString("db.table.menu").getOrElse("MainMenu")
  implicit val executionContext: ExecutionContext = ec
  
   object id extends UUIDColumn(this) with PartitionKey
   
   object link extends StringColumn(this) {
    override def name: String = "link"
  }
  
  object cssname extends StringColumn(this) {
    override def name: String = "cssname"
  }
  
  object menuname extends StringColumn(this) {
    override def name: String = "menuname"
  }
  
  override def find(mainmenuid: UUID): Future[Option[MainMenu]] =
    select.where(_.id eqs mainmenuid)
      .consistencyLevel_=(ConsistencyLevel.LOCAL_QUORUM)
      .one()
      
  override implicit val monad: Monad[Future] = cats.instances.future.catsStdInstancesForFuture      
  
}