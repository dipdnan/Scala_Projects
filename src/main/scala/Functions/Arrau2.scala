package Functions

object Arrau2 {
def main(args:Array[String]):Unit={

//  val arr = Array(1,2,3,4,5)
//  val size = arr.length


  // while loop example
//  var i =1     // 0 1 2 3 4
//  val arr = Array(1,2,3,4,5)
//  val size = arr.length    // size will be 4
//
//  while(arr(i)<=size){  // if if i<=size - 1,2,3,4,5  if arr(i)<size -- 1,2,3,4 bz array size is 4
//    println(s"Entered value of i = $i") // current value
//    i +=1          // incremented value by +1
//  }


// Array elements can accessed
  val a = Array(1,2,3,4,5)
   val size = a.length

  def fun1(a: Array[Int]): Unit = {

    for (i <- 0 until size) {
      println(a(i))             // a(i) is the array elements value 1,2,3,4,5
    }     // i means index value like 0,1,2,3,4
  }
    fun1(a)

  // sample program for do while loop in scala
//    var i =0
//    val arr = Array(1,2,3,4,5)
//    val size = arr.length
//    do {
//      println(s"The given value $i")
//      i += 1
//    }
//    while (arr(i)<=size)  // i = 0,1,2,3,4,5   arr(i)= 0,1,2,3,4
}
}
