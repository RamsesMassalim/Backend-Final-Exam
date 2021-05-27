object Solution2 {
  def sortString(s: String): String = {
    var mp: scala.collection.mutable.Map[Char, Int] = scala.collection.mutable.Map[Char, Int]()
    val st = s.sorted

    // делаем map всех букв с количеством
    for (i <- st) {
      if (mp.contains(i))
        mp(i) += 1
      else
        mp.addOne((i -> 1))
    }

    var ans = ""

    // массив всех символов
    var k = mp.keys.toList.sorted

    while (!mp.keys.isEmpty) {

      // добавляем в возрастающем порядке
      var i = 0
      while (i != k.length) {
        ans += k(i)
        mp(k(i)) -= 1
        i += 1
      }

      // обновляем map
      for (j <- mp.keys) {
        if (mp(j) == 0)
          mp.remove(j)
      }

      k = mp.keys.toList.sorted

      // добавляем в убывающем порядке
      i = k.length - 1
      while (i != -1) {
        ans += k(i)
        mp(k(i)) -= 1
        i -= 1
      }

      // обновляем map
      for (j <- mp.keys) {
        if (mp(j) == 0)
          mp.remove(j)
      }

      k = mp.keys.toList.sorted
    }

    ans
  }
}
