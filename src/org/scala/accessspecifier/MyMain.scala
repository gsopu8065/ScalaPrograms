package org.scala.accessspecifier

/**
  * Created by srujangopu on 1/18/16.
  */
object MyMain {

  def main(args: Array[String]) {


    var obj1 = new Student
    //obj1.name = "Jack"  //private
    //obj1.id = 101 //protected
    obj1.setValues("Jack", 101)
    obj1.address = "1016 N PLum grove rd"

    obj1.displayValues()
    println("Address = "+obj1.address)


  }
}
