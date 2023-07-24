import scala.util.control.Breaks.break

object Divisible_by3_Divisible_by11_usingArrary {
def main(args:Array[String]):Unit={
//  val arr=Array(1,2,3,6,9,12,15,11,22,33,44,55,77)
//
//  for(i<-arr)
//    {
//      if(i%3==0 && i%11==0)
//        {
//          println(i)
//        }
//    }
  val arr =Array(1,2,3,6,9,12,15,11,22,33,44,55,77)
  var len = arr.length
  var range = 0 to len-1
  var c =0

  for(i<-range)
    {
      if(arr(i)%3==0 && arr(i)%11==0){
        println(arr(i))
      }
      c=c+1
      if(c==len-1)
      {
        break;
      }
    }
  }
}
