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
