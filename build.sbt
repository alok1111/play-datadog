name := "play-datadog"
version := "1.0"

lazy val `play-datadog` = (project in file(".")).enablePlugins(PlayJava)

scalaVersion := "2.13.1"

libraryDependencies ++= Seq(javaWs)
      