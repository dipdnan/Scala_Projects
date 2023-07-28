package Functions

object Function_simple_practice {
def main(args:Array[String]):Unit={

  def square(a: Int): Int = {
    a * a
  }
  val b =square(12)
  println(b)

//  def seq (v_seq : Int):Int={
//   v_seq + 1
//  }
//  val result =seq(0)
//  println(result)

  val numbers = List(50,10,100,45,40,250,200)

  // Step 1: Sort the list in ascending order
  val sorted = numbers.sorted
  println(s"The sorted number : $sorted")

  // Step 2: Use zipWithIndex to get a list of tuples (element, index)
  val indexedno = sorted.zipWithIndex
  println(s"given tuples are : $indexedno")

  

}
}
