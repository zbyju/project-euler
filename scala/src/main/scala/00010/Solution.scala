package `00010`

def isPrime(x: Int): Boolean = {
  val end: Int = math.sqrt(x).toInt
  for (i <- 2 to math.sqrt(x).toInt) {
    if (x % i == 0) {
      return false
    }
  }
  return true
}

def primesBelow(max: Int) = {
  for
    i <- 2 to max
    if isPrime(i)
  yield i.toLong
}

def run(max: Int): Long = {
  primesBelow(max).sum
}

@main def solve: Unit = {
  println(run(2_000_000))
}
