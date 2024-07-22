object SecondSmallestNumber {
  def main(args: Array[String]): Unit = {
    val arr = Array(5, 1, 9, 3, 2, 7, 4)

    // Finding the smallest element
    val smallest = arr.min

    // Finding the second smallest element by filtering out the smallest element
    val secondSmallest = arr.filter(_ != smallest).min

    println(s"Smallest element: $smallest")
    println(s"Second smallest element: $secondSmallest")
  }
}
