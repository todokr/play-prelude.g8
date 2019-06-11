package controllers

import javax.inject.Inject

import play.api.Configuration
import play.api.http.HttpErrorHandler
import play.api.mvc.{AbstractController, Action, AnyContent, ControllerComponents}

@Singleton
class $controllerName$ @Inject()(
  config: Configuration,
  cc: ControllerComponents
) extends AbstractController(cc) with $serviceName$ {

  def list() = ???

  def find() = ???

  def update() = ???

  def delete() = ???
}
