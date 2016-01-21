package org.scala.accessspecifier

/**
  * Created by srujangopu on 1/18/16.
  */
class Student {


    private var name:String = _
    protected var id:Int = _
    var address:String = _ //it is public


    def setValues(n:String,i:Int): Unit ={
      name = n
      id = i
    }

    def displayValues(): Unit ={
      println("Id = "+id)
      println("Name = "+name)
    }

}
