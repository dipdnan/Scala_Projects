package Scala_logic_building_programs

object Series_23 {
 def main(args:Array[String]):Unit={

  val start = 5
  val end  = 25

  for(i<-start to end){

   if(i%2==1){

    print(i+"^2,")
   }
  }
 }
}
