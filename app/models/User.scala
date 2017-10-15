package models

import java.util.UUID

import play.api.libs.json._
import play.api.libs.functional.syntax._

// define what attributes your model has
case class User(id: Option[UUID], username: String, password: String, 
                email: Option[String], isactive: String)

// the converters should be placed in a 
// companion object
object User {
  // this informs Play how to convert a json value
  // into a User object
  implicit val reads: Reads[User] = (
    (JsPath \ "id").readNullable[UUID] and  
    (JsPath \ "username").read[String] and
    (JsPath \ "password").read[String] and
    (JsPath \ "email").readNullable[String] and
    (JsPath \ "isactive").read[String] )(User.apply _)
}