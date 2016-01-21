package org.scala.classes

/**
  * Created by srujangopu on 1/18/16.
  */
object MyMain {

  def main(args: Array[String]) {

    val obj1 = new Student()
    obj1.setValues("Jack", 101, "1016 N PLum grove rd")
    obj1.displayValues()

    val obj2  = new Student
    obj2.setValues("Rob", 102, "37221 Hwy 70")
    obj2.displayValues()


  }
}
