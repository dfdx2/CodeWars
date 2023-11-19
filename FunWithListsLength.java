/* 7KYU CodeWars Fun With Lists: Length

Implement the method length, which accepts a linked list (head), 
and returns the length of the list.

For example: Given the list: 1 -> 2 -> 3 -> 4, length should return 4.

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
  static int length(Node head) {
    Node curr = head;
    int count = 0;
    if (head == null) {
      return 0;
    }
    while (curr != null) {
      curr = curr.next;
      count++;
    }
    return count;
  }
}
/*--------------------------------------------------------------------------
class Solution {
  static int length(Node head) {
    if(head == null) return 0;
    return length(head.next) + 1;
  }
}
-----------------------------------------------------------------------------
class Solution {
  static int length(Node head) {
    return head == null ? 0 : 1 + length(head.next);
  }
}
-----------------------------------------------------------------------------
import java.util.Optional;

class Solution {
  static int length(Node head) {
    return Optional
              .ofNullable(head)
              .map(node -> 1 + length(node.next))
              .orElse(0);
  }
}
-----------------------------------------------------------------------------
import java.util.stream.Stream;

class Solution {
    static int length(Node head) {
        return head == null 
                ? 0 
                : (int)createStream(head).count();
    }
    
    private static Stream<Node> createStream(Node head){
        Stream.Builder<Node> builder = Stream.builder();
        Node current = head;
        builder.add(current);
        while(current.next != null){
            builder.add(current.next);
            current = current.next;
        }
        return builder.build();
    }
}

*/