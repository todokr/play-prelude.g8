import scala.sys.process.Process

import play.sbt.PlayRunHook
import sbt._

object DockerHook extends (File => PlayRunHook) {
  def apply(base: File): PlayRunHook = {
    object DockerStartHook extends PlayRunHook {
      override def beforeStarted(): Unit = {
        println("starting Docker containers")
        Process("docker-compose up -d", base / "docker").!
      }
    }

    DockerStartHook
  }
}
