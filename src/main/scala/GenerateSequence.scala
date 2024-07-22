object GenerateSequence {
def main (args:Array[String]):Unit={

  println("Enter the number you want to generate: ")
  val n = scala.io.StdIn.readInt()


  if (n <= 0){ print(s"$n is invalid input.") }
  else {
    var i = 1
    while (i <= n) {
      println(s"$i")
      i += 1
    }
    println("else block executed")
  }
}
}
