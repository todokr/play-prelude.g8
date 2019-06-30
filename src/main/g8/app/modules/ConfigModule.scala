package modules

import com.google.inject.{AbstractModule, Provides}
import com.typesafe.config.Config
import javax.inject.Singleton
import net.ceedubs.ficus.Ficus._
import net.codingwell.scalaguice.ScalaModule
import utils.AppConfig

class ConfigModule extends AbstractModule with ScalaModule {
  import net.ceedubs.ficus.readers.ArbitraryTypeReader._

  @Provides @Singleton
  def provideAppConfig(config: Config): AppConfig =
    config.as[AppConfig]("app")
}
