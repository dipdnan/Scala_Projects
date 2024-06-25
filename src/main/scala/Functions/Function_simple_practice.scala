package Functions

object Function_simple_practice {
def main(args:Array[String]):Unit={

  def square(a: Int): Int = {
    a * a
  }
  val b =square(12)
  println(s"The Square of given no is :  $b")
  val numbers = List(50,10,100,45,40,250,200)

  // Step 1: Sort the list in ascending order
  val sorted = numbers.sorted
  println(s"The sorted number : $sorted")

  // Step 2: Use zipWithIndex to get a list of tuples (element, index)
  val indexedno = sorted.zipWithIndex
  println(s"given tuples are : $indexedno")
}
}
/* Output :
144
The sorted number : List(10, 40, 45, 50, 100, 200, 250)
given tuples are : List((10,0), (40,1), (45,2), (50,3), (100,4), (200,5), (250,6))
 */