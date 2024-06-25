object Divisible_11_using_DynamicArray {
def main(args:Array[String]):Unit={

  import scala.io.StdIn
  println("Enter array size:")
  val size = StdIn.readInt()
  println(s"Array size is: $size")

  val arr = new Array[Int](size)

  for (i <- 0 until size) {
    println(s"Enter element at index $i:")
    arr(i) = StdIn.readInt()
  }

  println("Elements divisible by 11 and their indices:")
  for (i <- 0 until size) {
    if (arr(i) % 11 == 0) {
      println(s"Element at index $i divisible by 11: ${arr(i)}")
    }
  }
}
}
/* Output :
Enter array size:
5
Array size is: 5
Enter element at index 0:
50
Enter element at index 1:
44
Enter element at index 2:
30
Enter element at index 3:
22
Enter element at index 4:
69
Elements divisible by 11 and their indices:
Element at index 1 divisible by 11: 44
Element at index 3 divisible by 11: 22   */