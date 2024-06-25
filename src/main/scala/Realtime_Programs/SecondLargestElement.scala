package Realtime_Programs
/* Write a Scala program to create a set and find the second largest element in the set. */
object SecondLargestElement {
  def main(args:Array[String]):Unit={

    val nums = List(10, 20, 30, 40, 50)

    // Use higher-order functions to find the second largest element
    val secondLargest1 = nums
      .sorted(Ordering[Int].reverse) // Sort the list in descending order
      .zipWithIndex // Create a list of tuples with each element and its index
      .filter(_._2 == 1) // Filter to get the element with index 1 (the second element in the sorted list)
      .map(_._1) // Extract the element from the tuple
      .headOption // Get the first element of the list if it exists

    // Define a function to find the second largest element using higher-order functions
    val secondLargest = nums
      .distinct // Remove duplicates, if any
      .foldLeft((Int.MinValue, Int.MinValue)) { case ((first, second), num) =>
        if (num > first) (num, first)
        else if (num > second && num != first) (first, num)
        else (first, second)
      }._2
    println(secondLargest)

    // Print the second largest element if it exists
    secondLargest1.foreach(println)
  }
}



