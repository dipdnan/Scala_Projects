package Scala_logic_building_programs

object Convert_kg_to_gram_1 {
def main(args:Array[String]):Unit={

  /* dynamically way */
  println("Enter any no :")
  val no = scala.io.StdIn.readInt()

//   val no =10  // static way
  val gram = no * 1000;
  println(s"The gram in : $gram")
}
}
