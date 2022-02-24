import org.scalatest.funsuite._

import info.shunsvineyard.forest.binarytrees.*
import org.scalatest.funspec.AnyFunSpec


class NodeSpec extends AnyFunSuite {
  var node = new Node(key = 17, data = "17")
  test("Node's basic features") {
    assert(node.key == 17)
    assert(node.data == "17")
  }
}


class BinarySearchTreeSpec extends AnyFunSuite {
  val tree = new BinarySearchTree()
  test("Tree should be empty") {
    assert(tree.root.isEmpty)
  }

  tree.insert(key = 23, data = "23")
  test("Tree should contain one node") {
    assert(tree.root.get.key == 23)
    assert(tree.search(key = 23).get.key == 23)
  }

}
