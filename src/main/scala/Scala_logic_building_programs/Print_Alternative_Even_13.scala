package Scala_logic_building_programs

object Print_Alternative_Even_13 {
  def main(args: Array[String]): Unit = {

    //    println("Enter any value :")
    //    var no = scala.io.StdIn.readInt()
    val start = 20
    val end = 140
    //    var count = 0

    println("The alternative even from 20 to 140 are : ")
    for (no <- start to end by 4) { print(no+ ",")
//      if (no % 2 == 0)
//      {
//        println(no+ ",")
//      }
    }
  }
}