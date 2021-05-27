object Solution6 {
  def maximumUnits(boxTypes: Array[Array[Int]], truckSize: Int): Int = {
    // сотируем по 2 элементу
    val arr = boxTypes.sortWith(_(1) > _(1))

    var ans = 0
    var cnt = 0

    for (i <- 0 until arr.length) {
      if (cnt == truckSize)
        return ans
      // смотрим размер машины
      if (arr(i)(0) <= (truckSize - cnt)) {
        ans += arr(i)(1) * arr(i)(0)
        cnt += arr(i)(0)
      }
      else {
        ans += arr(i)(1) * (truckSize - cnt)
        cnt = truckSize
      }
    }

    ans
  }
}
