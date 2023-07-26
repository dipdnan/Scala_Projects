package MAP_Programs
object Simple_MAP {
 def main(args:Array[String]):Unit={

//   import scala.collection.mutable.Map




//    //Creating an immutable Map using the Map companion object
//   val items : Map[String,Int] =Map("wheat"->10,"Jawar" -> 50,"Maka" ->100,"wheat"->10,
//   "wheat"->100)
//   println(items.keys)
//   println(items.values)
//
//   val prod : Map[Int,String] = Map(10 ->"Tables",20 ->"Chairs",30->"Mouse",50->"LCD")
//    println(prod(10))
//   println(prod(20))
//   println(prod(30))
//   println(prod(50))

   import java.text.SimpleDateFormat
   import java.util.Date

   val dateFormatter = new SimpleDateFormat("dd-MM-yyyy")

   val prod_upd: Map[Date, String] = Map(
     dateFormatter.parse("20-07-2021") -> "Deepak",
     dateFormatter.parse("21-07-2022") -> "Parmeshwar",
     dateFormatter.parse("22-07-2023") -> "Karthik"
   )
   println(prod_upd(dateFormatter.parse("20-07-2021")))
   println(prod_upd(dateFormatter.parse("21-07-2022")))
   println(prod_upd(dateFormatter.parse("22-07-2023")))

 }
}
