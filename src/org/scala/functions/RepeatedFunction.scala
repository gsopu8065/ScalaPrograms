package org.scala.functions

/**
  * Created by srujangopu on 1/18/16.
  */
object RepeatedFunction {

  def main(args: Array[String]) {

    Show.displayStrings("ABC","XYZ")
    Show.displayStrings("jack", "rob", "raj", "visu")

  }
}


object Show{

  def displayStrings(names:String*): Unit ={

    names.foreach(x => print(" "+x))

    println()  //to move the cursor to the next line
  }
}