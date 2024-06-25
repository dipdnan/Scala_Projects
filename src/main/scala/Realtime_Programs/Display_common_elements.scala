package Realtime_Programs
/*
Input:
val set1 = Set(1, 2, 3, 4, 5)
val set2 = Set(4, 5, 6, 7, 8)
Output :(5, 4)
 */
object Display_common_elements {
def main(args:Array[String]):Unit={

  val set1 = Set(1, 2, 3, 4, 5)
  val set2 = Set(4, 5, 6, 7, 8)
  
  // Find common elements using higher-order functions
  val commonElements = set1.filter(set2.contains)

  println(commonElements) // Output: Set(4, 5)
} }
/* Output : HashSet(5, 4) */
