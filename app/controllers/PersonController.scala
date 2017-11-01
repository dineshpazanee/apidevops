package controllers

import java.util.UUID
import javax.inject._

import models.Person
import models.dtos.{CreatePerson, ErrorCode, ErrorResponse, PersonsResult}
import play.api.data.validation.ValidationError
import play.api.libs.json._
import play.api.mvc._
import repositories.PersonRepository

import scala.concurrent.{ExecutionContext, Future}

@Singleton
class PersonController @Inject()(personRepo: PersonRepository[Future])(implicit ec: ExecutionContext) extends Controller {


  def find(id: UUID): Action[AnyContent] = Action.async (
    personRepo.find(id).map {
      case None => NotFound
      case Some(existingPerson) => Ok(existingPerson.toJson)
    }.recover { case _ => ServiceUnavailable }
  )

  def findAll(next: Option[String]): Action[AnyContent] = Action.async(
    personRepo.findAll(next).map(personResult => Ok(PersonsResult(personResult.result, personResult.next).toJson))
  )

  def delete(id: UUID): Action[AnyContent] = Action.async (
    personRepo.find(id).flatMap {
      case None => Future.successful(NotFound)
      case Some(_) => personRepo.deleteById(id).map(_ => Ok)
    }.recover { case _ => ServiceUnavailable }
  )

  implicit class Jsonable[A](a: A) {
    def toJson(implicit writes: Writes[A]): JsValue = Json.toJson(a)(writes)
  }
}
