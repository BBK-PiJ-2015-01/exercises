package session7

import com.atomicscala.AtomicTest._

object LinkedList {
  println("Question 8(a).") //> Question 8(a).

  sealed trait LinkedList[T] {

    def head: T
    def tail: LinkedList[T]

    def length: Int = 0
    def apply(n: Int): T
    def contains(t: T): Boolean
  }

  case class Pair[T](val head: T, val tail: LinkedList[T]) extends LinkedList[T] {

    override def length: Int = length(this)
    private def length(node: LinkedList[T]): Int = {
      if (node.tail == Empty()) 1 else 1 + length(node.tail)
    }

    override def apply(n: Int): T = apply(n, this)
    private def apply(n: Int, node: LinkedList[T]): T = {
      if (node == Empty()) throw new Exception("Out of bounds")
      else if (n == 0) node.head
      else apply(n - 1, node.tail)
    }

    override def contains(t: T): Boolean = contains(t, this)
    private def contains(t: T, node: LinkedList[T]): Boolean = {
      if (node == Empty()) false
      else if (t == node.head) true
      else contains(t, node.tail)
    }
  }

  case class Empty[T]() extends LinkedList[T] {

    def head: Nothing = throw new NoSuchElementException("Nil.head")
    def tail: Nothing = throw new NoSuchElementException("Nil.tail")
    override def apply(n: Int): Nothing = throw new NoSuchElementException(n toString)
    override def contains(t: T): Boolean = false
  }

  val list: LinkedList[Int] = Pair(1, Pair(2, Pair(3, Empty())))
  //> list  : session7.LinkedList.LinkedList[Int] = Pair(1,Pair(2,Pair(3,Empty())
  //| ))

  list.isInstanceOf[LinkedList[Int]] is true //> true
  list.head is 1 //> 1
  list.tail.head is 2 //> 2
  list.tail.tail.isInstanceOf[LinkedList[Int]] is true
  //> true
  list.tail.tail is Pair(3, Empty()) //> Pair(3,Empty())

  println("Question 8(b).") //> Question 8(b).

  list.length is 3 //> 3

  list(0) is 1 //> 1
  list.contains(1) is true //> true
  list.contains(4) is false //> false

  println("Question 8(c).") //> Question 8(c).

  case class Pair2[L, R](val left: L, val right: R)

  val pair = Pair2[String, Int]("hi", 2) //> pair  : session7.LinkedList.Pair2[String,Int] = Pair2(hi,2)

  pair.left is "hi" //> hi
  pair.right is 2 //> 2

  println("Question 9.") //> Question 9.

  trait Sum[A, B]

  case class Left[A, B](val value: A) extends Sum[A, B] {
  }

  case class Right[A, B](val value: B) extends Sum[A, B] {
  }

  Left[Int, String](1).value //> res0: Int = 1
  Right[Int, String]("foo").value //> res1: String = foo

  val sum: Sum[Int, String] = Right("foo") //> sum  : session7.LinkedList.Sum[Int,String] = Right(foo)

  sum match {
    case Left(x) => x.toString
    case Right(x) => x
  } //> res2: String = foo


}