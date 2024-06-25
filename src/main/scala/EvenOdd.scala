object EvenOdd {
  def main(args: Array[String]): Unit = {
    var s = ' '
    do {
      println("Enter any value : ")
      val a = scala.io.StdIn.readInt()
      if (a % 2 == 0) {
        println(s"The given no is even : ${a}")
      }
      else {
        println(s"The given no is odd : ${a}")
      }
      println("if you want to continue press 'y' otherwise 'n' :  ")
      s = scala.io.StdIn.readChar()

    } while (s == 'y' || s == 'Y')
  }

}
