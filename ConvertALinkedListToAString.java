/* 7KYU CodeWars Convert A Linked List To A String

Preloaded

Preloaded for you is a class, struct or derived data type Node 
( depending on the language ) used to construct linked lists in 
 this Kata:

class Node {
    private int data;
    private Node next;
    
    public Node(int data, Node next) {
        this.data = data;
        this.next = next;
    }
    
    public Node(int data) {
        this.data = data;
        this.next = null;
    }

    public int getData() {
        return data;
    }

    public Node getNext() {
        return next;
    }
}

Prerequisites

This Kata assumes that you are already familiar with the idea of a linked list. 
If you do not know what that is, you may want to read this article on Wikipedia. 
Specifically, the linked lists this Kata is referring to are singly linked lists, 
where the value of a specific node is stored in its data / $data / Data property, 
the reference to the next node is stored in its next / $next / Next / next_node 
property and the terminator for a list is null / NULL / None / nil / nullptr / null().

Task

Create a function stringify which accepts an argument list / $list and returns a 
string representation of the list. The string representation of the list starts 
with the value of the current Node, specified by its data / $data / Data property, 
followed by a whitespace character, an arrow and another whitespace character (" -> "), 
followed by the rest of the list. The end of the string representation of a list 
must always end with null / NULL / None / nil / nullptr / null() ( all caps or all 
lowercase depending on the language you are undertaking this Kata in ). For example, 
given the following list:

new Node(1, new Node(2, new Node(3)))
... its string representation would be:

And given the following linked list:

... its string representation would be:

Note that null / NULL / None / nil / nullptr / null() itself is also considered a valid 
linked list. In that case, its string representation would simply be "null" / "NULL" / 
"None" / "nil" / "nullptr" / @"NULL" / "null()" ( again, depending on the language ).

For the simplicity of this Kata, you may assume that any Node in this Kata may only 
contain non-negative integer values. For example, you will not encounter a Node whose 
data / $data / Data property is "Hello World".

Enjoy, and don't forget to check out my other Kata Series :D


*/

public class ConvertALinkedListToAString {
  public static String stringify(Node list) {
      return list == null ? "null" : list.getData() + " -> " + stringify(list.getNext());
  }
}
/*--------------------------------------------------
public class Kata {

  public static String stringify(Node list) {
      StringBuilder sb = new StringBuilder();
      Node next = list;
      while(next!=null){
        sb.append(next.getData());
        sb.append(" -> ");
        next = next.getNext();
      }
      sb.append("null");
      return sb.toString();
  }

}
----------------------------------------------------
public class Kata {
  public static String stringify(Node list) {
    return stringify(list, new StringBuilder()).toString();
  }
  
  private static StringBuilder stringify(Node list, StringBuilder stringified) {
    return list == null
      ? stringified.append("null")
      : stringify(list.getNext(), stringified.append(list.getData()).append(" -> "));
  }
}
-----------------------------------------------------
class Kata {
    static String stringify(Node node) {
        StringBuilder sb = new StringBuilder();
        while (node != null) {
            sb.append(node.getData()).append(" -> ");
            node = node.getNext();
        }
        return sb.append("null").toString();
    }
}
-----------------------------------------------------
public class Kata {

  public static String stringify(Node list) {
    Node current = list;
    StringBuilder result = new StringBuilder("");
    while(current != null){
      result.append(current.getData());
      result.append(" -> ");
      current = current.getNext();
    }
    result.append(current);
      return result.toString();
  }

}
------------------------------------------------------
public class Kata {

  public static String stringify(Node list) {
      StringBuilder sbResult = new StringBuilder();
      while (list != null) {
        sbResult.append(list.getData()).append(" -> ");
        list = list.getNext();
      }
      sbResult.append("null");
      
      System.out.println(sbResult);
      return sbResult.toString();
  }

}
-------------------------------------------------------
public class Kata {

  public static String stringify(Node list) {
    String result = "";
    for(Node i = list; i != null; i = i.getNext()){
      result += i.getData() + " -> ";
    }
    return result + "null";
  }

}
-------------------------------------------------------
public class Kata {

  public static String stringify(Node list) {
       if (list == null)
            return "null";

        StringBuilder sb = new StringBuilder();
        while (list != null) {
            sb.append(list.getData()).append(" -> ");
            list = list.getNext();
        }
        return sb.append("null").toString();
  }

}
-------------------------------------------------------
public class Kata {

  public static String stringify(Node list) {
      StringBuilder s = new StringBuilder();
      while(list != null)
      {
        s.append(list.getData());
        s.append(" -> ");
        list = list.getNext();
      }
       s.append("null");
      return s.toString();
  }

}
*/