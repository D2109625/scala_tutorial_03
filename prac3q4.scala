object EvenNumberSum {
  def sumEvenNumbers(numbers: List[Int]): Int = {
    numbers.filter(_ % 2 == 0).sum
  }

  def main(args: Array[String]): Unit = {
    val sampleList = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val evenSum = sumEvenNumbers(sampleList)

    println("Original list: " + sampleList)
    println("Sum of even numbers: " + evenSum)

    val anotherList = List(15, 22, 37, 44, 51, 66, 73, 88)
    val anotherEvenSum = sumEvenNumbers(anotherList)
    println("\nAnother list: " + anotherList)
    println("Sum of even numbers: " + anotherEvenSum)
  }
}
