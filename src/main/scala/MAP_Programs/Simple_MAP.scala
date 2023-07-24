package MAP_Programs

object Simple_MAP {
 def main(args:Array[String]):Unit={


   val items : Map[String,Int] =Map("wheat"->10,"Jawar" -> 50,"Maka" ->100,"wheat"->10,
   "wheat"->100)

   println(items.keys)
   println(items.values)

 }
}
