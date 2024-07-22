object MergeAndSort {
def main(args:Array[String]):Unit={

  val l1 = List(1, 3, 5, 7, 11, 9)
  val l3 = List(2, 4, 6, 8, 12, 10)

  // Merge, remove duplicates, and sort the list
  val result = (l1 ++ l3).distinct.sorted

  println(result)
}
}
/* Output :
List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12)
 */