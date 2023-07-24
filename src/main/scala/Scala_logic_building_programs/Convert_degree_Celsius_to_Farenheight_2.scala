package Scala_logic_building_programs

object Convert_degree_Celsius_to_Farenheight_2 {
def main(args:Array[String]):Unit={

  println("Enter Any Value : ")
  val cel = scala.io.StdIn.readInt()
  val far = (cel * 9/5) + 32
  println(s"The given $cel^C is converted into : $far^F ")
}
}
