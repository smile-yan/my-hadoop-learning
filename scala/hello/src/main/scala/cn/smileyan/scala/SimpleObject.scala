package cn.smileyan.scala

object SimpleObject {
  def main(args: Array[String]): Unit = {

  }
}

trait Animal {
  def run()
  def eat()
}
trait Worker extends Animal {
  def work()
}
trait Student extends Animal {
  def study()
}
trait GraduatedStudent extends Worker with Student {
  def graduate()
}