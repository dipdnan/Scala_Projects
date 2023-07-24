object Positive_Negative_nos {
def main(args:Array[String]): Unit = {
  println(s"Enter Any value : ")
  val c = scala.io.StdIn.readFloat()

  // val a = -2
  if(c>=0)
    println(s"The given value is Positive")
  else
    println(s"The given no is Negative")

}
}
