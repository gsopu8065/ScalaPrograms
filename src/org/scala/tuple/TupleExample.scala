package org.scala.tuple

/**
  * Created by srujangopu on 1/20/16.
  */
object TupleExample {

  def main(args: Array[String]) {


    var obj1 = Tuple3("Jack", 101, 45.6)  // it is  a tuple
    println("Name ="+obj1._1)
    println("ID = "+obj1._2)
    println("Marks = "+obj1._3)


    //tuple returning from function
    val res = Student.getDetails()
    println("Name return = "+res._1)
    println("ID return = "+res._2)


    //example 3
    var x = ("KIM", 103, 45.7)
    var (name,id,marks) = x


  }
}


object Student{

  def getDetails(): (String, Int) = {
    return ("Rob", 102)
  }
}
