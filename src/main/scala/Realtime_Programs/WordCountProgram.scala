package Realtime_Programs
/* Input :val nmlist = List("suraj","prasad",
                           "suraj","kumar",
                             "kumar","mahesh",
                             "kumar")
Output :kumar 3
        suraj 2
        prasad 1
        mahesh 1
 */
object WordCountProgram {
def main(args:Array[String]):Unit={

  val nmlist = List("suraj", "prasad", "suraj", "kumar", "kumar", "mahesh", "kumar")

  // Count occurrences of each name
  val nameCounts = nmlist
    .groupBy(identity) // Group by each name
    .map { case (name, occurrences) => (name, occurrences.size) } // Map to name and its count
    .toList // Convert to list for sorting
    .sortBy { case (_, count) => -count } // Sort by count in descending order

  // Print the result
  nameCounts.foreach { case (name, count) => println(s"$name $count") }
}
}
