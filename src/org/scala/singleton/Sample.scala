package org.scala.singleton


object Sample {

  var name:String = _
  var id:Int = _

  def setValues(n:String,i:Int): Unit ={
    name = n
    id = i
  }

  def displayValues(): Unit ={
    println("Name ="+ name)
    println("Id = "+id)
  }

}



//main method
object MyMain{
  def main(args: Array[String]) {

    Sample.setValues("Jack", 101)
    Sample.displayValues()

  }
}