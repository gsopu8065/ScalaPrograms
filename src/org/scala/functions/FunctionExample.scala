package org.scala.functions

import org.scala.functions.FunctionExample

/**
  * Created by srujangopu on 1/18/16.
  */
object FunctionExample {

  def funcWithArg(value:Int, myFunction:Int => Int): Int ={
        return myFunction(value)
  }

  def funcReturn(): String => String = {
    def myFunction = {str:String => str.reverse}
    return myFunction
  }
}

//main method
object MyMain{
  def main(args: Array[String]) {

   /* def myFunction = {x:Int => x+10}
    def value = 100

    println(FunctionExample.funcWithArg(value, myFunction))*/


    println(FunctionExample.funcReturn()("Hello"))
  }
}
