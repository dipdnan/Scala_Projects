package Realtime_Programs
/*
    𝘐𝘯𝘱𝘶𝘵: List(1,2,3,4,5) 𝘳𝘢𝘯𝘨𝘦=3

    𝘖𝘶𝘵𝘱𝘶𝘵: (1,2,3, 2,3,4 3,4,5, 4,5,6 5,6,7)            */
object Nearest_Neighbour {
def main(args:Array[String]):Unit={

  val lst = List(1,2,3,4,5)
//  lst: List[Int] ; List(1, 2, 3, 4, 5)

  val res = lst.map{x=>(x,(x+1),(x+2)) }
  println(res)

  val range = 3

  val result = lst.flatMap(n => List(n, n + 1, n + 2).sliding(range).toList).distinct

  println(result)
}
}
