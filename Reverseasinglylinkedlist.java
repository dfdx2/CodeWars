/*  6KYU CodeWars Reverse a singly-linked list

Implement a function reverse_list which takes a singly-linked list of nodes and returns a matching list in the reverse order.

Assume the presence of a class Node, which exposes the property value/Value and next/Next. next must either be set to the next Node in the list, or to None (or null) to indicate the end of the list.

To assist in writing tests, a function make_linked_list (Node.asLinkedList() in Java) has also been defined, which converts a python list to a linked list of Node.

The final tests will use a very long list. Be aware that a recursive solution will run out of stack.
*/
public class Reverseasinglylinkedlist{
  public static Node reverse(Node node) {   
    Node prev = null;
    while (node != null) {
      Node next_node = node.next;
      node.next = prev;
      prev = node;
      node = next_node;
    }
    return prev;
  }
}