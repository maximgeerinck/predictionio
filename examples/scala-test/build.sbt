import AssemblyKeys._

assemblySettings

name := "example-scala-test"

organization := "org.sample"

libraryDependencies ++= Seq(
  "io.prediction" %% "core" % "0.8.0" % "provided",
  "io.prediction" %% "data" % "0.8.0" % "provided",
  "org.apache.spark" %% "spark-core" % "1.1.0" % "provided")
