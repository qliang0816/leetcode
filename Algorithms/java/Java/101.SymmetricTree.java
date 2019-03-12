package Java;
/*
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
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode(int x) { val = x; }
 * }
 */
class Solution101 {
    public boolean isSymmetric(TreeNode root) {
        return root == null || isSymmetricHelper(root.left, root.right);
    }

    private boolean isSymmetricHelper(TreeNode p, TreeNode q) {
        if (p == null || q == null) return p == q;
        if (p.val != q.val) return false;
        return isSymmetricHelper(p.left, q.right) && isSymmetricHelper(p.right, q.left);
    }

    public static void main(String[] args) {
        TreeNode treeNode1 = TreeWrapper.stringToTreeNode("[1,2,2,3,4,4,3]");
        TreeNode treeNode2 = TreeWrapper.stringToTreeNode("[1,2,2,null,3,null,3]");
        TreeWrapper.prettyPrintTree(treeNode1);
        System.out.println(new Solution101().isSymmetric(treeNode1));
        TreeWrapper.prettyPrintTree(treeNode2);
        System.out.println(new Solution101().isSymmetric(treeNode2));

    }
}