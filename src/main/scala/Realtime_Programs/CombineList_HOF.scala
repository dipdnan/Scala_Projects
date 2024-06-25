package Realtime_Programs
/*
Input : list[1,2,3]  with list[a,b,c]
Output : ['1-a','1-b','1-c','2-a','2-b','2-c','3-a','3-b','3-c']
 */
object CombineList_HOF {
def main(args:Array[String]):Unit={

  val list1 = List(1, 2, 3)
  val list2 = List("a", "b", "c")

  // Combine the lists using flatMap and map
  val combined = list1.flatMap(num => list2.map(char => s"$num-$char"))

  // Print the combined list
  println(combined)
}
}
