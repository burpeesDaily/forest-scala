val scala3Version = "3.1.1"

lazy val root = project
  .in(file("."))
  .settings(
    name := "forest-scala",
    version := "0.1.0-SNAPSHOT",
    scalaVersion := scala3Version,
    libraryDependencies += "org.scalactic" %% "scalactic" % "3.2.11",
    libraryDependencies += "org.scalatest" %% "scalatest" % "3.2.9" % Test
  )
