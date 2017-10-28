package models

import play.api.data._
import play.api.data.Forms._

class UserForm {
  
  
  
}


object UserForm{
  
  val loginForm = Form(
  mapping(
    "userName" -> text,
    "userPassword" -> text
  )(LoginUser.apply)(LoginUser.unapply)
)
  
}