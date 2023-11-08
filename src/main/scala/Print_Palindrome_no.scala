import scala.io.StdIn

object Print_Palindrome_no {

  def main(args:Array[String]):Unit={


//    var num = StdIn.readInt()
//    var b = num
//    var sum =0
//
//    while(num!=0)
//      {
//        val rem = num/10
//        sum = sum*10+rem
//        num = num/10
//      }
//      println("Revereser no is : " +num)

    val a =1005
    val b =1501
    val c =30

    if(a>b && a>c ){
      println(s"a is bigger: $a")
    }
    else if(b>c && b>a) {
      println(s"b is bigger : $b")
    } else
      { println(s"c is bigger : $c")}
  }
}
