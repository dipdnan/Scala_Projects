object Simple_Array {
  def main(args: Array[String]): Unit = {
    // Create an array of integers
    val numbers = Array(1, 2, 3, 4, 5)

    // Accessing elements of the array
    println("First element: " + numbers(0))
    println("Second element: " + numbers(1))

    // Modifying an element of the array
    numbers(2) = 10

    // Looping through the array
    println("All elements:")
    for (number <- numbers) {
      println(number)
    }
  }
}
