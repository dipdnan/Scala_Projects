package Scala_logic_building_programs

object Count_Even_no_12 {
 def main(args:Array[String]):Unit ={

   val start = 700
   val end = 900
   var cnt = 0

   for(num <-700 to 900)
   {
     if (num % 2 == 0)
     {
       cnt = cnt + 1
     }
   }
println(s"The count even $start and $end : $cnt")
 }
}
