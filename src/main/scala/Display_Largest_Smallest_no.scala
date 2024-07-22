object Display_Largest_Smallest_no {

  def main(args:Array[String]):Unit={

      val arr: Array[Int] = Array(10, 20, 30, 40, 50)

      // Finding the largest number using reduce
      val largest = arr.reduce((a, b) => if (a > b) a else b)

      // Finding the smallest number using reduce
      val smallest = arr.reduce((a, b) => if (a < b) a else b)

      println(s"Largest number: $largest")
      println(s"Smallest number: $smallest")

    val sumUsingFold = arr.fold(0)(_ + _)
    println(s"Sum using fold: $sumUsingFold")

    val sumUsingFoldLeft = arr.foldLeft(0)(_ + _)
    println(s"Sum using foldLeft: $sumUsingFoldLeft")

    val sumUsingReduceLeft = arr.reduceLeft(_ + _)
    println(s"Sum using reduceLeft: $sumUsingReduceLeft")


  }
}
/* Output:
Largest no : 10000
Smallest no : 10
 */