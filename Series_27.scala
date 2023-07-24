package Scala_logic_building_programs

object Series_27 {
def main(args:Array[String]):Unit={

  val start = 1
  val end = 15
  var cnt =0

  for(i<-start to end){
    print(i+",")
    cnt = cnt + 1
    if(cnt%3==1){
      print("factor of three")
    }

  }
}
}
