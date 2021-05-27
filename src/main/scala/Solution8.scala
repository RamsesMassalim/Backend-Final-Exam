/**
 * Definition for a binary tree node.
 * class TreeNode(_value: Int = 0, _left: TreeNode = null, _right: TreeNode = null) {
 *   var value: Int = _value
 *   var left: TreeNode = _left
 *   var right: TreeNode = _right
 * }
 */
object Solution8 {
  def maxDepth(root: TreeNode): Int = {
    var cnt = 0

    // считаем количество нод
    def number_of_nodes(node: TreeNode, n: Int): Int = {
      if (node != null) {
        // количество равно максимуму среди детей
        return Math.max(number_of_nodes(node.left, n + 1),
          number_of_nodes(node.right, n + 1))
      }
      else
        return n
    }

    cnt = number_of_nodes(root, 1)

    // отнимаем 1, чтобы учитывать нулевых детей
    cnt - 1
  }
}
