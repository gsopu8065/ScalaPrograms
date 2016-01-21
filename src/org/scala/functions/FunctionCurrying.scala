package org.scala.functions

/**
  * Created by srujangopu on 1/20/16.
  */
object FunctionCurrying {
  def main(args: Array[String]) {

    var func1 = SumCurring.sumCurried(100)
    println(func1)

    var func2 = func1(200)
    println(func2)

    var func3 = func2(300)
    println(func3)


    println(SumCurring.sumCurried(101)(201)(301))

  }
}


object SumCurring{

  private def sum(x:Int, y:Int, z:Int) = x+y+z

  def sumCurried = (sum _).curried

}