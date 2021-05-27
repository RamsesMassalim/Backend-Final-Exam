object Solution1 {
  def isAnagram(s: String, t: String): Boolean = {
    var arr: Array[Int] = Array.fill(26)(0)

    for (i <- s) {
      arr(i.toInt - 97) += 1
    }

    for (i <- t) {
      arr(i.toInt - 97) -= 1
    }

    for (i <- arr) {
      if (i != 0)
        return false
    }

    return true
  }
}