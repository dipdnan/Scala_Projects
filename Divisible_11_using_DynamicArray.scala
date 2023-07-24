object Divisible_11_using_DynamicArray {
def main(args:Array[String]):Unit={

  import scala.io.StdIn

  println("Enter array size:")
  var size = StdIn.readInt()
  println(s"Array elements are: $size")

  val arr = new Array[Int](size)

  for(i<-0 until(size))
  {
    println(s"Enter array elements :${i}")
    arr(i)=StdIn.readInt()
  }

    for(i<-0 until(size))
      {
        if(arr(i)%11==0)
          {
            println(s"The array of index values $i disible by 11 are : ${arr(i)}")
          }
      }
  }
}
