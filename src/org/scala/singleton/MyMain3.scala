package org.scala.singleton

/**
  * Created by srujangopu on 1/18/16.
  */
object MyMain3 {

  def main(args: Array[String]) {

    var obj1 = new Person("Jack")

    //println(obj1.superheroName)
    Person.displayPrivateValue(obj1)
  }
}

//A companion object can also see private values and variables of the instantiated objects
class Person (private val superheroName:String){

}  //The superhero name is private!

object Person {
  def displayPrivateValue(x:Person): Unit = {
    println(x.superheroName)
  }
}