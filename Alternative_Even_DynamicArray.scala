package Array_Programs

object Alternative_Even_DynamicArray {
 def main(args:Array[String]):Unit={

   println("The array alternative even no are: ")
   for (i <-0 to 100 by 4) {
     if (i % 2 == 0) {
       print(i+", ")

     }
   }
   }
}
