package session4

import com.atomicscala.AtomicTest._

object exercises {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(119); 
  println("Welcome to the Scala worksheet");$skip(173); 

  /*
 	=====================================================================
	REPL
	=====================================================================
*/
  val v1 = 17;System.out.println("""v1  : Int = """ + $show(v1 ));$skip(14); 
  println(v1);$skip(65); 

  // Can't reassign val
  // v1 = 20;

  var v2 = "ABC1234\"";System.out.println("""v2  : String = """ + $show(v2 ));$skip(14); 
  println(v2);$skip(21); 

  v2 = "DEF1234\"";$skip(14); 
  println(v2);$skip(239); 

  // Cannot assign Double to String
  //v2 = 15.56

  /*
  =====================================================================
	Expressions
	=====================================================================
*/
  var sky = "sunny";System.out.println("""sky  : String = """ + $show(sky ));$skip(16); 
  var temp = 81;System.out.println("""temp  : Int = """ + $show(temp ));$skip(73); 
  if (sky == "sunny" && temp > 80) println("Nice!") else println("Hmmm");$skip(19); 

  sky = "cloudy";$skip(12); 
  temp = 80;$skip(93); 
  if (sky == "sunny" || sky == "part cloud" && temp > 80) println("Ok") else println("Hmmm");$skip(23); 

  sky = "part cloud";$skip(13); 
  temp = 100;$skip(112); 
  if (sky == "sunny" || sky == "part cloud" && 20 > temp || temp > 80) println("Extreme!") else println("Hmmm");$skip(58); 

  def fahrenheitToCelsius(f: Double) = (f - 32) * 5 / 9;System.out.println("""fahrenheitToCelsius: (f: Double)Double""");$skip(28); val res$0 = 
  fahrenheitToCelsius(82.4);System.out.println("""res0: Double = """ + $show(res$0));$skip(56); 

  def celsiusToFahrenheit(f: Double) = f * 9 / 5 + 32;System.out.println("""celsiusToFahrenheit: (f: Double)Double""");$skip(26); val res$1 = 
  celsiusToFahrenheit(28);System.out.println("""res1: Double = """ + $show(res$1));$skip(227); 

  /*
  =====================================================================
	Methods
	=====================================================================
*/
  def getSquare[T](a: T)(implicit n: Numeric[T]) = n.times(a, a);System.out.println("""getSquare: [T](a: T)(implicit n: Numeric[T])T""");$skip(23); 
  val a = getSquare(3);System.out.println("""a  : Int = """ + $show(a ));$skip(17); 
  assert(a == 9);$skip(23); 
  val b = getSquare(6);System.out.println("""b  : Int = """ + $show(b ));$skip(18); 
  assert(b == 36);$skip(23); 
  val c = getSquare(5);System.out.println("""c  : Int = """ + $show(c ));$skip(18); 
  assert(c == 25);$skip(64); 

  def isArg1GreaterThanArg2(d1: Double, d2: Double) = d1 > d2;System.out.println("""isArg1GreaterThanArg2: (d1: Double, d2: Double)Boolean""");$skip(44); 
  val t1 = isArg1GreaterThanArg2(4.1, 4.12);System.out.println("""t1  : Boolean = """ + $show(t1 ));$skip(14); 
  assert(!t1);$skip(43); 
  val t2 = isArg1GreaterThanArg2(2.1, 1.2);System.out.println("""t2  : Boolean = """ + $show(t2 ));$skip(13); 
  assert(t2);$skip(51); 

  def manyTimesString(s: String, t: Int) = s * t;System.out.println("""manyTimesString: (s: String, t: Int)String""");$skip(37); 
  val m1 = manyTimesString("abc", 3);System.out.println("""m1  : String = """ + $show(m1 ));$skip(43); 
  assert("abcabcabc" == m1, "All is good");$skip(37); 
  val m2 = manyTimesString("123", 2);System.out.println("""m2  : String = """ + $show(m2 ));$skip(46); 
  assert("123123" == m2, "Your message here");$skip(196); 

  /*
  =====================================================================
	Classes and Objects
	=====================================================================
*/

  val r1 = (1 to 5);System.out.println("""r1  : scala.collection.immutable.Range.Inclusive = """ + $show(r1 ));$skip(10); val res$2 = 
  r1 step;System.out.println("""res2: Int = """ + $show(res$2));$skip(26); 
  val r2 = (6 to 12 by 2);System.out.println("""r2  : scala.collection.immutable.Range = """ + $show(r2 ));$skip(10); val res$3 = 
  r2 step;System.out.println("""res3: Int = """ + $show(res$3));$skip(21); 

  var s1 = "Sally";System.out.println("""s1  : String = """ + $show(s1 ));$skip(19); 
  var s2 = "Sally";System.out.println("""s2  : String = """ + $show(s2 ));$skip(88); 
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
  class Giraffe {};$skip(283); 

