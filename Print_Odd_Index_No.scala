object Print_Odd_Index_No {
def main(args:Array[String]):Unit={

//  var start = 1
//  var end = 100
//
//  for(num<-start to end)
//  {
//    if(num%2!=0)
//    {
//      println(num)
//    }
//  }


val arr = Array(1,2,3,4,5,6,7,8,9,10)
//                0,1,2,3,4,5,6,7,8,9
  for(i<-arr)
    {
      if(i%2==1){
        println(arr(i))
      }
    }
}
}
