import scala.io.StdIn
object Alternative_Even_No {

  def main(args:Array[String]):Unit={

    val start = 1
    val end = 100

    println("The alternative even values are from 1 to 100 are:")
    for (no <- start to end)
    {
      if (no % 2 == 0)
      {
        println(no)
      }
    }

  }
}


