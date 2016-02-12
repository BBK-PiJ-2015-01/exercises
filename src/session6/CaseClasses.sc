package session6

import com.atomicscala.AtomicTest._

object CaseClasses {
 
  println("Question 15.")                         //> Question 15.

  case class Person(val first: String, val last: String, val email: String) {
  }

  val p = Person("Jane", "Smile", "jane@smile.com")
                                                  //> p  : session6.CaseClasses.Person = Person(Jane,Smile,jane@smile.com)
  p.first is "Jane"                               //> Jane
  p.last is "Smile"                               //> Smile
  p.email is "jane@smile.com"                     //> jane@smile.com

  println("Question 16.")                         //> Question 16.

  val people = Vector(
    Person("Jane", "Smile", "jane@smile.com"),
    Person("Ron", "House", "ron@house.com"),
    Person("Sally", "Dove", "sally@dove.com"))    //> people  : scala.collection.immutable.Vector[session6.CaseClasses.Person] = V
                                                  //| ector(Person(Jane,Smile,jane@smile.com), Person(Ron,House,ron@house.com), Pe
                                                  //| rson(Sally,Dove,sally@dove.com))
    
  people(0) is "Person(Jane,Smile,jane@smile.com)"//> Person(Jane,Smile,jane@smile.com)
  people(1) is "Person(Ron,House,ron@house.com)"  //> Person(Ron,House,ron@house.com)
  people(2) is "Person(Sally,Dove,sally@dove.com)"//> Person(Sally,Dove,sally@dove.com)
}