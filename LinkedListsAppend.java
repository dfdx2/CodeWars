/* 7KYU CodeWars Linked Lists - Append

Linked Lists - Append

Write an Append() function which appends one linked list to another. 
The head of the resulting list should be returned.

var listA = 1 -> 2 -> 3 -> null
var listB = 4 -> 5 -> 6 -> null
append(listA, listB) === 1 -> 2 -> 3 -> 4 -> 5 -> 6 -> null
If both listA and listB are null/NULL/None/nil, return null/NULL/None/nil. 
If one list is null/NULL/None/nil and the other is not, simply return the 
non-null/NULL/None/nil list.

The push() and buildOneTwoThree() (build_one_two_three() in PHP and ruby) 
functions need not be redefined. The Node class is also predefined for you in PHP.

Inspired by Stanford Professor Nick Parlante's excellent Linked List teachings.

*/
class LinkedListsAppend {

	int data;
	Node next = null;

	Node(final int data) {
		this.data = data;
	}

	public Node(int data, Node next) {
		this.data = data;
		this.next = next;
	}

	public static Node append(Node listA, Node listB) {
		if (listA == null && listB == null) {
      return null;
    }
    else if (listA != null && listB != null) {
      Node listC = listA;
      while (listC.next != null) {
        listC = listC.next;
      }
      listC.next = listB;
      return listA;
    }
    return listA != null ? listA : listB;
	}
}
/*---------------------------------------------------------
class Node {

	int data;
	Node next = null;

	Node(final int data) {
		this.data = data;
	}

	public Node(int data, Node next) {
		this.data = data;
		this.next = next;
	}

	public static Node append(Node listA, Node listB) {
		if ( listA == null ) {
			return listB;
		}
		Node tmp = listA;
		while ( tmp.next != null ) {
			tmp = tmp.next;
		}
		tmp.next = listB;
		return listA;
	}
}
-----------------------------------------------------------
class Node {

	int data;
	Node next = null;

	Node(final int data) {
		this.data = data;
	}

	public Node(int data, Node next) {
		this.data = data;
		this.next = next;
	}

	public static Node append(Node listA, Node listB) {
		return null == listA ? listB : null == listB ? listA :
      new Node(listA.data, append(listA.next, listB));
	}
}
-----------------------------------------------------------
class Node {

        int data;
        Node next = null;

        Node(final int data) {
            this.data = data;
        }

        public Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }

        public static Node append(Node listA, Node listB) {
            if ((listA == null)||(listB == null)) 
               return listA == null ? listB : listA;
          
            getTail(listA).next = listB;
            return listA;
        }
        private static Node getTail(Node node) {
            while (node.next != null) {
                node = node.next;
            }
            return node;
        }
    }
-----------------------------------------------------------
class Node {

	int data;
	Node next = null;

	Node(final int data) {
		this.data = data;
	}

	public Node(int data, Node next) {
		this.data = data;
		this.next = next;
	}

	public static Node append(Node listA, Node listB) {
		Node rif=listA;
    Node rifB=listB;
    Node rifR=rif;
    if(rif==null && rifB!=null) return listB;
    if(rif!=null && rifB==null) return listA;
    if(rif==null && rifB==null) return listA;
    while(rifR.next!=null){
        rifR=rifR.next;
    }
    while(rifB!=null){
        rifR.next=rifB;
        rifR=rifR.next;
        rifB=rifB.next;
    }
    return rif;
	}
}
-----------------------------------------------------------
class Node {

	int data;
	Node next = null;

	Node(final int data) {
		this.data = data;
	}

	public Node(int data, Node next) {
		this.data = data;
		this.next = next;
	}

	public static Node append(Node listA, Node listB) {
    if(listA==null&&listB==null)return null;
    if(listA==null && listB!=null)return listB;
    if(listA!=null && listB==null)return listA;
    Node aux = listA;
    while(aux.next!=null){
       aux = aux.next; 
    }
    aux.next = listB;
		return listA;
	}
}
-----------------------------------------------------------
class Node {

	final int data;
	Node next;

	Node(int data) {
		this.data = data;
	}

	public Node(int data, Node next) {
		this.data = data;
		this.next = next;
	}

	public static Node append(Node listA, Node listB) {
		return listA == null ? listB : new Node(listA.data, append(listA.next, listB));
	}
}
-----------------------------------------------------------
class Node {

	int data;
	Node next = null;

	Node(final int data) {
		this.data = data;
	}

	public Node(int data, Node next) {
		this.data = data;
		this.next = next;
	}

	public static Node append(Node listA, Node listB) {
    if(listA == null) return listB;
    Node tail = listA;
    while(tail.next != null) tail = tail.next;
    tail.next = listB;
    return listA;
	}
}
------------------------------------------------------------
lass Node {

	int data;
	Node next = null;

	Node(final int data) {
		this.data = data;
	}

	public Node(int data, Node next) {
		this.data = data;
		this.next = next;
	}

	public static Node append(Node listA, Node listB) {
    if(listA == null && listB == null) return null;
    if(listA == null || listB == null){
      return (listA == null)? listB: listA;
    }
    Node temp = listA;
    while(temp.next != null){
      temp = temp.next;
    }
    temp.next = listB;
		return listA;
	}
}
*/