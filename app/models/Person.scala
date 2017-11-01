package models

import java.util.UUID

import models.Gender.Gender
import models.dtos.EnumerationJsonFormat
import play.api.libs.json.{Format, Json, Writes}

case class Person(id: UUID, firstName: String, lastName: String, userId: String, password: String, email: String,  gender:String)

case class Address(id: UUID, city: String, country: String, contactNo: Number)

object Person {
  implicit val jsonWrites: Writes[Person] = Json.writes[Person]
}

object Gender extends Enumeration {
  type Gender = Value
  val Male, Female = Value

  implicit val genderWrites: Format[models.Gender.Value] = EnumerationJsonFormat.enumFormat(Gender)
}
