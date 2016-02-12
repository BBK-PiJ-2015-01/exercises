package session6

import com.atomicscala.AtomicTest._
 
object Constructors {

  println("Question 11.")                         //> Question 11.

  class Tea(val name: String = "Earl Grey", val decaf: Boolean = false, val sugar: Boolean = false, val milk: Boolean = false) {

    def describe = s"${name}${if (decaf) " decaf" else ""}${if (milk) " + milk" else ""}${if (sugar) " + sugar" else ""}"
    def calories = (if (sugar) 16 else 0) + (if (milk) 100 else 0)

  }

  val tea = new Tea                               //> tea  : session6.Constructors.Tea = session6.Constructors$$anonfun$main$1$Tea
                                                  //| $2@64616ca2
  tea.describe is "Earl Grey"                     //> Earl Grey
  tea.calories is 0                               //> 0

  val lemonZinger = new Tea(decaf = true, name = "Lemon Zinger")
                                                  //> lemonZinger  : session6.Constructors.Tea = session6.Constructors$$anonfun$ma
                                                  //| in$1$Tea$2@6615435c
  lemonZinger.describe is "Lemon Zinger decaf"    //> Lemon Zinger decaf
  lemonZinger.calories is 0                       //> 0

  val sweetGreen = new Tea(name = "Jasmine Green", sugar = true)
                                                  //> sweetGreen  : session6.Constructors.Tea = session6.Constructors$$anonfun$mai
                                                  //| n$1$Tea$2@4909b8da
  sweetGreen.describe is "Jasmine Green + sugar"  //> Jasmine Green + sugar
  sweetGreen.calories is 16                       //> 16
  
  val teaLatte = new Tea(sugar=true, milk=true)   //> teaLatte  : session6.Constructors.Tea = session6.Constructors$$anonfun$main$
                                                  //| 1$Tea$2@3a03464
teaLatte.describe is "Earl Grey + milk + sugar"   //> Earl Grey + milk + sugar
teaLatte.calories is 116                          //> 116
}