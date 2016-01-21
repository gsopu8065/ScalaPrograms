package org.scala.constructors

/**
  * Created by srujangopu on 1/18/16.
  */
object MyMain {

  def main(args: Array[String]) {


    val obj1 = new Student("Jack", 101)


    //obj1.name = "Rob"
    //obj1.id = 102
    //println("Name from main= "+ obj1.name)
    //println("Id from main= "+obj1.id)

    obj1.displayValues()

  }
}
