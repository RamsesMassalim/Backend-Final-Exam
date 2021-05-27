object Solution7 {
  def canFormArray(arr: Array[Int], pieces: Array[Array[Int]]): Boolean = {
    var str_arr = List[String]()
    var s = ""
    var cnt = 0

    // делаем массив строкой с разделяющим знаком
    for (i <- arr) {
      s += i.toString + "`"
    }

    // создаем массив со строками
    for (i <- pieces) {
      var st = ""
      for (j <- i) {
        st += j.toString + "`"
      }

      str_arr ::= st
    }

    // считаем количество подстрок
    for (i <- str_arr) {
      if (s.contains(i))
        cnt += 1
    }

    // количество подстрок должно совпадать с размером массива
    if (pieces.length == cnt)
      return true
    else
      false
  }
}
