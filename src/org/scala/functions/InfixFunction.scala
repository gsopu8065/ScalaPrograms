package org.scala.functions

/**
  * Created by srujangopu on 1/18/16.
  */
object InfixFunction {

  def main(args: Array[String]) {
    var obj1 = new Calc
    obj1.squre(5)

    obj1 squre 6    //Infix function call
  }


}


class Calc{

  def squre(x:Int){
    println("Squre = "+(x*x))
  }
}