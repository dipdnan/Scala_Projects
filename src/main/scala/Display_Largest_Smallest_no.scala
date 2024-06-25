object Display_Largest_Smallest_no {

  def main(args:Array[String]):Unit={

      val arr: Array[Int] = Array(10, 50, 200, 5000, 10000)

      // Finding the largest number using reduce
      val largest = arr.reduce((a, b) => if (a > b) a else b)

      // Finding the smallest number using reduce
      val smallest = arr.reduce((a, b) => if (a < b) a else b)

      println(s"Largest number: $largest")
      println(s"Smallest number: $smallest")
  }
}
/* Output:
Largest no : 10000
Smallest no : 10
 */