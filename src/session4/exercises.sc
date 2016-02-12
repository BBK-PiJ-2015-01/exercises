package session4

import com.atomicscala.AtomicTest._

object exercises {
  println("Welcome to the Scala worksheet.")      //> Welcome to the Scala worksheet.
 
  /*
 	=====================================================================
	REPL
	=====================================================================
*/
  val v1 = 17                                     //> v1  : Int = 17
  println(v1)                                     //> 17

  // Can't reassign val
  // v1 = 20;

  var v2 = "ABC1234\""                            //> v2  : String = ABC1234"
  println(v2)                                     //> ABC1234"

  v2 = "DEF1234\""
  println(v2)                                     //> DEF1234"

  // Cannot assign Double to String
  //v2 = 15.56

  /*
  =====================================================================
	Expressions
	=====================================================================
*/
  var sky = "sunny"                               //> sky  : String = sunny
  var temp = 81                                   //> temp  : Int = 81
  if (sky == "sunny" && temp > 80) println("Nice!") else println("Hmmm")
                                                  //> Nice!

  sky = "cloudy"
  temp = 80
  if (sky == "sunny" || sky == "part cloud" && temp > 80) println("Ok") else println("Hmmm")
                                                  //> Hmmm

  sky = "part cloud"
  temp = 100
  if (sky == "sunny" || sky == "part cloud" && 20 > temp || temp > 80) println("Extreme!") else println("Hmmm")
                                                  //> Extreme!

  def fahrenheitToCelsius(f: Double) = (f - 32) * 5 / 9
                                                  //> fahrenheitToCelsius: (f: Double)Double
  fahrenheitToCelsius(82.4)                       //> res0: Double = 28.000000000000004

  def celsiusToFahrenheit(f: Double) = f * 9 / 5 + 32
                                                  //> celsiusToFahrenheit: (f: Double)Double
  celsiusToFahrenheit(28)                         //> res1: Double = 82.4

  /*
  =====================================================================
	Methods
	=====================================================================
*/
  def getSquare[T](a: T)(implicit n: Numeric[T]) = n.times(a, a)
                                                  //> getSquare: [T](a: T)(implicit n: Numeric[T])T
  val a = getSquare(3)                            //> a  : Int = 9
  assert(a == 9)
  val b = getSquare(6)                            //> b  : Int = 36
  assert(b == 36)
  val c = getSquare(5)                            //> c  : Int = 25
  assert(c == 25)

  def isArg1GreaterThanArg2(d1: Double, d2: Double) = d1 > d2
                                                  //> isArg1GreaterThanArg2: (d1: Double, d2: Double)Boolean
  val t1 = isArg1GreaterThanArg2(4.1, 4.12)       //> t1  : Boolean = false
  assert(!t1)
  val t2 = isArg1GreaterThanArg2(2.1, 1.2)        //> t2  : Boolean = true
  assert(t2)

  def manyTimesString(s: String, t: Int) = s * t  //> manyTimesString: (s: String, t: Int)String
  val m1 = manyTimesString("abc", 3)              //> m1  : String = abcabcabc
  assert("abcabcabc" == m1, "All is good")
  val m2 = manyTimesString("123", 2)              //> m2  : String = 123123
  assert("123123" == m2, "Your message here")

  /*
  =====================================================================
	Classes and Objects
	=====================================================================
*/

  val r1 = (1 to 5)                               //> r1  : scala.collection.immutable.Range.Inclusive = Range(1, 2, 3, 4, 5)
  r1 step                                         //> res2: Int = 1
  val r2 = (6 to 12 by 2)                         //> r2  : scala.collection.immutable.Range = Range(6, 8, 10, 12)
  r2 step                                         //> res3: Int = 2

  var s1 = "Sally"                                //> s1  : String = Sally
  var s2 = "Sally"                                //> s2  : String = Sally
  println(String.format("s1 and s2 are%sequal: ", if (s1.equals(s2)) " " else " NOT "))
                                                  //> s1 and s2 are equal: 
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

  val hippo1 = new Hippo                          //> hippo1  : session4.exercises.Hippo = session4.exercises$$anonfun$main$1$Hip
                                                  //| po$1@67b6d4ae
  val lion1 = new Lion                            //> lion1  : session4.exercises.Lion = session4.exercises$$anonfun$main$1$Lion$
                                                  //| 1@34b7bfc0
  val tiger1 = new Tiger                          //> tiger1  : session4.exercises.Tiger = session4.exercises$$anonfun$main$1$Tig
                                                  //| er$1@366e2eef
  val monkey1 = new Monkey                        //> monkey1  : session4.exercises.Monkey = session4.exercises$$anonfun$main$1$M
                                                  //| onkey$1@6df97b55
  val giraffe1 = new Giraffe                      //> giraffe1  : session4.exercises.Giraffe = session4.exercises$$anonfun$main$1
                                                  //| $Giraffe$1@3cbbc1e0
  val lion2 = new Lion                            //> lion2  : session4.exercises.Lion = session4.exercises$$anonfun$main$1$Lion$
                                                  //| 1@35fb3008
  val giraffe2 = new Giraffe                      //> giraffe2  : session4.exercises.Giraffe = session4.exercises$$anonfun$main$1
                                                  //| $Giraffe$1@7225790e
  val giraffe3 = new Giraffe                      //> giraffe3  : session4.exercises.Giraffe = session4.exercises$$anonfun$main$1
                                                  //| $Giraffe$1@54a097cc
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

