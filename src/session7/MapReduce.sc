package session6

import com.atomicscala.AtomicTest._

object MapReduce {

  println("Question 1(a).")                       //> Question 1(a).

  val v = Vector(1, 2, 3, 4)                      //> v  : scala.collection.immutable.Vector[Int] = Vector(1, 2, 3, 4)
  v.map(n => n * 11 + 10) is Vector(21, 32, 43, 54)
                                                  //> Vector(21, 32, 43, 54)

  println("Question 1(b).")                       //> Question 1(b).

  println("foreach type is Unit, not Vector.")    //> foreach type is Unit, not Vector.
  v.foreach(n => n * 11 + 10)

  println("Question 1(c).")                       //> Question 1(c).

  var ov = Vector[Int]()                          //> ov  : scala.collection.immutable.Vector[Int] = Vector()
  v.foreach(n => ov = ov :+ n * 11 + 10)
  ov is Vector(21, 32, 43, 54)                    //> Vector(21, 32, 43, 54)

  println("Question 2.")                          //> Question 2.

  ov = Vector[Int]()
  for (n <- v) {
    ov = ov :+ n * 11 + 10
  }
  ov is Vector(21, 32, 43, 54)                    //> Vector(21, 32, 43, 54)

  println("Question 3.")                          //> Question 3.

  val rv = Vector(1, 10, 100, 1000)               //> rv  : scala.collection.immutable.Vector[Int] = Vector(1, 10, 100, 1000)
  rv.reduce((sum, n) => sum + n) is 1111          //> 1111

  println("Question 4.")                          //> Question 4.

  def sumIt(ints: Int*) = ints.reduce((x, y) => x + y)
                                                  //> sumIt: (ints: Int*)Int

  sumIt(1, 2, 3) is 6                             //> 6
  sumIt(45, 45, 45, 60) is 195                    //> 195
}