package Realtime_Programs
/* val str = "*"
val num =5
output:
*****
****
***
**
*            */

object DisplayStarPattern {
def main(args:Array[String]):Unit={

  val num = 5

  val pattern = (1 to num).reverse
  println(pattern)

  val result = pattern.map(i=>"*" * i).foreach(println)
}
}
