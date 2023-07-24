package Scala_logic_building_programs

object Sum_of_range_56to153_9 {
 def main(args:Array[String]):Unit={

   println("Enter Any number :")
   val no = scala.io.StdIn.readInt()
   var sum = 0

   for(no<-56 to 153)
     {
       sum=sum+no
     }
    println(s"The sum of nos from 56 to 153 is : $sum")
 }
}
