package Scala_logic_building_programs

object Series_19 {
def main(args:Array[String]):Unit={

  var sum = 0


  for( i<-5 to 10)
    {
      val square = i * i
      sum =square +1
    }
    println(s"sum of square : $sum")
}
}
