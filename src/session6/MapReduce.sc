package session6

import com.atomicscala.AtomicTest._
 
object MapReduce {

  println("Question 24.")                         //> Question 24.

  val v = Vector(1, 2, 3, 4)                      //> v  : scala.collection.immutable.Vector[Int] = Vector(1, 2, 3, 4)
  v.map(n => n * 11 + 10) is Vector(21, 32, 43, 54)
                                                  //> Vector(21, 32, 43, 54)

  println("Question 25.")                         //> Question 25.

  println("foreach type is Unit, not Vector.")    //> foreach type is Unit, not Vector.
  v.foreach(n => n * 11 + 10)

  println("Question 26.")                         //> Question 26.

  var ov = Vector[Int]()                          //> ov  : scala.collection.immutable.Vector[Int] = Vector()
  v.foreach(n => ov = ov :+ n * 11 + 10)
  ov is Vector(21, 32, 43, 54)                    //> Vector(21, 32, 43, 54)

  println("Question 27.")                         //> Question 27.

  ov = Vector[Int]()
  for (n <- v) {
    ov = ov :+ n * 11 + 10
  }
  ov is Vector(21, 32, 43, 54)                    //> Vector(21, 32, 43, 54)

  println("Question 28. Can't find class Reduce") //> Question 28. Can't find class Reduce

  println("Question 29.")                         //> Question 29.

  def sumIt(ints: Int*) = ints.reduce((x, y) => x + y)
                                                  //> sumIt: (ints: Int*)Int

  sumIt(1, 2, 3) is 6                             //> 6
  sumIt(45, 45, 45, 60) is 195                    //> 195
}