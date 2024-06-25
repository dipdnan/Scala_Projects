package Realtime_Programs
/*
Input : val numList = List(1,2,3,List(4,5,6,List(7,8,9)))

Output : List(1, 2, 3, 4, 5, 6, 7, 8, 9)
 */

object Nested_List_Example {
def main(args:Array[String]):Unit={

  val numList = List(1,2,3,List(4,5,6,List(7,8,9)))

  def flattenList(input: List[Any]): List[Int] = input.flatMap {
    // Case when the element is a nested list
    case nested: List[_] => flattenList(nested)
    // Case when the element is an integer
    case elem: Int => List(elem)
  }
  val flattenedList = flattenList(numList)

  println(flattenedList)

}
}
