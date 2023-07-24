object Print_not_divisible_3_Array {
def main(args:Array[String]):Unit={

  val arr =Array(1,2,3,4,5,6,7,8,9)

  for(i<-arr)
    {
      if(arr(i)%3!=1){
        println(i)
      }
    }
}
}
