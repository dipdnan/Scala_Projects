object Max_Min_nos {
def main(args:Array[String]):Unit= {

  println("Enter 1st value : ")
  val a = scala.io.StdIn.readInt()
  println("Enter 2st value : ")
  val b = scala.io.StdIn.readInt()
  println("Enter 3st value : ")
  val c = scala.io.StdIn.readInt()

  if(a>b)
    {
      if(a>c)
        println(s"a is greater $a")
      else
        println(s"c is greater $c")
    }
  else {
    if(b>c)
             println(s"b is greater $b")
    else
      println(s"c is greater $c")

    }
  }


}