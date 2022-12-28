package `00007`

def isPrime(x: Int): Boolean = {
  val end: Int = math.sqrt(x).toInt
  for (i <- 2 to math.sqrt(x).toInt) {
    if (x % i == 0) {
      return false
    }
  }
  return true
}

def run(n: Int): Long = {
  var found = 0
  var i = 2
  while (true) {
    if (isPrime(i)) {
      found += 1
      if (found == n) {
        return i
      }
    }
    i += 1
  }
  return -1
}

@main def solve: Unit = {
  println(run(6))
  println(run(10001))
}
