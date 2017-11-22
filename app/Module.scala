import javax.inject.Singleton

import com.google.inject.{AbstractModule, TypeLiteral}
import com.outworkers.phantom.connectors.CassandraConnection
import net.codingwell.scalaguice.ScalaModule
import repositories.{PersonRepository, MenuRepository}
import repositories.interpreters.{CassandraConnectionProvider, PhantomPersonRepository, MenuRepositoryImpl}

import scala.concurrent.Future

class Module extends AbstractModule with ScalaModule {
  override def configure(): Unit = {
    bind[CassandraConnection].toProvider[CassandraConnectionProvider].in[Singleton]
    bind(new TypeLiteral[PersonRepository[Future]]{}).to(classOf[PhantomPersonRepository])
    bind(new TypeLiteral[MenuRepository[Future]]{}).to(classOf[MenuRepositoryImpl])
  }
}
