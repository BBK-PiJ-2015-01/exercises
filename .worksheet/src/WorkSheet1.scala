object WorkSheet1 {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(26); val res$0 = 

  42;System.out.println("""res0: Int(42) = """ + $show(res$0));$skip(7); val res$1 = 
  true;System.out.println("""res1: Boolean(true) = """ + $show(res$1));$skip(7); val res$2 = 
  123L;System.out.println("""res2: Long(123L) = """ + $show(res$2));$skip(7); val res$3 = 
  42.0;System.out.println("""res3: Double(42.0) = """ + $show(res$3));$skip(6); val res$4 = 
  'a';System.out.println("""res4: Char('a') = """ + $show(res$4));$skip(6); val res$5 = 
  "a";System.out.println("""res5: String("a") = """ + $show(res$5));$skip(16); val res$6 = 
  "Hello world";System.out.println("""res6: String("Hello world") = """ + $show(res$6));$skip(44); 
  println("Welcome to the Scala Worksheet");$skip(14); 

  val a = 1;System.out.println("""a  : Int = """ + $show(a ));$skip(12); 
  val b = 2;System.out.println("""b  : Int = """ + $show(b ));$skip(37); val res$7 = 
  if (a > b) "alien" else "predator";System.out.println("""res7: String = """ + $show(res$7));$skip(33); val res$8 = 

  if (a > b) "alien" else 2001;System.out.println("""res8: Any = """ + $show(res$8));$skip(22); val res$9 = 

  if (true) "hello";System.out.println("""res9: Any = """ + $show(res$9));$skip(14); val res$10 = 

  1 + 2 + 3;System.out.println("""res10: Int = """ + $show(res$10));$skip(4); val res$11 = 
  6

  object calc {

    def square(d: Double) = {
      d * d
    }

    def cube(d: Double) = {
      d * square(d)
    }
  };System.out.println("""res11: Int(6) = """ + $show(res$11));$skip(146); val res$12 = 

  calc.cube(13)

  object calc2 {

    def square[T](a: T)(implicit n: Numeric[T]) = n.times(a, a)

    def cube[T](a: T)(implicit n: Numeric[T]) = n.times(a, square(a))
  };System.out.println("""res12: Double = """ + $show(res$12));$skip(180); val res$13 = 

  calc2.cube(13);System.out.println("""res13: Int = """ + $show(res$13))}
}
