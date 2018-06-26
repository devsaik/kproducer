import sbt._

object Dependencies {

  val resolutionRepos = Seq(
    "Sonatype OSS Releases"   at "http://oss.sonatype.org/content/repositories/releases/",
    "Typesafe"                at "http://repo.typesafe.com/typesafe/releases/",
    "Artima Maven Repository" at "http://repo.artima.com/releases"
  )

  object V {
    // Scala
    val kinesisClient        = "1.9.1"
    //val alpakkaKinesis       = "0.19"

    // Scala (test only)
    val scalatest            = "3.0.5"
  }

  val Libraries = Seq(
    // Scala
    "com.amazonaws"         %  "amazon-kinesis-client"       % V.kinesisClient,
    //"com.lightbend.akka"    %% "akka-stream-alpakka-kinesis" % V.alpakkaKinesis,

    // Scala (test only)
    "org.scalatest"         %% "scalatest"                   % V.scalatest   % "test"
  )
}