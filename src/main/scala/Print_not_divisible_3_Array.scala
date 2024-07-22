/* Print the Values which is not divisible by 3 */
object Print_not_divisible_3_Array {
def main(args:Array[String]):Unit={

  val arr =Array(1,2,3,4,5,6,7,8,9)

  val l = arr.length
  println(s"length of Array is: ${l}")
  for(i <-0 until(l))
      if(arr(i) % 3 !=1)
      {
        print(i + ", ")
      }
}
}
/* Output :
length of Array is: 9
1, 2, 4, 5, 7, 8,
 */
