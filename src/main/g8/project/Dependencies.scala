import sbt._

object Dependencies {

  object Version {
    val scalikeJdbcVersion = "3.3.2"
    val silhouette = "5.0.3"
    val playVersion = play.core.PlayVersion.current
    val playMailerVersion = "6.0.1"
  }

  val resolvers = Seq(
    Resolver.jcenterRepo
  )

  val deps = Seq(
    "org.scalikejdbc" %% "scalikejdbc" % Version.scalikeJdbcVersion,
    "org.scalikejdbc" %% "scalikejdbc-config"  % Version.scalikeJdbcVersion,
    "org.postgresql" % "postgresql" % "42.1.4",

    "com.mohiva" %% "play-silhouette" % Version.silhouette,
    "com.mohiva" %% "play-silhouette-password-bcrypt" % Version.silhouette,
    "com.mohiva" %% "play-silhouette-persistence" % Version.silhouette,
    "com.mohiva" %% "play-silhouette-crypto-jca" % Version.silhouette,
    "com.mohiva" %% "play-silhouette-testkit" % Version.silhouette,

    "com.typesafe.play" %% "play-mailer" % Version.playMailerVersion,
    "com.typesafe.play" %% "play-mailer-guice" % Version.playMailerVersion,
    "com.enragedginger" %% "akka-quartz-scheduler" % "1.6.1-akka-2.5.x",

    "com.iheart" %% "ficus" % "1.4.3",
    "net.codingwell" %% "scala-guice" % "4.2.0",
    "com.davegurnell" %% "bridges" % "0.16.1",
    "ch.qos.logback"  %  "logback-classic"   % "1.2.3"
  )
}
