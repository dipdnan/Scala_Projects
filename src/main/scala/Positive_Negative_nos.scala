/* Identify Positive and Negative Value */
object Positive_Negative_nos {
def main(args:Array[String]): Unit = {
  println(s"Enter Any value : ")
  val Value = scala.io.StdIn.readFloat()

  if( Value >= 0)
    println(s"$Value is Positive Value")
  else
    println(s"$Value is Negative Value")
}
}
/* Output :
Enter Any value :
-57
-57.0 is Negative Value
 */