package session6

import com.atomicscala.AtomicTest._

object ClassArguments {
 
  println("Question 3.")                          //> Question 3.

  class Family(val names: String*) {

    def familySize() = names length
  }
  
  val family1 = new Family("Mum", "Dad", "Sally", "Dick")
                                                  //> family1  : session6.ClassArguments.Family = session6.ClassArguments$$anonfun
                                                  //| $main$1$Family$1@64616ca2
  family1.familySize() is 4                       //> 4
  val family2 = new Family("Dad", "Mom", "Harry") //> family2  : session6.ClassArguments.Family = session6.ClassArguments$$anonfun
                                                  //| $main$1$Family$1@2ef9b8bc
  family2.familySize() is 3                       //> 3

  println("Question 4.")                          //> Question 4.

  class FlexibleFamily(val parent1: String, val paent2: String, val children: String*) {

    def familySize() = 2 + children.length
  }

  val family3 = new FlexibleFamily("Mum", "Dad", "Sally", "Dick")
                                                  //> family3  : session6.ClassArguments.FlexibleFamily = session6.ClassArguments$
                                                  //| $anonfun$main$1$FlexibleFamily$1@5d624da6
  family3.familySize() is 4                       //> 4
  val family4 = new FlexibleFamily("Dad", "Mom", "Harry")
                                                  //> family4  : session6.ClassArguments.FlexibleFamily = session6.ClassArguments$
                                                  //| $anonfun$main$1$FlexibleFamily$1@1e67b872
  family4.familySize() is 3                       //> 3

  println("Question 5.")                          //> Question 5.

  def squareThem(ints: Int*) = {

    var result = 0
    ints.foreach(i => result += i * i)
    result
  }                                               //> squareThem: (ints: Int*)Int
  squareThem(2) is 4                              //> 4
  squareThem(2, 4) is 20                          //> 20
  squareThem(1, 2, 4) is 21                       //> 21
}