object simple_palindrome {
  def main(args: Array[String]): Unit =
  {
    var s = ' '
    do {
      println("Enter any value : ")
      var o_value = scala.io.StdIn.readInt();
      var a = o_value;
      var reminder = 0;
      var sum = 0;

      while (a > 0) {
        reminder = a % 10;
        sum = sum * 10 + reminder;
        a = a / 10;
      }
      if (o_value == sum) {
        println(s"The given number is Palindrome : $o_value")
      }
      else {
        println(s"The given no is not palindrome : $o_value")
      }
      println("If you want to continue press 'y' otherewise 'n': ")
      s = scala.io.StdIn.readChar()

    } while(s == 'y'|| s== 'Y')
  }
}