  val sailboat = new Sailboat                     //> sailboat  : session4.exercises.Sailboat = session4.exercises$$anonfun$main$
                                                  //| 1$Sailboat$1@36f6e879
  val sb1 = sailboat.raise()                      //> sb1  : String = Sails raised
  assert(sb1 == "Sails raised", "Expected Sails raised, Got " + sb1)
  val sb2 = sailboat.lower()                      //> sb2  : String = Sails lowered
  assert(sb2 == "Sails lowered", "Expected Sails lowered, Got " + sb2)

  val motorboat = new Motorboat                   //> motorboat  : session4.exercises.Motorboat = session4.exercises$$anonfun$mai
                                                  //| n$1$Motorboat$1@5a61f5df
  val mb1 = motorboat.on()                        //> mb1  : String = Motor on
  assert(mb1 == "Motor on", "Expected Motor on, Got " + mb1)
  val mb2 = motorboat.off()                       //> mb2  : String = Motor off
  assert(mb2 == "Motor off", "Expected Motor off, Got " + mb2)

  val flare = new Flare                           //> flare  : session4.exercises.Flare = session4.exercises$$anonfun$main$1$Flar
                                                  //| e$1@3551a94
  val f1 = flare.light                            //> f1  : String = Flare used!
  assert(f1 == "Flare used!", "Expected Flare used!, Got " + f1)

  val sailboat2 = new Sailboat                    //> sailboat2  : session4.exercises.Sailboat = session4.exercises$$anonfun$main
                                                  //| $1$Sailboat$1@531be3c5
  val signal = sailboat2.signal()                 //> signal  : String = Flare used!
  assert(signal == "Flare used!", "Expected Flare used! Got " + signal)

  val motorboat2 = new Motorboat                  //> motorboat2  : session4.exercises.Motorboat = session4.exercises$$anonfun$ma
                                                  //| in$1$Motorboat$1@52af6cff
  val flare2 = motorboat2.signal()                //> flare2  : String = Flare used!
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

  val cup = new Cup                               //> cup  : session4.exercises.Cup = session4.exercises$$anonfun$main$1$Cup$1@73
                                                  //| 5b478
  cup.add(45) is 45                               //> 45
  cup.add(-15) is 30                              //> 30
  // Now no longer valid
  //  cup.add(-50) is -20

  val cup2 = new Cup                              //> cup2  : session4.exercises.Cup = session4.exercises$$anonfun$main$1$Cup$1@9
                                                  //| 7e1986
  cup2.add(45) is 45                              //> 45
  cup2.add(-55) is 0                              //> 0
  cup2.add(10) is 10                              //> 10
  cup2.add(-9) is 1                               //> 1
  cup2.add(-2) is 0                               //> 0

  cup.percentFull = 56
  cup.percentFull is 56                           //> 56

  cup.get                                         //> res4: Int = 56
  cup.set(22)                                     //> res5: Int = 22
  cup.get                                         //> res6: Int = 22

  /*
  =====================================================================
	Vectors
	=====================================================================
*/

  val vc1 = Vector empty                          //> vc1  : scala.collection.immutable.Vector[Nothing] = Vector()
  val vc2 = Vector(1, 2, 3)                       //> vc2  : scala.collection.immutable.Vector[Int] = Vector(1, 2, 3)
  vc2.sum                                         //> res7: Int = 6
  vc2.min                                         //> res8: Int = 1
  vc2.max                                         //> res9: Int = 3
  val vc3 = Vector(1.0, 2.0, 3.0)                 //> vc3  : scala.collection.immutable.Vector[Double] = Vector(1.0, 2.0, 3.0)
  vc3.sum                                         //> res10: Double = 6.0
  vc3.min                                         //> res11: Double = 1.0
  vc3.max                                         //> res12: Double = 3.0
  val vc4 = Vector('1', '2', '3')                 //> vc4  : scala.collection.immutable.Vector[Char] = Vector(1, 2, 3)
  val vc5 = Vector("1", "2", "3")                 //> vc5  : scala.collection.immutable.Vector[String] = Vector(1, 2, 3)
  val vc6 = Vector(Vector empty, Vector empty, Vector empty)
                                                  //> vc6  : scala.collection.immutable.Vector[scala.collection.immutable.Vector[
                                                  //| Nothing]] = Vector(Vector(), Vector(), Vector())
  val vc7 = Vector("one", "two", "three")         //> vc7  : scala.collection.immutable.Vector[String] = Vector(one, two, three)
  vc7.foreach{ println }                          //> one
                                                  //| two
                                                  //| three

}