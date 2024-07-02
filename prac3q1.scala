object ReverseString {
  def stringReverser(s: String): String = {
    if (s.isEmpty) {
      "" 
    } else {
      stringReverser(s.tail) + s.head 
    }
  }
  
  def main(args: Array[String]): Unit = {
    val string = "functional programming"
    val reversedString = stringReverser(string)
    println("Original string: " + string)
    println("Reversed string: " + reversedString)
  }
}
