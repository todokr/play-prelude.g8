import scala.sys.process._

val Success = 1
val Error = 0

// Run angular serve task when Play runs in dev mode
// https://www.playframework.com/documentation/2.7.x/SBTCookbook
PlayKeys.playRunHooks += baseDirectory.map(FrontendRunHook).value

def runOnCommandline(script: String)(implicit dir: File): Int = Process(script, dir).!
def isNodeModulesInstalled(implicit dir: File): Boolean = (dir / "node_modules").exists()
def runNpmInstall(implicit dir: File): Int =
  if (isNodeModulesInstalled) Success else runOnCommandline(FrontendCommands.dependencyInstall)
def ifNodeModulesInstalled(task: => Int)(implicit dir: File): Int =
  if (runNpmInstall == Success) task
  else Error
def executeUiTests(implicit dir: File): Int = ifNodeModulesInstalled(runOnCommandline(FrontendCommands.test))
def executeProdBuild(implicit dir: File): Int = ifNodeModulesInstalled(runOnCommandline(FrontendCommands.build))


// tasks

lazy val `ui-test` = TaskKey[Unit]("run UI tests when testing application.")

`ui-test` := {
  implicit val userInterfaceRoot: File = baseDirectory.value / "ui"
  if (executeUiTests != Success) throw new Exception("UI tests failed!")
}

lazy val `ui-prod-build` = TaskKey[Unit]("run UI build when packaging the application.")

`ui-prod-build` := {
  implicit val userInterfaceRoot: File = baseDirectory.value / "ui"
  if (executeProdBuild != Success) throw new Exception("Oops! UI Build crashed.")
}

// Execute frontend prod build task prior to play dist execution.
dist := (dist dependsOn `ui-prod-build`).value

// Execute frontend prod build task prior to play stage execution.
stage := (stage dependsOn `ui-prod-build`).value

// Execute frontend test task prior to play test execution.
test := ((test in Test) dependsOn `ui-test`).value
