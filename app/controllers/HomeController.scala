package controllers

import javax.inject.Inject
import java.util.UUID

import play.api.libs.json._
import play.api._
import play.api.mvc._
import play.api.libs.json._
import play.api.libs.json.Reads._
import play.api.libs.functional.syntax._
import scala.language.higherKinds
import scala.concurrent.{ExecutionContext, Future}
import scala.util.{Success, Failure}
import scala.concurrent.Await
import scala.concurrent.duration._

import play.api.data._
import play.api.data.Forms._

import com.datastax.driver.core._
import play.filters.csrf.CSRFFilter

import play.api.libs.json.{Reads, JsError, Json}
import play.api.libs.json.JsValue 

import play.api.libs.functional.syntax._
import play.api.mvc.{AbstractController, ControllerComponents}
import play.api.libs.concurrent.Execution.Implicits._
import com.apidevops.dao.UserRepository
import models.User
import models.UserData
import models.LoginUser
import models.Person
import models.UserForm
import models._
import repositories.PersonRepository

import scala.concurrent.{ExecutionContext, Future}

class HomeController @Inject()(personRepo: PersonRepository[Future])(cc: ControllerComponents) extends AbstractController(cc) {

  var simplePerson = new SimplePerson("dinesh", "dinesh@gmail.com", "12345")
  
  def index() = Action { implicit request =>
      var sessionUser = request.session.get("sessionUser")
      var sessionUuid = request.session.get("sessionUuid")
      println("!!!!!!!!!!!! "+request.session.isEmpty)
      
      request.session.get("sessionUser").map{f =>
        println("111111111111111 "+f)
      }.getOrElse{
        println("222222222222222 ")
      }
      
      
      if(sessionUser != None){
        println(sessionUuid+"-----------> 1 "+sessionUser)         
        Ok(views.html.index())
      }else{
        println(sessionUuid+"-----------> 2 "+sessionUser)
        personRepo.findUser(sessionUser.toString()).map {
          case None => NotFound
          case Some(existingPerson) => Ok(views.html.demo())
        }.recover { case _ => ServiceUnavailable }
        Redirect(routes.HomeController.demo)
      }
  }
  
  def login() = Action {
    Ok(views.html.login.render(None))
  }
  
  def createperson = Action(parse.form(UserForm.simplePersonForm)) { implicit request =>
    val simplePersonForm = request.body
    
    println("-------------------------")
    val simplePerson = Person(UUID.nameUUIDFromBytes(simplePersonForm.userId.getBytes()), "",
        "", simplePersonForm.userId, simplePersonForm.password, simplePersonForm.email, "")
       
       personRepo.create(simplePerson)
      Ok(views.html.login.render(None))
  }
  
  
  def loginUser() = Action(parse.form(UserForm.loginPerson)) { implicit request =>
    val loginPersonValue = request.body    
    var loggedUserInfo = Await.result(personRepo.findUser(loginPersonValue.userName), 10 seconds)
    
    loggedUserInfo.map{f =>   
      
        if((loginPersonValue.userName.equals(f.userId)) &&
            (loginPersonValue.password.equals(f.password))){
          println("33333333333 ")
          
          request.session + ("sessionUser" -> f.userId)
          request.session + ("sessionUuid" -> f.id.toString())
          request.session + ("sessionEmail" -> f.email)
          
           Ok(views.html.index()).withSession(request.session + ("sessionUser" -> f.userId)+ ("sessionUuid" -> f.id.toString()))
        }else{
           println("44444444444 ")
           Ok(views.html.login.render(Some("Invalid Username and Password.")))
        }
      }.getOrElse{Ok(views.html.login.render(Some("Not a valid user. Please signup.")))}
    }
  
  def notValidUser = Action {
    Ok(views.html.login.render(Some("Not a valid user! Please signup")))
  }
  
  def invalidValidUser = Action {
    Ok(views.html.login.render(Some("Invalid username and Password!")))
  } 
  
  
  def user() = Action {
    Ok(views.html.user())
  } 
  
  
  def demo() = Action {
    Ok(views.html.demo())
  }
  
  
  def register() = Action {
    Ok(views.html.register.render(simplePerson))
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
  
  val userForm = Form(
  mapping(
    "userName" -> text,
    "userEmail" -> text,
    "userPassword" -> text
  )(UserData.apply)(UserData.unapply)
)
  
  val userPost = Action(parse.form(userForm)) { implicit request =>
  val userData = request.body
  val newUser = models.UserData(userData.userName, userData.userEmail, userData.userPassword)
  println("----------------- "+newUser.userName)
    Ok(Json.toJson(newUser.userName+" "+newUser.userEmail+" "+newUser.userPassword))
  }
  
  
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
