package `00006`

def sumSquares(max: Int): Long = {
  (1 to max).map(x => x * x).sum
}

def squareSum(max: Int): Long = {
  val sum = (1 to max).sum
  sum * sum
}

def run(max: Int): Long = {
  squareSum(max) - sumSquares(max)
}

@main def solve: Unit = {
  println(run(10))
  println(run(100))
}
