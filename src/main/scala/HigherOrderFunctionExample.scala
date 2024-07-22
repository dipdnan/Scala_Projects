object HigherOrderFunctionExample {
  // Define a higher-order function that applies a given function to each element of a list
  def applyFunction(lst: List[Int], func: Int => Int): List[Int] = {
    lst.map(func)
  }

  // Define another function that uses the higher-order function
  def main(args: Array[String]): Unit = {
    val numbers = List(1, 2, 3, 4, 5)

    // Define a simple function to be used with the higher-order function
    val double = (x: Int) => x * 2

    // Use the higher-order function
    val doubledNumbers = applyFunction(numbers, double)

    // Print the result
    println(doubledNumbers) // Output: List(2, 4, 6, 8, 10)
  }
}
