package models

import play.api.data._
import play.api.data.Forms._

class UserForm {
  
  
  
}


case class LoginUser(firstName: String, lastName: String, userName: String,  userPassword: String, userEmail: String, gender: String)

case class SimplePerson(userId: String,  email: String, password: String)

case class LoginPerson(userName: String, password: String)

object UserForm{
  
  val loginForm = Form(
  mapping(
    "firstName" -> text,
    "lastName" -> text,
    "userName" -> text,
    "password" -> text,
    "email" -> text,
    "gender" -> text
  )(LoginUser.apply)(LoginUser.unapply))
  
  val simplePersonForm = Form(
  mapping(
    "userId" -> text,    
    "email" -> text,
    "password" -> text
  )(SimplePerson.apply)(SimplePerson.unapply))
  
  val loginPerson = Form(
  mapping(
    "userName" -> text,   
    "password" -> text
  )(LoginPerson.apply)(LoginPerson.unapply))
  
  
  
}