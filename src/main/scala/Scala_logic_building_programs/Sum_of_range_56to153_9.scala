package Scala_logic_building_programs

object Sum_of_range_56to153_9 {
 def main(args:Array[String]):Unit= {
      val start = 56
      val end = 153

       // Calculate the sum of numbers from start to end
       val sum = (start to end).sum
       println(s"The sum of numbers from $start to $end is: $sum")
   scala.io.StdIn.readInt()
 }
}
