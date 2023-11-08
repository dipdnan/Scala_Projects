object Display_Largest_Smallest_no {

  def main(args:Array[String]):Unit={

    val arr : Array[Int] = Array(10,50,200,5000,10000)

    val maxnumber = arr.max
    val minnumber = arr.min

    println(s"Largest no : $maxnumber")
    println(s"Largest no : $minnumber")

  }
}
