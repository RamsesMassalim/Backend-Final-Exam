object Solution5 {
  def canMakeArithmeticProgression(arr: Array[Int]): Boolean = {
    // из 2-ч любх чисел можно сделать прогрессию
    if (arr.length == 2)
      return true
    // сортируем массив, прогрессия может только возрастать или убивать
    val seq = arr.sortWith(_ < _)

    // разница между элементами всегда d - константа
    for (i <- 1 until seq.length - 1) {
      if (seq(i + 1) - seq(i) != seq(i) - seq(i - 1))
        return false
    }

    return true
  }
}
