package Array_Programs

object Alternative_Even_DynamicArray {
 def main(args:Array[String]):Unit={

   println("Enter the Array size: ")
   val size = scala.io.StdIn.readInt()
   println(s"Array size is: $size")

   println("The array alternative even no are: ")
   for (i <-0 until size by 4) {
     if (i % 2 == 0) {
       print(i + ", ")
     }}}}
/*
Enter the Array size:
60
Array size is: 60
The array alternative even no are:
0, 4, 8, 12, 16, 20, 24, 28, 32, 36, 40, 44, 48, 52, 56, */
