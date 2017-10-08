package com.apidevops.dao

import java.util.UUID
import scala.concurrent.ExecutionContext
import scala.concurrent.Future
import com.datastax.driver.core.BoundStatement
import com.datastax.driver.core._

case class User(id: UUID, name: String, password: String, host: String, request: String)

class UserRepository {
  
  
  def insertuser() = {
     val cluster = Cluster.builder().addContactPoint("localhost")
        .withPort(9042)
        .build()
  
     val session = cluster.connect()
     
      var va = session.execute("SELECT * FROM apidevops.user")

  }
  
}