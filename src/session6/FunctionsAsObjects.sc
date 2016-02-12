package session6

import com.atomicscala.AtomicTest._
 
object FunctionsAsObjects {

  println("Question 20.")                         //> Question 20.

  println("Question 21.")                         //> Question 21.

  val dogYears = (i: Int) => i * 7                //> dogYears  : Int => Int = <function1>
  dogYears(10) is 70                              //> 70

  println("Question 22.")                         //> Question 22.

  var s = ""                                      //> s  : String = ""
  val v = Vector(1, 5, 7, 8)                      //> v  : scala.collection.immutable.Vector[Int] = Vector(1, 5, 7, 8)
  v.foreach(e => s += s"${dogYears(e)} ")
  s is "7 35 49 56 "                              //> 7 35 49 56 

  println("Question 23.")                         //> Question 23.

  s = ""
  val numbers = Vector(1, 2, 5, 3, 7)             //> numbers  : scala.collection.immutable.Vector[Int] = Vector(1, 2, 5, 3, 7)
  numbers.foreach(e => s += s"${e * e} ")
  s is "1 4 25 9 49 "                             //> 1 4 25 9 49 
}