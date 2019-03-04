package BestJava;
/*
226. Invert Binary Tree

Invert a binary tree.

Example:

Input:

     4
   /   \
  2     7
 / \   / \
1   3 6   9
Output:

     4
   /   \
  7     2
 / \   / \
9   6 3   1
Trivia:
This problem was inspired by this original tweet by Max Howell:

Google: 90% of our engineers use the software you wrote (Homebrew), but you can’t invert a binary tree on a whiteboard so f*** off.
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
class Solution226 {

    public TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return null;
        }

        final TreeNode left = root.left, right = root.right;
        root.left = invertTree(right);
        root.right = invertTree(left);
        return root;
    }

    public static void main(String[] args) {
        TreeNode treeNode = TreeWrapper.stringToTreeNode("[4,2,7,1,3,6,9]");
        TreeWrapper.prettyPrintTree(treeNode);
        TreeNode root = new Solution226().invertTree(treeNode);
        TreeWrapper.prettyPrintTree(root);
    }
}