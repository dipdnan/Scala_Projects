object PrintReverseNummber {
def main(args:Array[String]):Unit={

  println("Enter the number you want to generate the sequence: ")
  val n = scala.io.StdIn.readInt()

  if (n <=0){ print(s"$n is invalid input.") }
  else {
    var temp =n
    while (temp > 0){
      println(temp)
      temp -=1
    }
    print("else block exicuted")
  }
}}
