/* Print Even number from Array Elements */
object Print_Even_no_using_Array {
def main(args:Array[String]):Unit={

  val arr = Array(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
  //                0,1,2,3,4,5,6,7,8,9

  val length = arr.length
  println(s"The number of Array element is $length")
  for (i <- 0 until length)
  {
    if (arr(i) % 4 == 0)
    {
      print(arr(i) + ", ")
    }
  }
}
}
/* Output :
The number of Array element is 10
4, 8,
 */
