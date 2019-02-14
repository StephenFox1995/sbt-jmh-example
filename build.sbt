import sbt.Keys._

//libraryDependencies += "org.openjdk.jmh" % "jmh-core" % "1.21" % "org.openjdk.jmh" % "jmh-generator-annprocess" % "1.21" % Test


lazy val root = (project in file(".")).
  enablePlugins(JmhPlugin).
  settings(
    name := "stringsplit",
    version := "1.0"
  )
