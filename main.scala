// 教學：https://www.udemy.com/course/fast-scala/learn/lecture/27123376#overview
object Main {
  def main(args: Array[String]): Unit = {
    println("Hello world!")
    val x: Int = 10 // val不可變變數
    var y: String = "Hello" // var可變變數
    val z = 5 // Scala 可以自動型態推斷

    val result = add(3, 7)
    val value = checkValue(5)
  }

  def add(x: Int, y: Int): Int = {
    x + y
  }

  // 模式匹配
  def checkValue(x: Int): String = x match {
    case 0 => "Zero"
    case 1 => "One"
    case _ => "Other"
  }

}
