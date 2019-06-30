package controllers

import javax.inject.{Inject, Singleton}
import play.api.libs.json.Json
import play.api.mvc.{AbstractController, ControllerComponents}
import play.api.routing.Router
import utils.AppConfig

@Singleton
class SystemController @Inject()(
  assets: Assets,
  config: AppConfig,
  router: Router,
  cc: ControllerComponents
) extends AbstractController(cc){

  def health() = ???
}
