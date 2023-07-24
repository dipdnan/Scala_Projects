package Scala_logic_building_programs

object Series_21 {
def main(args:Array[String]):Unit={

  var a = 10
  var b = 9

  for(i <-1 to 10)
    {
      println(s"$a@$b")
      a = a-1
      b = b -1
    }
}
}
