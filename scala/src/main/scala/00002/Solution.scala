package `00002`

def nextFib(fibs: Seq[Int]): Int = fibs.length match {
  case 0 => 1
  case 1 => 2
  case _ => fibs(fibs.length - 1) + fibs(fibs.length - 2)
}

def fibs(max: Int, nums: Seq[Int] = Seq()): Seq[Int] = {
  val next = nextFib(nums)
  if (next > max) {
    return nums
  }
  fibs(max, nums :+ nextFib(nums))
}

def run(max: Int): Int = {
  fibs(max).filter(x => x % 2 == 0).sum
}

@main def solve: Unit = {
  println(run(100))
  println(run(4_000_000))
}
