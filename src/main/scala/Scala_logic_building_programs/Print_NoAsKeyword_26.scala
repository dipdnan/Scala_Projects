package Scala_logic_building_programs

object Print_NoAsKeyword_26 {
def main(args:Array[String]):Unit={

  val first = 1
  val end = 35

  for(i<-1 to end){
    if(i%2==1){
      print(i+",")
    }
    else {
      print("Even"+",")
    }
  }
}
}
