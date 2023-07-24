package Scala_logic_building_programs

object Sum_Range_Even_no_16 {
def main(args:Array[String]):Unit= {

  val start = 382
  val end = 582
  var cnt = 0

  for (num <- start to end)
  {
    if (num % 2 == 0)
    {
      cnt = cnt + 1
    }
  }
  println(s"the sum even no $start & $end== $cnt")
}
}

