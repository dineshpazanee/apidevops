name := "apidevops"

version := "2.6.x"

scalaVersion := "2.12.2"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

// Compile the project before generating Eclipse files, so that generated .scala or .class files for views and routes are present
EclipseKeys.preTasks := Seq(compile in Compile, compile in Test)

val PhantomVersion = "2.9.2"

libraryDependencies ++= Seq(
  "com.outworkers" %% "phantom-dsl" % PhantomVersion
)


libraryDependencies += guice

libraryDependencies += ws % Test
libraryDependencies += "org.scalatestplus.play" %% "scalatestplus-play" % "3.1.0" % Test

libraryDependencies += "com.datastax.cassandra" % "cassandra-driver-core" % "3.1.2"
libraryDependencies += "com.datastax.cassandra" % "cassandra-driver-mapping" % "2.1.0-rc1"




