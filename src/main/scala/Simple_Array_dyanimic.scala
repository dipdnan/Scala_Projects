object Simple_Array_dyanimic {
  def main(args: Array[String]): Unit = {

    // Ask the user for the length of the array
      println("Enter the Array size:")
    val size = scala.io.StdIn.readInt()

    //Define an empty array with the specified length 0 untill n-----0,1 ,2 3,4.9
    val arr =new  Array[Int](size)

    // Read values from the user and insert them into the array
    for (i <- 0 until size) {
      println(s"Enter element $i:")
      arr(i) = scala.io.StdIn.readInt()
    }

    //Print the contents of the array
    println("Array contents:")
    for (i <- 0 until size) {
      print(arr(i)+",")
    }
  }
}