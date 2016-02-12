package session6

import com.atomicscala.AtomicTest._
 
object PatternMatching {

  println("Question 1.")                          //> Question 1.

  object Forecaster {

    def forecast(temp: Int): String =
      temp match {
        case 100 => "Sunny"
        case 80 => "Mostly Sunny"
        case 50 => "Partly Sunny"
        case 20 => "Mostly Cloudy"
        case 0 => "Cloudy"
        case _ => "Unknown"
      }
  }
  Forecaster.forecast(100) is "Sunny"             //> Sunny
  Forecaster.forecast(80) is "Mostly Sunny"       //> Mostly Sunny
  Forecaster.forecast(50) is "Partly Sunny"       //> Partly Sunny
  Forecaster.forecast(20) is "Mostly Cloudy"      //> Mostly Cloudy
  Forecaster.forecast(0) is "Cloudy"              //> Cloudy
  Forecaster.forecast(15) is "Unknown"            //> Unknown

  println("Question 2.")                          //> Question 2.
  
  val vTemps = Vector((100, "Sunny"), (80, "Mostly Sunny"), (50, "Partly Sunny"), (20, "Mostly Cloudy"), (0, "Cloudy"), (15, "Unknown"))
                                                  //> vTemps  : scala.collection.immutable.Vector[(Int, String)] = Vector((100,Sun
                                                  //| ny), (80,Mostly Sunny), (50,Partly Sunny), (20,Mostly Cloudy), (0,Cloudy), (
                                                  //| 15,Unknown))

  for (t <- vTemps) {
    Forecaster.forecast(t._1) is t._2             //> Sunny
                                                  //| Mostly Sunny
                                                  //| Partly Sunny
                                                  //| Mostly Cloudy
                                                  //| Cloudy
                                                  //| Unknown
  }
}