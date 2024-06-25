package Scala_logic_building_programs
import scala.io.StdIn
object Print_Alternative_Even14 {
  def main(args: Array[String]): Unit = {

    val start = 20
    val end = 140


    println("The alternative even values are from 1 to 100 are ")
    for (no <- start to end by 4) { print(no+ ",") }
    scala.io.StdIn.readInt()
  }
}