package session7

import com.atomicscala.AtomicTest._

object TraitsAndInheritance {

  println("Question 5(a).") //> Question 5(a).

  sealed trait Shape {

    def sides: Int
    def perimeter: Double
    def area: Double
  }

  case class Circle(val radius: Double) extends Shape {

    def sides: Int = 1
    def perimeter: Double = 2 * math.Pi * radius
    def area: Double = math.Pi * radius * radius

    override def toString: String = s"A circle of radius ${radius}cm "
  }

  val c = Circle(4) //> c  : session7#33.TraitsAndInheritance#403831.Circle#2886047 = A circle of ra
  //| dius 4.0cm 

  c.sides //> res0: Int#1163 = 1
  c.perimeter is 2 * math.Pi * c.radius //> 25.132741228718345
  c.area //> res1: Double#1679 = 50.26548245743669

  case class Square(val side: Double) extends Shape {

    def sides: Int = 4
    def perimeter: Double = side * sides
    def area: Double = side * side

    override def toString: String = s"A square with sides ${side}cm "
  }

  val s = Square(4) //> s  : session7#33.TraitsAndInheritance#403831.Square#2886052 = A square with 
  //| sides 4.0cm 

  s.sides is 4 //> 4
  s.perimeter is 16 //> 16.0
  s.area is 16 //> 16.0

  case class Rectangle(val width: Double, val height: Double) extends Shape {

    def sides: Int = 4
    def perimeter: Double = 2 * width + 2 * height
    def area: Double = width * height

    override def toString: String = s"A rectangle with width ${width}cm and height ${height}cm "
  }

  val r = Rectangle(10, 5) //> r  : session7#33.TraitsAndInheritance#403831.Rectangle#2886057 = A rectangl
  //| e with width 10.0cm and height 5.0cm 

  r.sides is 4 //> 4
  r.perimeter is 30 //> 30.0
  r.area is 50 //> 50.0

  println("Question 5(b).") //> Question 5(b).

  trait Rectangular extends Shape {

    def sides: Int = 4
  }
  case class RectangularSquare(val side: Double) extends Rectangular {

    def perimeter: Double = side * sides
    def area: Double = side * side
  }
  case class RectangularRectangle(val longSide: Double, val shortSide: Double) extends Rectangular {

    def perimeter: Double = 2 * longSide + 2 * shortSide
    def area: Double = longSide * shortSide
  }
  val rs = RectangularSquare(5) //> rs  : session7#33.TraitsAndInheritance#403831.RectangularSquare#2886063 = R
  //| ectangularSquare(5.0)
  rs.sides is 4 //> 4

  val rr = RectangularRectangle(8, 5) //> rr  : session7#33.TraitsAndInheritance#403831.RectangularRectangle#2886066 
  //| = RectangularRectangle(8.0,5.0)
  rr.sides is 4 //> 4

  println("Question 5(c).") //> Question 5(c).

  object Draw {

    def apply(s: Shape) = println(s)
  }

  Draw(Circle(6)) //> A circle of radius 6.0cm 
  Draw(Square(9)) //> A square with sides 9.0cm 
  Draw(Rectangle(5, 8)) //> A rectangle with width 5.0cm and height 8.0cm 

  println("Question 5(d).") //> Question 5(d).

  sealed trait Colour {

    def red: Double
    def green: Double
    def blue: Double

    def tone: String = if (red + green + blue > 380) "light" else "dark"
    def format: String = s"RGB(${red},${green},${blue})"
  }

  trait Red extends Colour {

    def red: Double = 255
    def green: Double = 0
    def blue: Double = 0

  }

  trait Yellow extends Colour {

    def red: Double = 255
    def green: Double = 255
    def blue: Double = 0
  }

  trait Pink extends Colour {

    def red: Double = 230
    def green: Double = 178
    def blue: Double = 237
  }

  case class RedSquare(val side: Double) extends Shape with Red {

    def sides: Int = 4
    def perimeter: Double = side * sides
    def area: Double = side * side

    override def toString: String = s"A ${tone} square with sides ${side}cm. Colour=${format} "

  }
  case class PinkCircle(val radius: Double) extends Shape with Pink {

    def sides: Int = 1
    def perimeter: Double = 2 * math.Pi * radius
    def area: Double = math.Pi * radius * radius

    override def toString: String = s"A ${tone} circle of radius ${radius}cm. Colour=${format} "
  }

  Draw(RedSquare(6)) //> A dark square with sides 6.0cm. Colour=RGB(255.0,0.0,0.0) 
  Draw(PinkCircle(6)) //> A light circle of radius 6.0cm. Colour=RGB(230.0,178.0,237.0) 

  println("Question 6.") //> Question 6.

  sealed trait DivisionResult {
  }

  case class Finite(val result: Int) extends DivisionResult {

  }
  object Infinite extends DivisionResult {
  }

  object divide {

    def apply(x: Int, y: Int): DivisionResult = if (y == 0) Infinite else Finite(x / y)
  }

  divide(1, 0) is Infinite //> session7.TraitsAndInheritance$$anonfun$main$1$Infinite$2$@6537cf78
  divide(4, 2) is Finite(2) //> Finite(2)

  def sensibleDivide(x: Int, y: Int): String = divide(x, y) match {
    case Infinite => "Attempt to divide by zero"
    case Finite(n) => s"Integer result is ${n}"
  } //> sensibleDivide: (x#2887137: Int#1163, y#2887138: Int#1163)String#1485375

  sensibleDivide(1, 0) is "Attempt to divide by zero"
  //> Attempt to divide by zero
  sensibleDivide(4, 2) is "Integer result is 2" //> Integer result is 2

  println("Question 7.")

  trait Publication {
  }
  case class Manuscript(val author: String, val length:Int) {
  } 
  case class Book(val author: String) extends Publication with Manuscript {
  }
  case class Periodical(val editor: String) extends Publication {
  }
}