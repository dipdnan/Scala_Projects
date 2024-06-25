object Even_no_using_DynamicArray {
def main(args:Array[String]):Unit={

  import scala.io.StdIn

  // Ask the user for the length of the array
  println("Enter the Array size:")
  val size = StdIn.readInt()
  println(s"Size of Array is : $size")

  //Define an empty array with the specified length 0 untill n-----0,1 ,2 3,4.9

  val arr = new Array[Int](size)

  // Read values from the user and insert them into the array
    for(i<-0 until  size) {
      println(s"Enter Array element $i:")
      arr(i)=StdIn.readInt()
    }

  //Print the contents of the array
    println("Array contents are : ")
    for(i<-0 until size) {
      if(arr(i)%2==0)
      {
      println(s"Even nos are :${arr(i)}")
      }
    }
}
}
/* Output:
Enter the Array size:
5
Size of Array is : 5
Enter Array element 0:
1
Enter Array element 1:
2
Enter Array element 2:
3
Enter Array element 3:
4
Enter Array element 4:
5
Array contents are :
Even nos are :2
Even nos are :4
 */