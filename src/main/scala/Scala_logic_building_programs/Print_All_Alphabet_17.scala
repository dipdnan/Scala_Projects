package Scala_logic_building_programs

object Print_All_Alphabet_17 {
def main(args:Array[String]):Unit={

  println("All alphabets:")

  // Print lowercase alphabets
  for (c <- 'a' to 'z') {
    print(s"$c ")
  }

  // Print uppercase alphabets
  for (c <- 'A' to 'Z') {
    print(s"$c ")
  }
  scala.io.StdIn.readInt()
}
}
