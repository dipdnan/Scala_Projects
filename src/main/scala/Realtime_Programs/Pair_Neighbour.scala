package Realtime_Programs
/*
Input :  val num = 6
Ouput :  List(List(2, 3), List(4, 5), List(6, 7))
 */
object Pair_Neighbour {
def main(args:Array[String]):Unit={

  val num = 6
  val answer = (1 to num).toList.map(x => x + 1).sliding(2, 2).toList
  
  println(answer)

//  val answer = (1 to num).toList.map(x => x + 1).grouped(2).toList
}
}
