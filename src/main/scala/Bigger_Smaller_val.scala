
/*Find out the bigger and smaller number from given input */
object Bigger_Smaller_val {
  def main(args:Array[String]): Unit = {

    val a = 100
    val b = 20
    val c = 1

    if (a < b && a < c) {
      print(s"$a is smaller than $b and $c")
    }
    else if (b < a && b < c) {
      print(s"$b is smaller than $a and $b")
    }
    else {
      print(s"$c is smaller.")
    }

    if (a > b && a > c) {
      print(s"$a is bigger than $b and $c")
    }
    else if (b > a && b > c) {
      print(s"$b is bigger than $a and $b")
    }
    else {
      print(s" is bigger number")
    }
  }
}
/*Output :
1 is smaller.100 is bigger than 20 and 1
 */