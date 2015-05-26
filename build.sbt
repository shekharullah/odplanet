name := "odplanet"

version := "1.0-SNAPSHOT"

libraryDependencies ++= Seq(
  javaJdbc,
  javaEbean,
  cache,
  "org.webjars" %% "webjars-play" % "2.2.0",
  "org.webjars.bower" % "boot" % "3.3.4"
)     

play.Project.playJavaSettings
