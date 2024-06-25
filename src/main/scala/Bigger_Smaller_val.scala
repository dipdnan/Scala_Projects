object Bigger_Smaller_val {
  def main(args:Array[String]): Unit = {

    var a = 10
    var b = 20
    var c = 30

    if (a < b && a < c) {
      print(s"$a is smaller than $b and $c")
    }
    else if (b < a && b < c) {
      print(s"$b is smaller than $a and $b")
    }
    else {
      print(s"$c is smaller")
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
