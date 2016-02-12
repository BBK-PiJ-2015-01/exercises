package session6
 
import com.atomicscala.AtomicTest._

object NamedAndDefaultArguments {

  println("Question 6.")                          //> Question 6.

  class SimpleTime(val hours: Int, val minutes: Int) {
  }

  val t = new SimpleTime(hours = 5, minutes = 30) //> t  : session6.NamedAndDefaultArguments.SimpleTime = session6.NamedAndDefault
                                                  //| Arguments$$anonfun$main$1$SimpleTime$1@64616ca2
  t.hours is 5                                    //> 5
  t.minutes is 30                                 //> 30

  println("Question 7.")                          //> Question 7.

  class SimpleTime2(val hours: Int, val minutes: Int = 0) {
  }

  val t2 = new SimpleTime2(hours = 10)            //> t2  : session6.NamedAndDefaultArguments.SimpleTime2 = session6.NamedAndDefau
                                                  //| ltArguments$$anonfun$main$1$SimpleTime2$2@2ef9b8bc
  t2.hours is 10                                  //> 10
  t2.minutes is 0                                 //> 0

  println("Question 8.")                          //> Question 8.

  class Planet(val name: String, val description: String, moons: Int = 0) {

    def hasMoon = moons > 0
  }

  val p = new Planet(name = "Mercury", description = "small and hot planet", moons = 0)
                                                  //> p  : session6.NamedAndDefaultArguments.Planet = session6.NamedAndDefaultArgu
                                                  //| ments$$anonfun$main$1$Planet$2@5d624da6
  p.hasMoon is false                              //> false

  println("Question 9.")                          //> Question 9.
  println("Planet class was not changed.")        //> Planet class was not changed.
  val earth = new Planet(moons = 1, name = "Earth",
    description = "a hospitable planet")          //> earth  : session6.NamedAndDefaultArguments.Planet = session6.NamedAndDefault
                                                  //| Arguments$$anonfun$main$1$Planet$2@1e67b872
  earth.hasMoon is true                           //> true

  println("Question 10.")                         //> Question 10.

  class Item(val name: String, val price: Double) {

    def cost(grocery: Boolean = false, medication: Boolean = false, taxRate: Double = 0.1) = { if (grocery || medication) price else price * (1 + taxRate) }
  }
  val flour = new Item(name = "flour", 4)         //> flour  : session6.NamedAndDefaultArguments.Item = session6.NamedAndDefaultA
                                                  //| rguments$$anonfun$main$1$Item$1@60addb54
  flour.cost(grocery = true) is 4                 //> 4.0
  val sunscreen = new Item(name = "sunscreen", 3) //> sunscreen  : session6.NamedAndDefaultArguments.Item = session6.NamedAndDefa
                                                  //| ultArguments$$anonfun$main$1$Item$1@3f2a3a5
  sunscreen.cost() is 3.3                         //> 3.3000000000000003
                                                  //| [Error] expected:
                                                  //| 3.3
  val tv = new Item(name = "television", 500)     //> tv  : session6.NamedAndDefaultArguments.Item = session6.NamedAndDefaultArgu
                                                  //| ments$$anonfun$main$1$Item$1@614c5515
  println("Changed test case to use 'taxRate' instead of 'rate'.")
                                                  //> Changed test case to use 'taxRate' instead of 'rate'.
  tv.cost(taxRate = 0.06) is 530                  //> 530.0

}