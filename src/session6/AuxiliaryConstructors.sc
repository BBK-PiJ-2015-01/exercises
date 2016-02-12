package session6

import com.atomicscala.AtomicTest._


object AuxiliaryConstructors {

  println("Question 12.")                         //> Question 12.

  class ClothesWasher() {

    var modelName = "Unknown"
    var capacity = 0.0

    def this(modelName: String) {
      this()
      this.modelName = modelName;
    }
    def this(capacity: Double) {
      this()
      this.capacity = capacity;
    }
    override def toString = s"${modelName} has capacity = ${capacity}"
  }

  var washer = new ClothesWasher()                //> washer  : session6.AuxiliaryConstructors.ClothesWasher = Unknown has capacit
                                                  //| y = 0.0
  println(washer)                                 //> Unknown has capacity = 0.0
  washer = new ClothesWasher("Zanussi")
  println(washer)                                 //> Zanussi has capacity = 0.0
  washer = new ClothesWasher(20)
  println(washer)                                 //> Unknown has capacity = 20.0

  println("Question 13.")                         //> Question 13.

  class ClothesWasher2(val modelName: String = "Unknown", val capacity: Double = 0.0) {

    override def toString = s"${modelName} has capacity = ${capacity}"
  }

  var washer2 = new ClothesWasher2()              //> washer2  : session6.AuxiliaryConstructors.ClothesWasher2 = Unknown has capac
                                                  //| ity = 0.0
  println(washer2)                                //> Unknown has capacity = 0.0
  washer2 = new ClothesWasher2(modelName="Zanussi", capacity=7)
  println(washer2)                                //> Zanussi has capacity = 7.0
}