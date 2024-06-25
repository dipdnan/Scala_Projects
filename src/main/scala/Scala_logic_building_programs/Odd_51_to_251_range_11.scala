package Scala_logic_building_programs

object Odd_51_to_251_range_11 {
 def main(args:Array[String]):Unit ={

   val start = 251
   val end = 51

   // Print all odd numbers from start to end in decreasing order
   for (number <- start to end by -2) {
     println(number)
   }
 }
}
