package `00009`

def generate(max: Int) = {
  for
    c <- 1 to max
    b <- 1 to c
    a <- 1 to b
    if a * a + b * b == c * c && a + b + c == max
  yield a * b * c
}

def run(max: Int): Long = {
  generate(max).head
}

@main def solve: Unit = {
  println(run(1000))
}
