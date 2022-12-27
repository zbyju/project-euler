package `00004`

def combinations(max: Int) = {
  val str = max.toString
  for
    i <- max.to(1, -1)
    j <- i.to(1, -1)
    if (str.length == i.toString.length && str.length == j.toString.length)
  yield (i, j)
}

def isPalindrome(x: Int): Boolean = {
  val str = x.toString
  str == str.reverse
}

def run(max: Int): (Int, (Int, Int)) = {
  combinations(max).foldLeft((0, (0, 0)))((m, i) => {
    val product = i._1 * i._2
    if (m._1 < product && isPalindrome(product)) (product, i) else m
  })
}

@main def solve: Unit = {
  println(run(99))
  println(run(999))
}
