object Aalternate_EvenNo_using_DynamicArray {
def main(args:Array[String]):Unit={

   import scala.io.StdIn

   println("Enter the Array size:")
   val size = scala.io.StdIn.readInt()
   println(s"The Array are : $size")

   val arr = new Array[Int](size)

  println(s"Enter the Array elements: ")
   for(i<-0 until size) {
//      println(s"Enter the Array elements $i: ")
      arr(i)=StdIn.readInt()
   }


     println("The array alternative even no are: ")
     for(i<-0 until size )
     {
        if(arr(i)%2==0)
        {

          var cnt = arr(i) + 4
          println(s"The Array elements are :$cnt")
        }
//           cnt = + arr(i)

     }
}
}
