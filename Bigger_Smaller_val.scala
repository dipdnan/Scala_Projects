object Bigger_Smaller_val {
  def main(args:Array[String]): Unit = {

    var a = 10
    var b = 20
    var c = 30

    if (a < b && a < c) {
      print("a is smaller than b and c")
    }
    else if (b < a && b < c) {
      print("b is smaller than a and b")
    }
    else {
      print("c is smaller")
    }

    if (a > b && a > c) {
      print("a is bigger than b and c")
    }
    else if (b > a && b > c) {
      print("b is bigger than a and b")
    }
    else {
      print("c is bigger number")
    }
  }
}
