object Max_Min_nos {
def main(args:Array[String]):Unit= {
  val a = scala.io.StdIn.readInt()
  val b = scala.io.StdIn.readInt()
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