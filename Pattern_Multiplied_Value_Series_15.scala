package Scala_logic_building_programs

object Pattern_Multiplied_Value_Series_15 {
 def main(args:Array[String]):Unit={

   var i=1
   for(i<-2 to 16) {
     var j=i+1
     val mult = i * j
     println(s"The ${i} * ${j}=== $mult")
   }
 }
}
