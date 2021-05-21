name := "play-datadog"
version := "1.0"

lazy val `play-datadog` = (project in file(".")).enablePlugins(PlayJava)

scalaVersion := "2.13.1"

libraryDependencies ++= Seq(javaWs, guice)
javaOptions += "-Ddd.trace.methods=com.play.datadog.NonStaticLogComponent[*];com.play.datadog.StaticLogComponent[*]"

enablePlugins(DatadogAPM)

datadogApmVersion := "0.80.0"
datadogEnableDebug := true
      