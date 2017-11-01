package models

import play.api.data._
import play.api.data.Forms._

class UserForm {
  
  
  
}

case class LoginUser(firstName: String, lastName: String, userName: String,  userPassword: String, userEmail: String, gender: String)  

object UserForm{
  
  val loginForm = Form(
  mapping(
    "firstName" -> text,
    "lastName" -> text,
    "userName" -> text,
    "password" -> text,
    "email" -> text,
    "gender" -> text
  )(LoginUser.apply)(LoginUser.unapply)
)
  
}