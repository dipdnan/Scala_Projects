package Functions
object Odd_Indexs_Array {
def main(args:Array[String]):Unit={

  val first = 1
  val last = 100

    // Function to print the odd-indexed numbers
    def odd_indices(start: Int, end: Int): Unit = {
      for (i <- start to end if i % 2 != 0) {
        println(i)
      }
    }
  odd_indices(first,last)

//  def addOne(a: Int): Int = {
//    a + 1
//  }
//  val result = addOne(5) // result will be 6

}
}
