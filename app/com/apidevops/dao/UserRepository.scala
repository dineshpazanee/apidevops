package com.apidevops.dao

import java.util.UUID
import scala.concurrent.ExecutionContext
import scala.concurrent.Future
import com.datastax.driver.core._
import com.datastax.driver.core.BoundStatement
import com.datastax.driver.core.PreparedStatement;

import models.User
import models.LoginUser

/*case class User(id: UUID, name: String, password: String, host: String, request: String)*/

class UserRepository {
  
  //https://stackoverflow.com/questions/34701817/what-is-the-most-efficient-way-to-map-transform-cast-a-cassandra-boundstatement
  def checkLoginUser(loginUser:LoginUser):Any = {
      
    val cluster = Cluster.builder().addContactPoint("localhost")
        .withPort(9042)
        .build()
  
     val session = cluster.connect()
     
 //    ResultSet rs = session.execute("select user_id, post_id, title from posts where user_id = " + u1.getUserId());

  }
  
  
  def insertuser(user:User):Any = {
     val cluster = Cluster.builder().addContactPoint("localhost")
        .withPort(9042)
        .build()
  
     val session = cluster.connect()
     
      var va = session.execute("SELECT * FROM apidevops.user")
      
      var id = UUID.randomUUID().toString()
      
      println(id)
      
  //   var insertStatment =  session.execute("INSERT INTO  apidevops.user  (id, name, password, host, request) VALUES(now(), 'muruga', 'dinesh', 'host', 'request')  ");
      
         var insertStatment =  session.execute("INSERT INTO  apidevops.user  (id, username, password, email, isactive) "+
             "VALUES(now(), '"+user.username+"', '"+user.password+"', '"+user.email+"', '"+user.isactive+"' )  ");
      
       //session.execute("UPDATE apidevops.user SET count=count+100  WHERE name='John'    AND surname='Smith' ")
       
       /*var bs = new BoundStatement(insertStatment);
       
       
       
       bs.setString(0, id)
       bs.setString(1, "dinesh")
       bs.setString(2, "passowrd")
       bs.setString(3, "host")
       bs.setString(4, "request")
       
       var result = session.execute(bs);
       */
       println(user.username)
       user.username

  }
  
}