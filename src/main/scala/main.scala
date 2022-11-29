import cats.implicits._

val x: Either[String, Option[Either[String, Int]]] = Right(Some(Right(1)))
val y = x.flatMap(_.sequence)
val z = x.flatMap(_.traverse(identity))
