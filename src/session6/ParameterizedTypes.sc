package session6

import com.atomicscala.AtomicTest._
 
object ParameterizedTypes {

  println("Question 17.")                         //> Question 17.

  // Return type is inferred:
  def inferred(c1: Char, c2: Char, c3: Char) = {
    Vector(c1, c2, c3)
  }                                               //> inferred: (c1: Char, c2: Char, c3: Char)scala.collection.immutable.Vector[Ch
                                                  //| ar]
  // Explicit return type:
  def explicit(c1: Char, c2: Char, c3: Char): Vector[Char] = {
    Vector(c1, c2, c3)
  }                                               //> explicit: (c1: Char, c2: Char, c3: Char)Vector[Char]
  inferred('a', 'b', 'c') is "Vector(a, b, c)"    //> Vector(a, b, c)
  explicit('a', 'b', 'c') is "Vector(a, b, c)"    //> Vector(a, b, c)

  // Explicit return type:
  def explicitDouble(d1: Double, d2: Double, d3: Double): Vector[Double] = {
    Vector(d1, d2, d3)
  }                                               //> explicitDouble: (d1: Double, d2: Double, d3: Double)Vector[Double]
  explicitDouble(1.0, 2.0, 3.0) is Vector(1.0, 2.0, 3.0)
                                                  //> Vector(1.0, 2.0, 3.0)

  println("Question 18.")                         //> Question 18.

  def explicitList(v: Vector[Any]): List[Any] = {
    v toList
  }                                               //> explicitList: (v: Vector[Any])List[Any]

  explicitList(Vector(10.0, 20.0)) is List(10.0, 20.0)
                                                  //> List(10.0, 20.0)
  explicitList(Vector(1, 2, 3)) is List(1.0, 2.0, 3.0)
                                                  //> List(1, 2, 3)
  println("Question 19.")                         //> Question 19.

  def explicitSet(v: Vector[Any]): Set[Any] = {
    v toSet
  }                                               //> explicitSet: (v: Vector[Any])Set[Any]

  explicitSet(Vector(10.0, 20.0, 10.0)) is Set(10.0, 20.0)
                                                  //> Set(10.0, 20.0)
  explicitSet(Vector(1, 2, 3, 2, 3, 4)) is Set(1.0, 2.0, 3.0, 4.0)
                                                  //> Set(1, 2, 3, 4)
}