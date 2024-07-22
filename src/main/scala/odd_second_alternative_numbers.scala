/* Display Odd second alternatives number */
object odd_second_alternative_numbers {
def main(args:Array[String]):Unit={

  val start = 1
  val end = 100

  println("Odd second alternative numbers are:")
  for (num <- start to end by 6)
  {
    if (num % 2 != 0)
    {
      print(num+ ",")
    }
  }
}
}
/* Output :
Odd second alternative numbers are:
1,7,13,19,25,31,37,43,49,55,61,67,73,79,85,91,97,
 */
