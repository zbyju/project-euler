package `00005`

def gcd(first: Long, second: Long): Long = {
  if (first == 0)
    return second
  return gcd(second % first, first);
}

def run(max: Int): Long = {
  (2 to max).foldLeft(1.toLong)((lcm, x) => (lcm * x) / (gcd(lcm, x)))
}

@main def solve: Unit = {
  println(run(10))
  println(run(20))
}
