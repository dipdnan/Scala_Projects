package Scala_logic_building_programs

object Print_Biggest_no_3 {
def main(args:Array[String]):Unit={

  println(s"Enter any 3 values :")
  var a = scala.io.StdIn.readInt()
  var b = scala.io.StdIn.readInt()
  var c = scala.io.StdIn.readInt()

  if(a>b && a>c)
    {
      println(s"$a is bigger than $b & $c")
    }
  else if(b>a && b>c)
    { println(s"$b is bigger than $a & $c") }
  else
    { println(s"$c is bigger") }
}
}
