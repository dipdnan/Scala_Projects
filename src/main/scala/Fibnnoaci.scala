object Fibnnoaci {
  def main(args: Array[String]): Unit = {
    val limit = 10 // Change this value to set the limit of the series

    println("Fibonacci Series:")
    for (i <- 0 until limit) {
      val fibonacciNumber = fibonacci(i)
      println(fibonacciNumber+ ",")
    }
  }

  def fibonacci(n: Int): Int = {
    if (n <= 1)
      n
    else
      fibonacci(n - 1) + fibonacci(n - 2)
  }
}
