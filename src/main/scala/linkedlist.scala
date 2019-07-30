package datastruct

class LinkedList [A] {
    class Node [A] (elem:A) {
      var next: Node[A] = _
      override def toString = elem.toString 
    }

    var head:Node[A] = _

    def add(elem:A) {
      val n = new Node(elem)
      n.next = head
      head = n
    }

    private def printNodes(n: Node[A]) {
      if(n != null) {
        println(n)
        printNodes(n.next)
      }
    }

    def printAll() {
      printNodes(head)
    }
  }
