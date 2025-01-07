/* 6KYU CodeWars Invert Binary Tree

Invert a binary tree. Example:

From:

     4
   /   \
  2     7
 / \   / \
1   3 6   9
To:

     4
   /   \
  7     2
 / \   / \
9   6 3   1



*/
import java.util.*;
public class InvertBinaryTree {
    public static TreeNode invertTree(TreeNode root) {
      if (root == null) {
        return null;
      }
      TreeNode tmp = root.left;
      root.left = invertTree(root.right);
      root.right = invertTree(tmp);
      return root;
    }
}

// There is a TreeNode class available.
// public class TreeNode
// {
//     public int value;
//     public TreeNode left;
//     public TreeNode right;
// }