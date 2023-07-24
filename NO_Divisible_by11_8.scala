package Scala_logic_building_programs

object NO_Divisible_by11_8 {
 def main(args:Array[String]):Unit = {

   println("Enter Any number :")
   val no = scala.io.StdIn.readInt()

   for (no <- 250 to 500) {
     if (no % 11 == 0) {
       print(no+",")  } }
 }
}
