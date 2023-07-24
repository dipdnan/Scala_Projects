package Scala_logic_building_programs

object Print_AVG_Value_18 {
 def main(args:Array[String]):Unit={

   val start = 1
   val end = 10
   var sum = 0
   var count = 0

   for(num <-start to end) {
     sum = num +1  //1,2,3,4,5,6,7,8,9,10,11
     count = count +1  // 1,2,3,4,5,6,7,8,9,10
   }
   // val sum1 = scala.io.StdIn.readDouble()
   val avg = sum.toDouble/count  //  55/10  == 5.5
   println(s"The average value from $start to $end is: $avg")
 }
}
