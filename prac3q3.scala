
object MeanCalculator {
  def arithmeticMean(num1: Int, num2: Int): Double = {
    val mean = (num1 + num2) / 2.0
    BigDecimal(mean).setScale(2, BigDecimal.RoundingMode.HALF_UP).toDouble
  }

  def main(args: Array[String]): Unit = {

    println(arithmeticMean(20,30)) 
  }
}


