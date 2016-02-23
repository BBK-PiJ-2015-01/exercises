package session7

object MoreGenerics {

  println("Question 10.")                         //> Question 10.

  sealed trait Maybe[T]

  case class Full[T](val result: T) extends Maybe[T]
  case class Empty[T]() extends Maybe[T]

  object divide {

    def apply(x: Int, y: Int): Maybe[Int] = if (y == 0) Empty[Int]() else Full(x / y)
  }
  
  divide(1, 0) match {
    case Full(value) => println(s"It's finite: ${value}")
    case Empty() => println(s"It's infinite")
  }                                               //> It's infinite
}