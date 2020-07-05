package searching

object BinarySearch extends App {
  val list = List(2, 3, 4, 5, 6, 7, 8, 9)
  println(s"calling binarySearchNormal -- element is present at index ${binarySearchNormal(list, 3)()}")
  println(s"calling binarySearchFunctional -- element is present at index ${binarySearchFunctional(list, 3)}")


  def binarySearchNormal(xs: List[Int], target: Int)(start: Int = 0, end: Int = xs.size - 1): Int = {
    if (start > end) return -1;
    val mid = start + (end - start + 1) / 2
    if (xs(mid) == target)
      return mid
    else if (xs(mid) > target)
      return binarySearchNormal(xs, target)(start, mid - 1)
    else (xs(mid) < target)
    binarySearchNormal(xs, target)(mid + 1, end)

  }

  def binarySearchFunctional(xs: List[Int], target: Int): Int = {
    def bsf(xs: List[Int], target: Int)(start: Int, end: Int): Int = {
      if (start > end) return -1;
      val mid = start + (end - start + 1) / 2
      xs match {
        case (arr: List[Int]) if (arr(mid) == target) => mid
        case (arr: List[Int]) if (arr(mid) > target) => bsf(xs, target)(start, mid - 1)
        case (arr: List[Int]) if (arr(mid) < target) => bsf(xs, target)(mid + 1, end)
      }

    }

    bsf(xs, target)(0, xs.size - 1)
  }

}
