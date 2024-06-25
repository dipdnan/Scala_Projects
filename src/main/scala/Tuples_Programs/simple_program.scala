package Tuples_Programs

object simple_program {
def main(args:Array[String]):Unit={

//  val a= (String,Int) = ("Deepak",100)
//  println(a._1)

//  var tup = (34,"deepak",'A',true,3.434,6.4534)

//  tup._4= false
//  println(tup._5)
//
//  val a = Set(1,2,3,3,3,4,4,5,1333,45,44,55,55,5,5)
//  println(a)
//
//  val immutableSet:Set[Int]=Set(1,1,2,3,3,4,4,4,4,5)
//  println(immutableSet)

  val setA:Set[Int]=Set(1,2,3,4,5)
  val setB:Set[Int]=Set(4,5,6,7,8)

  val intersection:Set[Int]=setA.intersect(setB)
  println("Intersection : "+intersection)

  val union: Set[Int] = setA.union(setB)
  println("Union : "+union)

  val diff: Set[Int] = setA.diff(setB)
  println("Difference/Minus : "+diff)

  val issubset: Boolean= setA.subsetOf(setB)
  println(issubset)

}
}
