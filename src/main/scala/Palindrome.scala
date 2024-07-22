/*Display Palindrome number */
object Palindrome {
  def main(args: Array[String]): Unit =
  {
    println("Enter any number :  ")
    val Original_number=scala.io.StdIn.readInt()
    var  a=Original_number
    var reminder =0;
    var sum=0;

    while (a>0)
    {
      reminder = a%10;
      sum = sum * 10 + reminder;
      a = a/10;
    }
    println(s"The Reverse number is :  $sum") // to dispaly the reverse number
    if (Original_number==sum)
    {
      println(s"The given number is Palindrome :  $Original_number" )
    }
    else
    {
      println(s"The given number is not Palindrome :   $Original_number")
    }
  }
}
/*Output :
Enter any number :
151
The Reverse number is :  151
The given number is Palindrome :  151
 */