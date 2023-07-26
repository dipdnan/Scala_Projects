package Functions

object Using_Array {
def main(args:Array[String]):Unit={

  // odd indices - 2,4,6,8,10
  val arr = Array(1,3,3,4,5,7,7,8,9,11)
  //              0 1 2 3 4 5 6 7 8 9   index

  val size = arr.length
  fun1(arr,size)

  def fun1(a:Array[Int],b:Int): Unit = {
    for(i<-0 to b){
      if(i%2==0 || i%2==1) {
        println(a(i))  //1,3
      }
    }

  }
}
}
