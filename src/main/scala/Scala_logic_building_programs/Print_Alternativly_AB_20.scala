package Scala_logic_building_programs

object Print_Alternativly_AB_20 {
 def main(args:Array[String]):Unit={

   val a_limit = 100
   for(i<-1 to a_limit) {
     if (i % 2 == 0) {
       println(i+ "==B")
     }
     else {
       println(i+ "==A")
     }
   }

 }
}
