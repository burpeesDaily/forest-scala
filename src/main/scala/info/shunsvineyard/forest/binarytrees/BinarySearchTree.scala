package info.shunsvineyard.forest.binarytrees

class Node(
    val key: Int,
    val data: String,
    var parent: Option[Node] = None,
    var left: Option[Node] = None,
    var right: Option[Node] = None
)

class BinarySearchTree() {
  var root: Option[Node] = None

  def search(key: Int): Option[Node] = {
    var current: Option[Node] = root

    while (!current.isEmpty) {
      if (key < current.get.key) {
        current = current.get.left
      } else if (key > current.get.key) {
        current = current.get.right
      } else {
        current
      }
    }
    None
  }

  def insert(key: Int, data: String): Unit = {
    var newNode = new Node(key = key, data = data)
    var parent: Option[Node] = None
    var current: Option[Node] = root
    while (!current.isEmpty) {
      parent = current
      if (newNode.key < current.get.key) {
        current = current.get.left
      } else if (newNode.key > current.get.key) {
        current = current.get.right
      } else {
        throw new Exception(s"Duplicate key $key")
      }
    }
    newNode.parent = parent
    if (parent.isEmpty) {
      root = Some(newNode)
    } else if (newNode.key < parent.get.key) {
      parent.get.left = Some(newNode)
    } else {
      parent.get.right = Some(newNode)
    }
  }

  def delete(key: Int): Unit = {
    ???
  }
}
