/**
 * Definition for a Node.
 * class Node(var _value: Int) {
 *   var value: Int = _value
 *   var children: List[Node] = List()
 * }
 */
object Solution9 {
  def maxDepth(root: Node): Int = {
    var cnt = 0

    if (root == null)
      return 0

    // считаем количество нод
    def number_of_nodes(node: Node, n: Int): Int = {
      if (node != null) {
        // количество равно максимуму среди детей

        var numbers = List[Int]()

        for (i <- node.children) {
          numbers ::= number_of_nodes(i, n + 1)
        }

        if (numbers.isEmpty)
          return n
        else
          return numbers.max
      }
      else
        return n
    }

    cnt = number_of_nodes(root, 1)

    cnt
  }
}
