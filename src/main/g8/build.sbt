ThisBuild / name := "$name$"
ThisBuild / organization := "$organization$"
ThisBuild / version := "$version$"
ThisBuild / scalaVersion := "$scala_version$"

libraryDependencies ++=  List(
  "org.apache.spark" %% "spark-core" % "$spark_version$" % "provided",
  "org.apache.spark" %% "spark-sql" % "$spark_version$" % "provided",
  "org.scalatest"    %% "scalatest" % "$scalatest_version$" % Test
)

mainClass in assembly := Some("$package$.SparkApp")

assemblyMergeStrategy in assembly := {
  case PathList("org", "aopalliance", _@_*) => MergeStrategy.last
  case PathList("javax", "inject", _@_*) => MergeStrategy.last
  case PathList("javax", "servlet", _@_*) => MergeStrategy.last
  case PathList("javax", "activation", _@_*) => MergeStrategy.last
  case PathList("org", "apache", _@_*) => MergeStrategy.last
  case PathList("com", "google", _@_*) => MergeStrategy.last
  case PathList("com", "esotericsoftware", _@_*) => MergeStrategy.last
  case PathList("com", "codahale", _@_*) => MergeStrategy.last
  case PathList("com", "yammer", _@_*) => MergeStrategy.last
  case "about.html" => MergeStrategy.rename
  case "META-INF/ECLIPSEF.RSA" => MergeStrategy.last
  case "META-INF/mailcap" => MergeStrategy.last
  case "META-INF/mimetypes.default" => MergeStrategy.last
  case "plugin.properties" => MergeStrategy.last
  case "log4j.properties" => MergeStrategy.last
  case x =>
    val oldStrategy = (assemblyMergeStrategy in assembly).value
    oldStrategy(x)
}
