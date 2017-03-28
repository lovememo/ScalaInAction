package net.lovememo.chapter02

/**
  * Created by lovememo on 17-3-24.
  */
object HelloWorld {
  def test(param:String) :Unit = {
    println("hello World ，你好，世界！" + param)
  }
//你好中文
  def main(args: Array[String]): Unit = {

    test("jinjf")
    var xml:scala.xml.Elem = <a><b></b></a>
    println(xml.toString)
  }

}
