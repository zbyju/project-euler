package `00003`

import java.math.BigInteger

def isPrime(x: Int): Boolean = {
  val end: Int = math.sqrt(x).toInt
  for (i <- 2 to math.sqrt(x).toInt) {
    if (x % i == 0) {
      return false
    }
  }
  return true
}

def findFactor(x: Long, from: Int = 2): Int = {
  if (from == 2 && x % 2 == 0) {
    return 2
  }
  val newFrom = if (from % 2 == 0) from + 1 else from
  for (i <- newFrom.to(Int.MaxValue, 2)) {
    if (x % i == 0 && isPrime(i)) {
      return i
    }
  }
  return -1
}

def findFactors(x: Long): Seq[Int] = {
  if (x <= 1) return Seq()
  val factor = findFactor(x)
  return findFactors(x / factor) :+ factor
}

def run(x: Long): Int = {
  findFactors(x).max
}

@main def solve: Unit = {
  println(run(13195))
  val x = BigInt(new BigInteger("600851475143"))
  println(run(x.toLong))
}
