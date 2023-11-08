import scala.collection.mutable.HashSet

object Duplicate_no_using_Array {

  def main(args:Array[String]):Unit={

    val arr = Array(1,1,5,6,7,2,8,9,2)
   var len = arr.length
    for (i <- 0 until len) {
      for (j <- i + 1 until len) {
        if (arr(i) == arr(j)) {
          println(s"Duplicate Record: ${arr(j)}")
      }}}



  }
  }

