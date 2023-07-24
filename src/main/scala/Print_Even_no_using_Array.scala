object Print_Even_no_using_Array {
def main(args:Array[String]):Unit={

  val arr = Array(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
  //                0,1,2,3,4,5,6,7,8,9
  for (i <- arr)
  {
    if (arr(i) % 4 == 0)
    {
      println(arr(i))
    }
  }

}
}
