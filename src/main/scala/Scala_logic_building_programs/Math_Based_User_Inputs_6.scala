package Scala_logic_building_programs

object Math_Based_User_Inputs_6 {
def main(args:Array[String]):Unit={

  print("Enter the first number: ")
  val num1 = scala.io.StdIn.readDouble()

  print("Enter the second number: ")
  val num2 = scala.io.StdIn.readDouble()

  print("Enter the operation (+, -, *, /): ")
  val operator = scala.io.StdIn.readLine()

  // Perform the operation based on the operator
  val result = operator match {
    case "+" => num1 + num2
    case "-" => num1 - num2
    case "*" => num1 * num2
    case "/" => if (num2 != 0) num1 / num2 else "Cannot divide by zero"
    case _ => "Invalid operator"
  }

  // Display the result
  println(s"Result: $result")

  scala.io.StdIn.readInt()
}
}
