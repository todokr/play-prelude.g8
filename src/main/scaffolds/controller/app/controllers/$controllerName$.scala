package controllers

import javax.inject.Inject

import play.api.Configuration
import play.api.http.HttpErrorHandler
import play.api.mvc.{AbstractController, Action, AnyContent, ControllerComponents}
import play.api.libs.json.{Format, Json}

@Singleton
class $model$Controller @Inject()(
  config: Configuration,
  cc: ControllerComponents
) extends AbstractController(cc) with $model$Service {
  import $model$Controller._

  def list() = ???

  def find() = ???

  def update() = ???

  def delete() = ???
}

object $model$Controller {

  implicit val $model;format="camel"$Format: Format[$model$] = Json.format
}
