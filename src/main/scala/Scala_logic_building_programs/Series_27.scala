package Scala_logic_building_programs

object Series_27 {
def main(args:Array[String]):Unit={

  val start = 1
  val end = 23


  for(i<-start to end){
     if(i%3==0){
      print("factor of three"+ ",")
    } else {
       print(i+",")
     }

  }
}
}
