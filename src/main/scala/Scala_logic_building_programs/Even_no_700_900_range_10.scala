package Scala_logic_building_programs

object Even_no_700_900_range_10 {
  def main(args: Array[String]): Unit = {

//    println("Enter any value between 700 to 900 :")
//    val value = scala.io.StdIn.readInt()

    for (value<- 700 to 900)
    {
      if (value % 2 == 0)
      {
        print(value+ ",")
      }
//    else
//      {
//        println("Invalid value")
//      }
    }
}
}
