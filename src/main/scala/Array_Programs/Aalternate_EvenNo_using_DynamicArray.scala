object Aalternate_EvenNo_using_DynamicArray {
def main(args:Array[String]):Unit={

   import scala.io.StdIn

   println("Enter the Array size:")
   val size = scala.io.StdIn.readInt()
   println(s"The Array are : $size")

   val arr = new Array[Int](size)
  println(s"Enter the Array elements: ")   //6
   for(i<-0 until size) {
      println(s"Enter the Array elements $i: ")   // 1,2,3,4,5,6
      arr(i)=StdIn.readInt()
   }

     println("The array alternative even no are: ")
     for(i<-0 until size )
     {
        if(arr(i)%2==0)
        {
          var cnt = arr(i) + 4     //arri = 1:2 =6; arri = 3:4=8; arri =5:6=10
          println(s"The Array elements are :$cnt")
        }
     }
}
}
/* Output :
Enter the Array size:
6
The Array are : 6
Enter the Array elements:
Enter the Array elements 0:
1
Enter the Array elements 1:
2
Enter the Array elements 2:
3
Enter the Array elements 3:
4
Enter the Array elements 4:
5
Enter the Array elements 5:
6
The array alternative even no are:
The Array elements are :6
The Array elements are :8
The Array elements are :10
 */