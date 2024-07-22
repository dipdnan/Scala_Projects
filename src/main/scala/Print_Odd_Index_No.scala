/* Display the odd index number from given array */
object Print_Odd_Index_No {
def main(args:Array[String]):Unit={

  val arr = Array(1,2,3,4,5,6,7,8,9,10)
//              0,1,2,3,4,5,6,7,8,9
  for(i<-arr)
    {
      if(i%2==1)
      {
        print(arr(i) + ", ")
      }
    }
}
}
/* Output :
2, 4, 6, 8, 10,
 */