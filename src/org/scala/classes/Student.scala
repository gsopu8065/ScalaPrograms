package org.scala.classes

class Student {

  var name:String = _
  var id:Int = _
  var address:String = _

  def setValues(n:String, i:Int, add:String): Unit ={
    name = n
    id = i
    address = add
  }

  def displayValues(): Unit ={
    println("Name = "+ name)
    println("Id = "+id)
    println("Address = "+address)
  }
}
