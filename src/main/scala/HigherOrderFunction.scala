object HigherOrderFunction {
def main(args:Array[String]):Unit={

  var a = 1 to 10

  def d1(i: Int): Int = {
    i * i
  }

  a.map(d1)
}
}
