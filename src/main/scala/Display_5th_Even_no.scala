import scala.Byte.MaxValue.==

object Display_5th_Even_no {
  def main(args: Array[String]): Unit =
  {
    var cnt=1
    for (cnt <- 1 to 20)
    {
      cnt == 5
      println(s"5th even no is : $cnt")
    }
      var num =1
      if(num%2 ==0)
        {
          println(num)
          num=num+2;
        }
        num=num+1;
    }
  }


