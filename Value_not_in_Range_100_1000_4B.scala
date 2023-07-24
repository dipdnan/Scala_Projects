package Scala_logic_building_programs

object Value_not_in_Range_100_1000_4B {
def main(args:Array[String]):Unit={

//    println(s"Enter Any number not in the range between 100 to 1000:: ")
 //     val no = scala.io.StdIn.readInt()
//    //val no1 = no  --
//    if (no >100 && no<1000)
//    {
//      println(s"The given number $no is in 100 between 1000 values")
//    }
//    else
//      { println(s"The given number $no is wrong") }

      println("Enter Any Value :")
      val no = scala.io.StdIn.readInt()
      if(no >=100 && no<=1000)
        {
          println("Given no is correct in given ranges")
        }

     else if(no % 2==0)
    {
      println(s"The given $no is even")
      val rem= no%3
      println(s"the given no $no of reminder is $rem")
    }
      else if(no %2==1)
        {
          println(s"the given $no is odd")
          val rem = no %2
          println(s"the given $no of reminder is $rem")
        }
      else { println("the given no is wrong")  }

}
}
