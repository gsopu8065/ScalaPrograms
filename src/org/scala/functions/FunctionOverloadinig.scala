package org.scala.functions

/**
  * Created by srujangopu on 1/20/16.
  */
object FunctionOverloadinig {

  def main(args: Array[String]) {

    CalcOverloading.sum()   //sum(0,0,0,0)
    CalcOverloading.sum(10)  //sum910,0,0,0)
    CalcOverloading.sum(10,20) //sum(10,20,0,0)
    CalcOverloading.sum(10,20,30)  //sum(10,20,30,0)
    CalcOverloading.sum(10,20,30,40)
  }
}



object CalcOverloading{


  def sum(x:Int = 0, y:Int = 0 , z:Int = 0, w:Int = 0): Unit ={
    println("Sum = "+(x+y+z+w))
  }
}