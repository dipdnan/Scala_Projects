package Scala_logic_building_programs

object Odd_51_to_251_range_11 {
 def main(args:Array[String]):Unit ={

   println("Enter value between 51 to 251:")
   var value = scala.io.StdIn.readInt()

   for(value <-51 to 251)
     {
       if(value%2==1)
         {
           println(value)
         }

     }
 }
}
