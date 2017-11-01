name := "apidevops"

version := "2.6.x"

scalaVersion := "2.12.2"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

// Compile the project before generating Eclipse files, so that generated .scala or .class files for views and routes are present
EclipseKeys.preTasks := Seq(compile in Compile, compile in Test)

val PhantomVersion = "2.7.6"

libraryDependencies ++= Seq(
  
  "org.scalatestplus.play" %% "scalatestplus-play" % "3.1.0" % Test,
  "org.typelevel" %% "cats" % "0.9.0",
  "com.outworkers" %% "phantom-dsl" % PhantomVersion,
  "net.codingwell" %% "scala-guice" % "4.1.0"
)

libraryDependencies += guice





