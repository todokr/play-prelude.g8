libraryDependencies += "org.postgresql" % "postgresql" % "42.1.4"

logLevel := Level.Warn
addSbtPlugin("org.scalikejdbc" %% "scalikejdbc-mapper-generator" % "3.3.2")
addSbtPlugin("com.typesafe.play" % "sbt-plugin" % "2.6.12")
addSbtPlugin("com.heroku" % "sbt-heroku" % "2.1.1")
addSbtPlugin("org.foundweekends.giter8" % "sbt-giter8-scaffold" % "0.11.0")
addSbtPlugin("io.github.davidmweber" % "flyway-sbt" % "5.2.0")
addSbtPlugin("com.twilio" % "sbt-guardrail" % "0.51.0")
