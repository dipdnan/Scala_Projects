package Realtime_Programs
/* Enter Any Number and return as 2nd last element from this number
val mylist = List(1, 2, 5, 7, 8, 3, 4, 6, 9)
Output : Enter any number : 5
Second last element for 5: 2
 */
object AnySecondLastElementDisplay {
def main(args:Array[String]):Unit={

  val mylist = List(1, 2, 5, 7, 8, 3, 4, 6, 9)

  // Define a function to find the second last element based on a given number n
  def findSecondLastElement(n: Int): Option[Int] = {
    val index = mylist.indexOf(n)
    if (index >= 1) Some(mylist(index - 1))
    else None
  }

  // Example usage:
  println(s"Enter any no: ")
  val n1 = scala.io.StdIn.readInt()
//  val n1 = 9
//  val n2 = 8

  // Print the second last element for each value of n
  println(s"Second last element for $n1: ${findSecondLastElement(n1).getOrElse("Not found")}")
//  println(s"Second last element for $n2: ${findSecondLastElement(n2).getOrElse("Not found")}")

}
}
