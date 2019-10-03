package cn.smileyan.scala

/**
 * Hello world!
 *
 */
object App {
  def main(args: Array[String]): Unit = {
    aToB()
    visitArray()
    whileDemo()
  }
  // 从a到b
  def aToB() = {
    for(i <- 1 to 10) {
      print(i+" ")
    }
    println()
    for(i <- 1 to 10 if i%2 == 0 ) {
      print(i+" ")
    }
    println()
    for(i <- 1 to 10 if i%2 == 0 && i>4 ) {
      print(i+" ")
    }
    println()
  }
  // 遍历数组
  def visitArray() = {
    var courses = Array("Hadoop","Spark", "Hive", "Zookeeper", "HBase")
    courses.foreach(course => {
      print(course+" ")
    })
    println()
  }

  def whileDemo() = {
    var (num,sum) = (0,0)
    while(num<100) {
      sum += num
      // 不可以使用num++
      num = num + 1
    }
    println("1+2+...+99 == " + sum)
  }
}
