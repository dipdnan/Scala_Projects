package Realtime_Programs
/*
Input :   val list = List(1, 2, 2, 4)
Output : List(2,3)
 */
object FindDuplicatesAndIncrement {
def main(args:Array[String]):Unit={
  val list = List(1, 2, 2, 4)

  // Define a function to increment the second occurrence of an element
  def incrementSecondOccurrence(list: List[Int], target: Int): List[Int] = {
    list
      .scanLeft((Option.empty[Int], List.empty[Int])) { case ((state, acc), num) =>
        state match {
          case Some(`target`) if num == target => (None, acc :+ (num + 1))
          case _ => (if (num == target) Some(target) else state, acc :+ num)
        }
      }
      .last._2
  }

  // Apply the function to the list
  val modifiedList = incrementSecondOccurrence(list, 2)

  // Extract and print the unique elements
  val result = modifiedList.distinct.filter(_ == 2).map(_ + 1)
  println(result)
}
}
