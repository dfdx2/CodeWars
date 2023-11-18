/*  7KYU CodeWars Fun With Lists: Last Index Of

Implement the method lastIndexOf (last_index_of in PHP and Python), 
which accepts a linked list (head) and a value, and returns the index 
(zero based) of the last occurrence of that value if exists, or -1 otherwise.

For example: Given the list: 1 -> 2 -> 3 -> 3, and the value 3, 
lastIndexOf / last_index_of should return 3.

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

*/
class Solution {
    static int lastIndexOf(Node head, Object value) {
      int x = 0;
      int y = -1;
      int temp = x;
      if (head == null) {
        return -1;
      }
      Node curr = head;
      while (curr != null) {
        if (curr.data == value) {
          temp = x;
          curr = curr.next;
          x++;
          y++;
        }
        else if (curr.data != value) {
          x++;
          curr = curr.next;
        }
      }
      return (y == -1) ? -1 : temp;
    }
}
/*------------------------------------------------------------------------
class Solution {
  static int lastIndexOf(Node head, Object value) {
    int index = -1;
    for (int i = 0; head != null; head = head.next, i++) {
      if (head.data.equals(value)) index = i;
    }
    return index;
  }
}
--------------------------------------------------------------------------
class Solution {
  static int lastIndexOf(Node head, Object value) {
    int lastFoundIndex = -1;
    int index = 0;
    Node currentNode = head;

    while (currentNode != null) {
      if (currentNode.data.equals(value)) {
        lastFoundIndex = index;
      }
      currentNode = currentNode.next;
      index++;
    }

    return lastFoundIndex;
  }
}
--------------------------------------------------------------------------
import java.util.HashMap;
import java.util.function.Function;

class Solution {
   static int lastIndexOf(Node head, Object value) {
      if (head == null) { return -1; }
      int retVal = lastIndexOf(head.next, value);
      return retVal + (retVal > -1 || head.data == value ? 1 : 0);
   }
}
---------------------------------------------------------------------------
interface Solution {
  static int lastIndexOf(Node head, Object value) {
    int result = -1;
    for (int i = 0; head != null; head = head.next, i++) {
      if (head.data.equals(value)) {
        result = i;
      }
    }
    return result;
  }
}
----------------------------------------------------------------------------
class Solution {
  static int lastIndexOf(Node head, Object value) {
    Node current = head;
    int lastIndex =-1;
    for(int index = 0 ; current != null;index++){
      if(current.data.equals(value)){
        lastIndex = index;
      }
      current = current.next;
    }
    return lastIndex;
  }
}
---------------------------------------------------------------------------
class Solution {
  static int lastIndexOf(Node head, Object value) {
    return loop(head, value, -1, 0);
  }
  
  static int loop(Node next, Object value, int index, int count) {
    if (next == null) return index;
    if (next.data.equals(value)) index = count;
    return loop(next.next, value, index, ++count);
  }
}
-----------------------------------------------------------------------------
import java.util.*;

class Solution {
  static int lastIndexOf(Node head, Object value) {
    var list = new ArrayList<>();
    Node node = head;
    
    while(node != null) {
      list.add(node.data);
      node = node.next;
    }
    
    return list.lastIndexOf(value);
  }
  
}
*/