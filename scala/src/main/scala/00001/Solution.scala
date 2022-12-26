package `00001`

def run(num: Int): Int = if (num < 3) 0
else
  run(num - 1) + (if (num % 3 == 0 || num % 5 == 0) num else 0)

@main def solve: Unit = {
  println(run(999))
}
