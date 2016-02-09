package session4

import com.atomicscala.AtomicTest._

object exercises {
  println("Welcome to the Scala worksheet.")

  /*
 	=====================================================================
	REPL
	=====================================================================
*/
  val v1 = 17
  println(v1)

  // Can't reassign val
  // v1 = 20;

  var v2 = "ABC1234\""
  println(v2)

  v2 = "DEF1234\""
  println(v2)

  // Cannot assign Double to String
  //v2 = 15.56

  /*
  =====================================================================
	Expressions
	=====================================================================
*/
  var sky = "sunny"
  var temp = 81
  if (sky == "sunny" && temp > 80) println("Nice!") else println("Hmmm")

  sky = "cloudy"
  temp = 80
  if (sky == "sunny" || sky == "part cloud" && temp > 80) println("Ok") else println("Hmmm")

  sky = "part cloud"
  temp = 100
  if (sky == "sunny" || sky == "part cloud" && 20 > temp || temp > 80) println("Extreme!") else println("Hmmm")

  def fahrenheitToCelsius(f: Double) = (f - 32) * 5 / 9
  fahrenheitToCelsius(82.4)

  def celsiusToFahrenheit(f: Double) = f * 9 / 5 + 32
  celsiusToFahrenheit(28)

  /*
  =====================================================================
	Methods
	=====================================================================
*/
  def getSquare[T](a: T)(implicit n: Numeric[T]) = n.times(a, a)
  val a = getSquare(3)
  assert(a == 9)
  val b = getSquare(6)
  assert(b == 36)
  val c = getSquare(5)
  assert(c == 25)

  def isArg1GreaterThanArg2(d1: Double, d2: Double) = d1 > d2
  val t1 = isArg1GreaterThanArg2(4.1, 4.12)
  assert(!t1)
  val t2 = isArg1GreaterThanArg2(2.1, 1.2)
  assert(t2)

  def manyTimesString(s: String, t: Int) = s * t
  val m1 = manyTimesString("abc", 3)
  assert("abcabcabc" == m1, "All is good")
  val m2 = manyTimesString("123", 2)
  assert("123123" == m2, "Your message here")

  /*
  =====================================================================
	Classes and Objects
	=====================================================================
*/

  val r1 = (1 to 5)
  r1 step
  val r2 = (6 to 12 by 2)
  r2 step

  var s1 = "Sally"
  var s2 = "Sally"
  println(String.format("s1 and s2 are%sequal: ", if (s1.equals(s2)) " " else " NOT "))
  /*
  =====================================================================
	Creating Classes
	=====================================================================
*/
  class Hippo {}
  class Lion {}
  class Tiger {}
  class Monkey {}
  class Giraffe {}

  val hippo1 = new Hippo
  val lion1 = new Lion
  val tiger1 = new Tiger
  val monkey1 = new Monkey
  val giraffe1 = new Giraffe
  val lion2 = new Lion
  val giraffe2 = new Giraffe
  val giraffe3 = new Giraffe
  /*
  =====================================================================
	Methods inside classes
	=====================================================================
*/
  class Flare {

    def light = "Flare used!"
  }
  class Sailboat {

    def raise() = "Sails raised"
    def lower() = "Sails lowered"
    def signal() = new Flare light
  }
  class Motorboat {

    def on() = "Motor on"
    def off() = "Motor off"
    def signal() = new Flare light
  }

  val sailboat = new Sailboat
  val sb1 = sailboat.raise()
  assert(sb1 == "Sails raised", "Expected Sails raised, Got " + sb1)
  val sb2 = sailboat.lower()
  assert(sb2 == "Sails lowered", "Expected Sails lowered, Got " + sb2)

  val motorboat = new Motorboat
  val mb1 = motorboat.on()
  assert(mb1 == "Motor on", "Expected Motor on, Got " + mb1)
  val mb2 = motorboat.off()
  assert(mb2 == "Motor off", "Expected Motor off, Got " + mb2)

  val flare = new Flare
  val f1 = flare.light
  assert(f1 == "Flare used!", "Expected Flare used!, Got " + f1)

  val sailboat2 = new Sailboat
  val signal = sailboat2.signal()
  assert(signal == "Flare used!", "Expected Flare used! Got " + signal)

  val motorboat2 = new Motorboat
  val flare2 = motorboat2.signal()
  assert(flare2 == "Flare used!", "Expected Flare used!, Got " + flare2)
  /*
  =====================================================================
	Fields in classes
	=====================================================================
*/
  class Cup {
    var percentFull = 0
    val min = 0
    val max = 100
    def add(increase: Int): Int = {
      percentFull += increase
      if (percentFull > max) {
        percentFull = max
      }
      if (percentFull < min) {
        percentFull = min
      }
      percentFull // Return this value
    }
    def get = percentFull
    def set(pf: Int): Int = {
      percentFull = pf
      percentFull
    }
  }

  val cup = new Cup
  cup.add(45) is 45
  cup.add(-15) is 30
  // Now no longer valid
  //  cup.add(-50) is -20

  val cup2 = new Cup
  cup2.add(45) is 45
  cup2.add(-55) is 0
  cup2.add(10) is 10
  cup2.add(-9) is 1
  cup2.add(-2) is 0

  cup.percentFull = 56
  cup.percentFull is 56

  cup.get
  cup.set(22)
  cup.get

  /*
  =====================================================================
	Vectors
	=====================================================================
*/

  val vc1 = Vector empty
  val vc2 = Vector(1, 2, 3)
  vc2.sum
  vc2.min
  vc2.max
  val vc3 = Vector(1.0, 2.0, 3.0)
  vc3.sum
  vc3.min
  vc3.max
  val vc4 = Vector('1', '2', '3')
  val vc5 = Vector("1", "2", "3")
  val vc6 = Vector(Vector empty, Vector empty, Vector empty)
  val vc7 = Vector("one", "two", "three")
  vc7.foreach{ println }

}