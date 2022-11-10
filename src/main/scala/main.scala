import cats.implicits._

object main {
  val x: Either[String, Option[Either[String, Int]]] = ???
  val y = x.flatMap(_.sequence)
}
