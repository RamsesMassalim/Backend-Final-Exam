object Solution3 {
  def largestPerimeter(nums: Array[Int]): Int = {
    var ans = 0

    // сортируем стороны
    val sorted_arr = nums.sortWith(_ < _)

    for (i <- 0 until nums.length - 2) {

      // неравенство треугольника:
      // сумма двух любых сторон должна быть больше третьей
      if (sorted_arr(i) + sorted_arr(i + 1) > sorted_arr(i + 2))
        ans = sorted_arr(i) + sorted_arr(i + 1) + sorted_arr(i + 2)
    }

    ans
  }
}
