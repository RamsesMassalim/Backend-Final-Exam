/**
 * Definition for a binary tree node.
 * class TreeNode(_value: Int = 0, _left: TreeNode = null, _right: TreeNode = null) {
 *   var value: Int = _value
 *   var left: TreeNode = _left
 *   var right: TreeNode = _right
 * }
 */
object Solution10 {
  def increasingBST(root: TreeNode): TreeNode = {
    var arr: List[Int] = List[Int]()

    // проверяем на существование
    if (root == null)
      return null

    // запоминаем все значения
    def nodes(node: TreeNode): Unit = {
      if (node != null) {
        arr ::= node.value
        nodes(node.left)
        nodes(node.right)
      }
    }

    nodes(root)

    arr = arr.sorted

    // переобъявляем корень

    root.value = arr(0)
    root.left = null

    if (arr.length == 1)
      return root

    var node1 = TreeNode(arr(1), null, null)
    root.right = node1
    node1 = root.right

    // заполняем дерево

    for (i <- 2 until arr.length) {
      val node2 = TreeNode(arr(i), null, null)
      node1.right = node2
      node1 = node2
    }

    root
  }
}
