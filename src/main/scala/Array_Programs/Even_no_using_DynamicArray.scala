object Even_no_using_DynamicArray {
def main(args:Array[String]):Unit={

  import scala.io.StdIn

  // Ask the user for the length of the array
  println("Enter the Array size:")
  val a = StdIn.readInt()
  println(s"Size of Array is : $a")

  //Define an empty array with the specified length 0 untill n-----0,1 ,2 3,4.9

  val arr = new Array[Int](a)

  // Read values from the user and insert them into the array
    for(i<-0 until  a) {
      println(s"Enter Array element $i:")
      arr(i)=StdIn.readInt()
    }

  //Print the contents of the array
    println("Array contents are : ")
    for(i<-0 until a) {
      if(arr(i)%2==0)
      {
      println(s"Even nos are :${arr(i)}")
      }
    }

}
}