  val hippo1 = new Hippo;System.out.println("""hippo1  : session4.exercises.Hippo = """ + $show(hippo1 ));$skip(23); 
  val lion1 = new Lion;System.out.println("""lion1  : session4.exercises.Lion = """ + $show(lion1 ));$skip(25); 
  val tiger1 = new Tiger;System.out.println("""tiger1  : session4.exercises.Tiger = """ + $show(tiger1 ));$skip(27); 
  val monkey1 = new Monkey;System.out.println("""monkey1  : session4.exercises.Monkey = """ + $show(monkey1 ));$skip(29); 
  val giraffe1 = new Giraffe;System.out.println("""giraffe1  : session4.exercises.Giraffe = """ + $show(giraffe1 ));$skip(23); 
  val lion2 = new Lion;System.out.println("""lion2  : session4.exercises.Lion = """ + $show(lion2 ));$skip(29); 
  val giraffe2 = new Giraffe;System.out.println("""giraffe2  : session4.exercises.Giraffe = """ + $show(giraffe2 ));$skip(29); 
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
  };System.out.println("""giraffe3  : session4.exercises.Giraffe = """ + $show(giraffe3 ));$skip(501); 

  val sailboat = new Sailboat;System.out.println("""sailboat  : session4.exercises.Sailboat = """ + $show(sailboat ));$skip(29); 
  val sb1 = sailboat.raise();System.out.println("""sb1  : String = """ + $show(sb1 ));$skip(69); 
  assert(sb1 == "Sails raised", "Expected Sails raised, Got " + sb1);$skip(29); 
  val sb2 = sailboat.lower();System.out.println("""sb2  : String = """ + $show(sb2 ));$skip(71); 
  assert(sb2 == "Sails lowered", "Expected Sails lowered, Got " + sb2);$skip(34); 

  val motorboat = new Motorboat;System.out.println("""motorboat  : session4.exercises.Motorboat = """ + $show(motorboat ));$skip(27); 
  val mb1 = motorboat.on();System.out.println("""mb1  : String = """ + $show(mb1 ));$skip(61); 
  assert(mb1 == "Motor on", "Expected Motor on, Got " + mb1);$skip(28); 
  val mb2 = motorboat.off();System.out.println("""mb2  : String = """ + $show(mb2 ));$skip(63); 
  assert(mb2 == "Motor off", "Expected Motor off, Got " + mb2);$skip(26); 

  val flare = new Flare;System.out.println("""flare  : session4.exercises.Flare = """ + $show(flare ));$skip(23); 
  val f1 = flare.light;System.out.println("""f1  : String = """ + $show(f1 ));$skip(65); 
  assert(f1 == "Flare used!", "Expected Flare used!, Got " + f1);$skip(33); 

  val sailboat2 = new Sailboat;System.out.println("""sailboat2  : session4.exercises.Sailboat = """ + $show(sailboat2 ));$skip(34); 
  val signal = sailboat2.signal();System.out.println("""signal  : String = """ + $show(signal ));$skip(72); 
  assert(signal == "Flare used!", "Expected Flare used! Got " + signal);$skip(35); 

  val motorboat2 = new Motorboat;System.out.println("""motorboat2  : session4.exercises.Motorboat = """ + $show(motorboat2 ));$skip(35); 
  val flare2 = motorboat2.signal();System.out.println("""flare2  : String = """ + $show(flare2 ));$skip(73); 
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
  };$skip(612); 

  val cup = new Cup;System.out.println("""cup  : session4.exercises.Cup = """ + $show(cup ));$skip(20); 
  cup.add(45) is 45;$skip(21); 
  cup.add(-15) is 30;$skip(74); 
  // Now no longer valid
  //  cup.add(-50) is -20

  val cup2 = new Cup;System.out.println("""cup2  : session4.exercises.Cup = """ + $show(cup2 ));$skip(21); 
  cup2.add(45) is 45;$skip(21); 
  cup2.add(-55) is 0;$skip(21); 
  cup2.add(10) is 10;$skip(20); 
  cup2.add(-9) is 1;$skip(20); 
  cup2.add(-2) is 0;$skip(25); 

  cup.percentFull = 56;$skip(24); 
  cup.percentFull is 56;$skip(12); val res$4 = 

  cup.get;System.out.println("""res4: Int = """ + $show(res$4));$skip(14); val res$5 = 
  cup.set(22);System.out.println("""res5: Int = """ + $show(res$5));$skip(10); val res$6 = 
  cup.get;System.out.println("""res6: Int = """ + $show(res$6));$skip(189); 

  /*
  =====================================================================
	Vectors
	=====================================================================
*/

  val vc1 = Vector empty;System.out.println("""vc1  : scala.collection.immutable.Vector[Nothing] = """ + $show(vc1 ));$skip(28); 
  val vc2 = Vector(1, 2, 3);System.out.println("""vc2  : scala.collection.immutable.Vector[Int] = """ + $show(vc2 ));$skip(10); val res$7 = 
  vc2.sum;System.out.println("""res7: Int = """ + $show(res$7));$skip(10); val res$8 = 
  vc2.min;System.out.println("""res8: Int = """ + $show(res$8));$skip(10); val res$9 = 
  vc2.max;System.out.println("""res9: Int = """ + $show(res$9));$skip(34); 
  val vc3 = Vector(1.0, 2.0, 3.0);System.out.println("""vc3  : scala.collection.immutable.Vector[Double] = """ + $show(vc3 ));$skip(10); val res$10 = 
  vc3.sum;System.out.println("""res10: Double = """ + $show(res$10));$skip(10); val res$11 = 
  vc3.min;System.out.println("""res11: Double = """ + $show(res$11));$skip(10); val res$12 = 
  vc3.max;System.out.println("""res12: Double = """ + $show(res$12));$skip(34); 
  val vc4 = Vector('1', '2', '3');System.out.println("""vc4  : scala.collection.immutable.Vector[Char] = """ + $show(vc4 ));$skip(34); 
  val vc5 = Vector("1", "2", "3");System.out.println("""vc5  : scala.collection.immutable.Vector[String] = """ + $show(vc5 ));$skip(61); 
  val vc6 = Vector(Vector empty, Vector empty, Vector empty);System.out.println("""vc6  : scala.collection.immutable.Vector[scala.collection.immutable.Vector[Nothing]] = """ + $show(vc6 ));$skip(42); 
  val vc7 = Vector("one", "two", "three");System.out.println("""vc7  : scala.collection.immutable.Vector[String] = """ + $show(vc7 ));$skip(25); 
  vc7.foreach{ println }}

}
