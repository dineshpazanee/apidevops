package controllers

import javax.inject.Inject
import java.util.UUID

import play.api.libs.json._
import play.api._
import play.api.mvc._
import play.api.libs.json._
import play.api.libs.json.Reads._
import play.api.libs.functional.syntax._

import com.datastax.driver.core._
import play.filters.csrf.CSRFFilter

import play.api.libs.json.{Reads, JsError, Json}
import play.api.libs.json.JsValue 

import play.api.libs.functional.syntax._
import play.api.mvc.{AbstractController, ControllerComponents}
import play.api.libs.concurrent.Execution.Implicits._
import com.apidevops.dao.UserRepository
import models.User


class HomeController @Inject()(cc: ControllerComponents) extends AbstractController(cc) {

  def index() = Action {
    Ok(views.html.index())
  }
  
  def user() = Action {
    Ok(views.html.user())
  }
  
  def login() = Action {
    Ok(views.html.login())
  }
  
  
  def demo() = Action {
    Ok(views.html.demo())
  }
  
  
  def register() = Action {
    Ok(views.html.register())
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
  
/*  implicit val reads:Reads[User] = Json.reads[User]*/
  
  
  
  
   def addUser() = Action { implicit request =>
    // this will fail if the request body is not a valid json value
      val bodyAsJson = request.body.asJson.get
     
   // val bodyAsJson = Json.toJson(User.apply(id, username, password, email, isactive))
     println("-------------------")
  //   println("################# "+Json.toJson(request.toString()))
     println("------------------- done")
  //   Ok(Json.toJson(request.toString()))
  
    bodyAsJson.validate[User] match {
        case success: JsSuccess[User] => {
           var ur = new UserRepository().insertuser(success.get)
            val username = success.get.username
            Ok(Json.toJson("result "+ur.toString()+" created sucessfully!")).withSession("username" -> username)
        }
        case JsError(error) => BadRequest("Validation failed!")
    }
}
   
  
  /*
  def addUser() = Action {request =>
    
  //    var ur = new UserRepository().insertuser()
      println(request.body)
      
      var jsn = request.body.asJson
      
      implicit val userImplicitReads = jsn.get.as[User]
      
        val bodyAsJson = request.body.asJson.get
        
       var us =  bodyAsJson.as[User]
      
      println("id----------- "+us.id)
      
      Ok("Got request [" + request.body.asJson + "]")
  }
  
  */
       def addUser2  = Action(parse.json) {request =>
          //  val user = User(Option.empty, resource.email)
           // userService.createUser(user)
         println("-------------------")
         
        val message: JsValue = request.body
        val userNameJsonStr = (message \ "username").as[String]
        val value = Json.parse(userNameJsonStr)
         
        println("------------------- done" +value)
        Ok("Got request "+value)
    }
       
  
}
