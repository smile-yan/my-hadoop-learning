package cn.smileyan.scala

object SimpleObject {
  def main(args: Array[String]): Unit = {
    val list = List(1,2,3,4,5)
    println(list)
    println(list.head)
    println(list.tail)

    val list2 = 1 :: Nil
    println(list2)
    val list3 = 2 :: list2
    println(list3)

    val list4 = scala.collection.mutable.ListBuffer[Int]()
    list4 += 1
    list4 += (2,3,4,5)
    list4 ++= List(5,6)
    println(list4)

  }
}
