package Scala_logic_building_programs

object Range_Even_Odd_Divide3and2_4
{
def main(args:Array[String]):Unit= {

  // Step a: Store a number in a variable
  println("Enter a number: ")
  val number = scala.io.StdIn.readInt()

  // Step b: Check if the value is in the range (100-1000)
  if (number >= 100 && number <= 1000) {
    // Step c: Check if the number is even or odd
    if (number % 2 == 0) {
      // Step d: If even, divide the number by 3 and print the remainder
      val remainder = number % 3
      println(s"The number $number is even. When divided by 3, the remainder is $remainder.")
    } else {
      // Step e: If odd, divide the number by 2 and print the remainder
      val remainder = number % 2
      println(s"The number $number is odd. When divided by 2, the remainder is $remainder.")
    }
  } else {
    println("Wrong number! Please enter a number in the range 100-1000.")
  }
}
}