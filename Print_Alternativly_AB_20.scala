package Scala_logic_building_programs

object Print_Alternativly_AB_20 {
 def main(args:Array[String]):Unit={

   for(i<-1 to 100) {
     if (i % 2 == 0) {
       println("B")
     }
     else {
       println("A")
     }
   }

 }
}
