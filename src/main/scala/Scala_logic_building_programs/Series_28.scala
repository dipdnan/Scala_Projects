package Scala_logic_building_programs

object Series_28 {
def main(args:Array[String]):Unit={

  val start = 1
  val end = 23


  for (i <- start to end by 2)
  {
    if (i % 5 == 0) {
      print("factor of five" + ",")
    } else { print(i + ",") }
  }
  scala.io.StdIn.readInt()
}
}
