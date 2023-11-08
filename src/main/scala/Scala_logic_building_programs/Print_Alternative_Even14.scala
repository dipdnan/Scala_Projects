package Scala_logic_building_programs
import scala.io.StdIn
object Print_Alternative_Even14 {
  def main(args: Array[String]): Unit = {

    val start = 1
    val end = 100


    println("The alternative even values are from 1 to 100 are ")
    for (no <- start to end by 2) {
      if (no % 2 == 0) {
        println(no)
      }
    }

  }
}