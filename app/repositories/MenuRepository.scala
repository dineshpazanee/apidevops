package repositories

import java.util.UUID

import cats.Monad
import models.MainMenu

import scala.language.higherKinds


trait MenuRepository [Effect[_]] {
  
  implicit val monad: Monad[Effect]

  def find(mainmenuid: UUID): Effect[Option[MainMenu]]
}