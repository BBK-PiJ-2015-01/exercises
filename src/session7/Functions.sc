package session7

object Functions {

  println("A function to sum all integers between two given numbers a and b")

  def sumInts(a: Int, b: Int): Int =
    if (a > b) 0
    else
      a + sumInts(a + 1, b)

  println("A function to sum the squares of all integers between two given numbers")

  def square(x: Int): Int = x * x
  def sumSquares(a: Int, b: Int): Int =
    if (a > b) 0
    else
      square(a) + sumSquares(a + 1, b)

  def powerOfTwo(x: Int): Int = if (x == 0) 1 else 2 * powerOfTwo(x - 1)
  def sumPowersOfTwo(a: Int, b: Int): Int =
    if (a > b) 0
    else
      powerOfTwo(a) + sumPowersOfTwo(a + 1, b)

  println("The common pattern")

  def sum(f: Int => Int, a: Int, b: Int): Int =
    if (a > b) 0
    else
      f(a) + sum(f, a + 1, b)

  println("Anonymous functions")

  // Given the following function definitions...
  def id(x: Int): Int = x
  def sumInts2(a: Int, b: Int): Int = sum(id, a, b)
  // ... can be replaced by
  def sumInts3(a: Int, b: Int): Int = sum(x => x, a, b)
  // This part replaces the function id ->......<-

  def sumSquares2(a: Int, b: Int): Int = sum(x => x * x, a, b)

  sumSquares2(1, 100)
}