package session7

object Currying {

  def sum(f: Int => Int): (Int, Int) => Int = {
    def sumF(a: Int, b: Int): Int =
      if (a > b) 0
      else
        f(a) + sumF(a + 1, b)
    sumF
  }                                               //> sum: (f: Int => Int)(Int, Int) => Int

  sum(x => x * x * x)(2, 3)                       //> res0: Int = 35

  def sumInts = sum(x => x)                       //> sumInts: => (Int, Int) => Int
  val sumSquares = sum(x => x * x)                //> sumSquares  : (Int, Int) => Int = <function2>
  sumInts(1, 200) + sumSquares(1, 20)             //> res1: Int = 22970

  // Removes the secondary function
  def sum2(f: Int => Int)(a: Int, b: Int): Int =
    if (a > b) 0
    else
      /*
    * Applies the supplied function f() to a, then calls sum2 with a+1...
    * i.e. f(1) + f(2) + f(3)...
    */
      f(a) + sum2(f)(a + 1, b)                    //> sum2: (f: Int => Int)(a: Int, b: Int)Int

  sum2(x => x)(1, 1000)                           //> res2: Int = 500500

  def sumTailRecursive(f: Int => Int)(a: Int, b: Int): Int = {
    def iter(a: Int, result: Int): Int = {
      if (a > b) result
      else
        iter(a + 1, f(a) + result)
    }
    iter(a, 0)
  }                                               //> sumTailRecursive: (f: Int => Int)(a: Int, b: Int)Int

   sumTailRecursive(x => x)(1, 1000)              //> res3: Int = 500500

  def threeSum(f: Int => Int)(a: Int)(b: Int): Int = {
    f(a) + f(b)
  }                                               //> threeSum: (f: Int => Int)(a: Int)(b: Int)Int

  threeSum(x => x * x)(1)(2)                      //> res4: Int = 5

  def product(f: Int => Int)(a: Int, b: Int): BigInt =

    if (a > b) 1
    else f(a) * product(f)(a + 1, b)              //> product: (f: Int => Int)(a: Int, b: Int)BigInt

  product(x => x)(1, 6)                           //> res5: BigInt = 720

  def fact(n: Int) = product(x => x)(1, n)        //> fact: (n: Int)BigInt
  fact(162)                                       //> res6: BigInt = 122969421873944943411017892849175017657230059942716930662076
                                                  //| 252116781454011772896586098809846705153178359950744299047097082734018078243
                                                  //| 654159289756950995660422463205382209243080104599383814305882279271741941009
                                                  //| 821892047096152931983263907734109259038720000000000000000000000000000000000
                                                  //| 00000

  def mapReduce(f: Int => Int, combine: (Int, Int) => Int, zero: Int)(a: Int, b: Int): Int = {
    if (a > b)
      zero
    else
      combine(f(a), mapReduce(f, combine, zero)(a + 1, b))
  }                                               //> mapReduce: (f: Int => Int, combine: (Int, Int) => Int, zero: Int)(a: Int, b
                                                  //| : Int)Int
  // Find the maximum of the squares of
  mapReduce(x => x * x, (x, y) => Math.max(x, y), 0)(1, 10)
                                                  //> res7: Int = 100
}