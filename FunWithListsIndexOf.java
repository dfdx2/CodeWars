/* 7KYU CodeWars Fun With Lists : Index of

Implement the method indexOf (index_of in PHP), which accepts a linked list (head) and a value, and returns the index (zero based) of the first occurrence of that value if exists, or -1 otherwise.

For example: Given the list: 1 -> 2 -> 3 -> 3, and the value 3, indexOf / index_of should return 2.

The linked list is defined as follows:

class Node {
  public Object data;
  public Node next;

  Node(T data, Node next) {
    this.data = data;
    this.next = next;
  }
  
  Node(T data) {
    this(data, null);
  }
}
Note: the list may be null and can hold any type of value.

Good luck!

*/
class Solution {
    static int indexOf(Node head, Object value) {
      int x = 0;
      if (head == null) {
        return -1;
      }
      Node curr = head;
      while (curr != null) {
        if (curr.data == value) {
          break;
        }
        if (curr.data != value && curr.next == null) {
          return -1;
        } 
        if (curr.data != value) {
          x++;
          curr = curr.next;
        }   
      }
      return x;
    }
}
/*------------------------------------------------------------------------
class Solution {
  static int indexOf(Node head, Object value) {
    for (int i = 0; head != null; head = head.next, i++) {
      if (head.data.equals(value)) return i;
    }
    return -1;
  }
}
------------------------------------------------------------------------------
class Solution {
   static int indexOf(Node head, Object value) {
        int index = -1;
        while (head != null) {
            index++;
            if (head.data == value) {
                return index;
            }
            head = head.next;
        }
        return -1;
    }
}
--------------------------------------------------------------------------
class Solution {
  static int indexOf(Node head, Object value) {
    int index = 0;
    while (head != null) {
      if (head.data.equals(value)) {
        return index;
      }
      index++;
      head = head.next;
    }
    return -1;
  }
}
----------------------------------------------------------------------------
class Solution {

  // Use recursion :-)
  static int indexOf(final Node node, Object val) {
    if (node == null) return -1;
    if (node.data.equals(val)) return 0;
    final int tmp = indexOf(node.next, val);
    return tmp == -1 ? -1 : 1 + tmp;
  }
  
}

*/