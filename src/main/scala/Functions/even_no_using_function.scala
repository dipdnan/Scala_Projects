package Functions

object even_no_using_function {
def main(args:Array[String]):Unit= {
  /*def functionName ([list of parameters]) : [return type] = {
   function body
   return [expr]
}*/

  def IsEven(number: Int): Boolean = {
    number % 2 == 0
  }

  def IsEvenNumber(start: Int, end: Int): Unit = {
    for (num <- start to end) {

      if (IsEven(num))
        println(num + ",")
    }
  }

  IsEvenNumber(1, 10)
}
}
