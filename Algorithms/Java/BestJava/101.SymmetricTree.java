package BestJava;
/*
101. Symmetric Tree

Given a binary tree, check whether it is a mirror of itself (ie, symmetric around its center).

For example, this binary tree [1,2,2,3,4,4,3] is symmetric:

    1
   / \
  2   2
 / \ / \
3  4 4  3
But the following [1,2,2,null,3,null,3] is not:
    1
   / \
  2   2
   \   \
   3    3
Note:
Bonus points if you could solve it both recursively and iteratively.
 */

import Utils.TreeNode.TreeNode;
import Utils.TreeNode.TreeWrapper;

/**
 * Definition for a binary tree node.
 * public class Utils.TreeNode {
 * int val;
 * Utils.TreeNode left;
 * Utils.TreeNode right;
 * Utils.TreeNode(int x) { val = x; }
 * }
 */
class Solution101 {
    public boolean isSymmetric(TreeNode root) {
        return root == null || isSymmetricHelp(root.left, root.right);
    }

    private boolean isSymmetricHelp(TreeNode left, TreeNode right) {
        if (left == null || right == null)
            return left == right;
        if (left.val != right.val)
            return false;
        return isSymmetricHelp(left.left, right.right) && isSymmetricHelp(left.right, right.left);
    }

    public static void main(String[] args) {
        TreeNode node1 = TreeWrapper.stringToTreeNode("[1,2,2,3,4,4,3]");
        TreeWrapper.prettyPrintTree(node1);
        System.out.println(new Solution101().isSymmetric(node1));

        TreeNode node2 = TreeWrapper.stringToTreeNode("[1,2,2,null,3,null,3]");
        TreeWrapper.prettyPrintTree(node2);
        System.out.println(new Solution101().isSymmetric(node2));
    }
}