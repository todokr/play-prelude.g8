import java.net.InetSocketAddress

import play.sbt.PlayRunHook
import sbt._
import scala.sys.process.Process

object FrontendRunHook {
  def apply(base: File): PlayRunHook = {
    object UIBuildHook extends PlayRunHook {

      var process: Option[Process] = None
      val UIPath = "app-ui"

      override def beforeStarted(): Unit = {
        if (!(base / UIPath / "node_modules").exists()) {
          println("installing frontend dependencies...")
          Process(FrontendCommands.dependencyInstall, base / UIPath).!
        }
      }

      override def afterStarted(addr: InetSocketAddress) : Unit = {
        process = Option(Process(FrontendCommands.serve, base / UIPath).run)
      }

      override def afterStopped(): Unit = {
        process.foreach(_.destroy())
        process = None
      }
    }

    UIBuildHook
  }
}


object FrontendCommands {
  val dependencyInstall: String = "npm install"
  val test: String = "npm run test:ci"
  val serve: String = "npm run start"
  val build: String = "npm run build:prod"
}
