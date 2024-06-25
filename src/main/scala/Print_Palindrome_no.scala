import scala.io.StdIn

object Print_Palindrome_no {

  def main(args:Array[String]):Unit={
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
