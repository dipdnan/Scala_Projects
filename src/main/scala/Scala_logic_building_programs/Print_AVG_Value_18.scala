package Scala_logic_building_programs

object Print_AVG_Value_18 {
 def main(args:Array[String]):Unit={

   val start = 24
   val end = 100
   val step = 2

   // Calculate the sum of numbers
   val sum = (start to end by step).sum.toDouble

   // Calculate the average
   val count = ((end - start) / step) + 1
   val average = sum / count

   println(s"The average of the sequence is: $average")
 }
}
