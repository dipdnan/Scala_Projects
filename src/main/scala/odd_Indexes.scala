object odd_Indexes {
def main(args:Array[String]):Unit ={
/* Write a program to print numbers which are present in odd indexes
     array -----------10,20,30,40,50,60,70,80

           0  1 2 3 4 5 6 7
    ans: 20,40,60,80*/

  val numbers = Array(10,20,30,40,50,60,70,80)

  println("Numbers at odd indexes are:")
  for (i <- numbers.indices if i % 2 != 0)
  {
    println(numbers(i))
  }
}
}
