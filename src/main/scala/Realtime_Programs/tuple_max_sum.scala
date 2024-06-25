package Realtime_Programs

object tuple_max_sum {
def main(args:Array[String]):Unit={

  val tupleList = List((23, 42), (56, 76), (78, 65))

  // Swap the elements of each tuple
  val swappedTuples = tupleList.map { case (a, b) => (b, a) }

  // Find the tuple with the maximum sum
  val maxSumTuple = swappedTuples.maxBy { case (a, b) => a + b }

  println(maxSumTuple) // Output: (78,65)
}
}

/* Output :
(65,78)
 */