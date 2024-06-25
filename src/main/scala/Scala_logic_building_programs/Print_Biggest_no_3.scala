package Scala_logic_building_programs

object Print_Biggest_no_3 {
def main(args:Array[String]):Unit={

  println(s"Enter any 3 values :")
  var a = scala.io.StdIn.readDouble()
  var b = scala.io.StdIn.readDouble()
  var c = scala.io.StdIn.readDouble()

  if(a>b && a>c)
    {
      println(s"${a.toInt} is bigger than $b & $c")
    }
  else if(b>a && b>c)
    { println(s"${b.toInt}is bigger than $a & $c") }
  else
    { println(s"${c.toInt}is bigger") }
    scala.io.StdIn.readInt()
}
}
