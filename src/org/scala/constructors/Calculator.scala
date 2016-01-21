package org.scala.constructors

class Calculator(x:Int, y:Int) {

    var xValue:Int = x;
    var yValue:Int = y;

    //auxilary const
    def this(x:Int){
      this(x,20)
    }

    def this(){
      this(10,20)
    }

    def sum(): Unit = {
      println("Sum = "+(xValue+yValue))
    }
}


object MyMain2{
  def main(args: Array[String]) {

    var obj1 = new Calculator(100,200)  //calls class constructor
    obj1.sum();

    var obj2 = new Calculator(200)  //calls one argument constructor
    obj2.sum()

    var obj3 = new Calculator //calls no parameters
    obj3.sum()
  }
}