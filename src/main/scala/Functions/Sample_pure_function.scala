package Functions

object Sample_pure_function {
def main(args:Array[String]):Unit= {

  // Define the pure function
  def addOne(a: Int): Int = {
    a + 1
  }

  // Call the function and print the result
  val no = 5
  val result = addOne(no)
  println(s"The result is: $result")

}
}
