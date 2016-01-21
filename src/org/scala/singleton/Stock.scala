package org.scala.singleton


object Stock {

  var value:Int = 0

  def increaseValue(x:Int): Unit ={
    value = value + x
  }
}


class Agent(name:String){

  def increaseStock(x:Int): Unit ={
    Stock.increaseValue(x)
  }
}


//main method
object MyMain2{
  def main(args: Array[String]) {
    var obj1 = new Agent("agent1")
    var obj2 = new Agent("agent2")
    var obj3 = new Agent("agent3")

    obj1.increaseStock(800)
    obj2.increaseStock(400)
    obj3.increaseStock(300)

    println(Stock.value)

    obj3.increaseStock(200)

    println(Stock.value)

  }
}