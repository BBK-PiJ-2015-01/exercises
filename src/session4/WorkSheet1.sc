object WorkSheet1 {

  42                                              //> res0: Int(42) = 42
  true                                            //> res1: Boolean(true) = true
  123L                                            //> res2: Long(123L) = 123
  42.0                                            //> res3: Double(42.0) = 42.0
  'a'                                             //> res4: Char('a') = a
  "a"                                             //> res5: String("a") = a
  "Hello world"                                   //> res6: String("Hello world") = Hello world
  println("Welcome to the Scala Worksheet")       //> Welcome to the Scala Worksheet

  val a = 1                                       //> a  : Int = 1
  val b = 2                                       //> b  : Int = 2
  if (a > b) "alien" else "predator"              //> res7: String = predator

  if (a > b) "alien" else 2001                    //> res8: Any = 2001

  if (true) "hello"                               //> res9: Any = hello

  1 + 2 + 3                                       //> res10: Int = 6
  6                                               //> res11: Int(6) = 6

  object calc {

    def square(d: Double) = {
      d * d
    }

    def cube(d: Double) = {
      d * square(d)
    }
  }

  calc.cube(13)                                   //> res12: Double = 2197.0

  object calc2 {

    def square[T](a: T)(implicit n: Numeric[T]) = n.times(a, a)

    def cube[T](a: T)(implicit n: Numeric[T]) = n.times(a, square(a))
  }

  calc2.cube(13)                                  //> res13: Int = 2197
}