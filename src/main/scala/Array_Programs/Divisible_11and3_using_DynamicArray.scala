object Divisible_11and3_using_DynamicArray {
def main(args:Array[String]):Unit={

  import scala.io.StdIn
  println("Enter Array Size :")
  val size = StdIn.readInt()
  println(s"Array elements are :$size")

  val arr = new Array[Int](size)

  for(i<-0 until(size)){
    println(s"Enter Array elements: ${i}")
    arr(i)=StdIn.readInt()
    }

  for(i<-0 until(size)){
    if(arr(i)%3==0 && arr(i)%11==0){
      println(s"The array of index $i divisible by 3 & 11: ${arr(i)}")
    }
  }
}
}
/* Output :
Enter Array Size :
6
Array elements are :6
Enter Array elements: 0
18
Enter Array elements: 1
66
Enter Array elements: 2
20
Enter Array elements: 3
5
Enter Array elements: 4
00
Enter Array elements: 5
13
The array of index 1 divisible by 3 & 11: 66
The array of index 4 divisible by 3 & 11: 0
 */
