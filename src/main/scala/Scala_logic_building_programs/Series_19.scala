package Scala_logic_building_programs

object Series_19 {
def main(args:Array[String]):Unit={

  val firstTerm = 52
  val lastTerm = 1022
  val commonDifference = 10

  // Calculate the number of terms
  val numberOfTerms = (lastTerm - firstTerm) / commonDifference + 1

  // Calculate the sum using the formula for the sum of an arithmetic series
  val sum = (numberOfTerms / 2.0) * (firstTerm + lastTerm)

  println(s"The sum of the series is: $sum")
}
}
