package net.lovememo.chapter02


/**
  * Created by lovememo on 17-3-28.
  */
object DefiningFunctions {
  def welcome(name: String) : Unit = {
    println("Exciting times ahead, dear " + name)
  }

  def myFirstMethod() = { "my first method"}

  def max(a:Int, b:Int ) = if(a > b) a else b

  //模板 模板类型 字母从A~Z
  def toList[A] (element: A) = List(element)

  def main(args: Array[String]): Unit = {
    welcome("lovememo")
    println(myFirstMethod)
    println(myFirstMethod())
    println(max(3, 2))
    max(4,1)
    println(toList(1))
    println(toList("你好"))

    val evenNumbers = List(2, 4, 6, 8, 10)
    val sum = evenNumbers.foldLeft(0) { (a, b) => a + b}
    val sum2 = evenNumbers.foldLeft(0) { (a: Int, b: Int) => a + b}
    val sum3 = evenNumbers.foldLeft(0) { _ + _}
    val sum4 = evenNumbers.sum;
    println("sum:" + sum)
    println("sum2:" + sum2)
    println("sum3:" + sum3)
    println("sum4:" + sum4)
  }
}
