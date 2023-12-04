/* 7KYU CodeWars Find Max Tree Node

You are given a binary tree. Implement the method findMax which returns the maximal node value in the tree.

For example, maximum in the following Tree is 11.

              7
            /   \ 
           /     \
          5       2
           \       \
           6        11          
           /\      /
          1  9   4
Note:

Tree node values any integer value.
Tree can unbalanced and unsorted.
The root argument is never an empty tree.
You are given a tree node class as follows:

class TreeNode {
  TreeNode  left;
  TreeNode  right;
  int value;
}
*/
public class FindMaxValueInTree {

    static int findMax(TreeNode  root) {
        if (root == null) {
          return Integer.MIN_VALUE;
        }
      int result = root.value;
      int left = findMax(root.left);
      int right = findMax(root.right);
      if (left > result) {
        result = left;
      }
      if (right > result) {
        result = right;
      }
      return result;
    }
}
/*--------------------------------------------------------------------------
public class FindMaxValueInTree {

    static int findMax(TreeNode n) {
      return n == null ? Integer.MIN_VALUE : Math.max(n.value, Math.max(findMax(n.left), findMax(n.right)));
    }
}
----------------------------------------------------------------------------
public class FindMaxValueInTree {

  static int findMax(TreeNode  root) {
    int numMax = root.value;
    if(root.left != null) {
      numMax = Math.max(numMax, findMax(root.left));
    }
    if(root.right != null) {
      numMax = Math.max(numMax, findMax(root.right));
    }
    return numMax;
  }
}
---------------------------------------------------------------------------
class FindMaxValueInTree {
  static int findMax(TreeNode root) {
      if (root == null) {
          return Integer.MIN_VALUE;
      }
      int leftMax = findMax(root.left);
      int rightMax = findMax(root.right);
      return leftMax > rightMax ? Math.max(root.value, leftMax) : Math.max(root.value, rightMax);
  }
}
----------------------------------------------------------------------------
import java.util.Deque;
import java.util.ArrayDeque;

public class FindMaxValueInTree {
  // simple implementation of DFS algorithm
  public static int findMax(TreeNode  root) {
    Deque<TreeNode> stack = new ArrayDeque<>();
    stack.push(root);
    int max = Integer.MIN_VALUE;
    while (!stack.isEmpty()) {
      TreeNode cur = stack.pop();
      max = Math.max(cur.value, max);
      if (cur.left != null) stack.push(cur.left);
      if (cur.right != null) stack.push(cur.right);
    }
    return max;
  }
}
----------------------------------------------------------------------------
public class FindMaxValueInTree {

    static int findMax(TreeNode root) {
        return
            Math.max(
                root.left != null ? Math.max(root.value, findMax(root.left)) : root.value,
                root.right != null ? Math.max(root.value, findMax(root.right)) : root.value
            );
    }

}
-----------------------------------------------------------------------------
mport java.util.LinkedList;
import java.util.Queue;

public class FindMaxValueInTree {

    static int findMax(TreeNode  root) {
      
      Queue<TreeNode> queue = new LinkedList<>();
      int max = Integer.MIN_VALUE;
      
      queue.add(root);
      
      while (!queue.isEmpty()) {
        TreeNode treenode = queue.poll();
        
        if (treenode.value > max) {
          max = treenode.value;
        }
        
        if (treenode.left != null) {
          queue.add(treenode.left);
        }
        
        if (treenode.right != null) {
          queue.add(treenode.right);
        }
      }
      
      return max;
    }
}
-----------------------------------------------------------------------------
public class FindMaxValueInTree {
    static int findMax(TreeNode  root) {
      int l = root.left != null ? findMax(root.left) : Integer.MIN_VALUE;
      int r = root.right != null ? findMax(root.right) : Integer.MIN_VALUE;
      return Math.max(root.value, Math.max(l, r));
    }
}
------------------------------------------------------------------------------
public class FindMaxValueInTree {

    static int findMax(TreeNode  root) {
        return findMax(root, root.value);
    }
  
  static int findMax(TreeNode root, int max) {
      if (root != null) {
        max = Math.max(max, root.value);
        max = Math.max(max, findMax(root.left, max));
        max = Math.max(max, findMax(root.right, max));
      }
      return max;
    }
}
------------------------------------------------------------------------------
public class FindMaxValueInTree {

    static int findMax(TreeNode root) {
        return root == null ? Integer.MIN_VALUE :
            Math.max(root.value, Math.max(findMax(root.left), findMax(root.right)));
    }
}
*/