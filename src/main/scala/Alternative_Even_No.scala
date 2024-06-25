import scala.io.StdIn
object Alternative_Even_No {
  def main(args:Array[String]):Unit={

    println("Enter array size: ")
    val size = scala.io.StdIn.readInt()
    println(s"The array element size is: $size")
    val start = 0
//    val end = 100

    println("The alternative even values are from 1 to 100 are:")
    for (i <- start to size)
    {
      if (i % 2 == 0)
      {
        println(i)
      }
    }

  }
}
/* Output:
Enter array size:
5
The array element size is: 5
The alternative even values are from 1 to 100 are:
0
2
4
 */

