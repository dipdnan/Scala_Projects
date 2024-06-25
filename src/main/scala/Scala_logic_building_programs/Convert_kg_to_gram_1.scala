package Scala_logic_building_programs

object Convert_kg_to_gram_1 {
def main(args:Array[String]):Unit={
/*       1. Write a program to convert kg to g. (Input 56kg print in grams)      */
  /* dynamically way */
  println("Enter any no : ")
  val no = scala.io.StdIn.readDouble()

//  val no =10    // static way
  val gram = (no * 1000).toInt; // Convert the result to an integer if needed
  println(s"$no kg is equal to $gram grams.")
  scala.io.StdIn.readInt()
}
}
