/*Display Palindrome number from 1 to 100*/
object palindrome_no_1_to_100 {
  def main(args: Array[String]): Unit = {

    for (i <- 1 to 100)
    {
        var original_no = i
        var reminder = 0;
        var sum = 0;

      while (original_no >0)
    {
      reminder = original_no % 10;
      sum = sum * 10 + reminder;
      original_no = original_no / 10;
    }

     if(i==sum)
     {
       print(i+ ", ") // to dispaly the palindrome number
     }
    }
  }
}

