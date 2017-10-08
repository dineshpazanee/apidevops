package controllers

import javax.inject.Inject

import play.api.libs.json.Json

import com.apidevops.service._
import com.datastax.driver.core._

import play.api.mvc.{AbstractController, ControllerComponents}

class HomeController @Inject()(cc: ControllerComponents) extends AbstractController(cc) {

  def index() = Action {
    Ok(views.html.index())
  }
  
  def createuser() = Action{
    
     val cluster = Cluster.builder().addContactPoint("localhost")
  .withPort(9042)
  .build()
  
     val session = cluster.connect()

    var va = session.execute("SELECT * FROM apidevops.user")

    println(va)
  
  
    Ok(Json.toJson(va.toString()))
  }
  
  def addUser() = Action {request =>
    
      println(request.body)
      Ok("Got request [" + request.body.asJson + "]")
  }
  
  
  
  
}
