object odd_second_alternative_numbers {
def main(args:Array[String]):Unit={

  val start = 1
  val end = 100

  println("Odd second alternative numbers are:")
  for (num <- start to end by 6) {
    if (num % 2 != 0) {
      println(num)
    }
  }
}
}
