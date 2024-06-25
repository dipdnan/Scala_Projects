package Scala_logic_building_programs

import scala.math.BigDecimal.double2bigDecimal

object Series_29 {
 def main(args:Array[String]):Unit={

  val start = 0.5
  val end = 5.1
  val step = 0.2

  for (num <- start to end by step) {
   val square = num * num
   print(square+ ",")
  }

 }
}
