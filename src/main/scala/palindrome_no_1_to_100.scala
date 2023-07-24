object palindrome_no_1_to_100 {
  def main(args: Array[String]): Unit = {

    println("Palindrome numbers are:")
    for (i <- 1 to 100) {
    var n = i
    var a = n
    var rev = 0

    while (a > 0) {
      val rem = a % 10
      rev = rev * 10 + rem
      a = a / 10
    }

    if (n == rev)
    {
      println(n)
    }
  }

  }
}

