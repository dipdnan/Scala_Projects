package Scala_logic_building_programs

object Range_No_Assign_Grade_5 {
  def main(args:Array[String]):Unit ={

    println(s"Enter Any number: ")
    val no = scala.io.StdIn.readInt()

    if(!(no >=0 && no <=100)){
        println(s"The Given $no is an Invalid input") }
    else if(no >90 && no <=100){
        println(s"Super Smart") }
    else if (no > 80 && no <= 90) {
      println(s"Smart") }
    else if (no > 70 && no <= 80) {
      println(s"Smart Enough") }
    else if (no > 60 && no <= 70) {
      println(s"Just Smart")  }
    else if (no > 35 && no <= 60) {
      println(s"No Smart")  }
    else if (no > 0 && no <= 35) {
      println(s"DUMP") }
    }


}
