package Scala_logic_building_programs

object Print_Alternative_Even14 {
 def main(args:Array[String]):Unit={

   val start =22
   val end = 140

   println("The alternative even values are from 20 to 140 are ")
   for(no<- start to end by 4)
     {
       if(no%2==0)
         {
           println(no)
         }
     }
 }
}
