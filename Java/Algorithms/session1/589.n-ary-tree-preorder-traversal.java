 /*
  * @lc app=leetcode id=589 lang=java
  *
  * [589] N-ary Tree Preorder Traversal
  *
  * https://leetcode.com/problems/n-ary-tree-preorder-traversal/description/
  *
  * algorithms
  * Easy (68.46%)
  * Likes:    277
  * Dislikes: 38
  * Total Accepted:    53.2K
  * Total Submissions: 77.7K
  * Testcase Example:  '{"$id":"1","children":[{"$id":"2","children":[{"$id":"5","children":[],"val":5},{"$id":"6","children":[],"val":6}],"val":3},{"$id":"3","children":[],"val":2},{"$id":"4","children":[],"val":4}],"val":1}'
  *
  * Given an n-ary tree, return the preorder traversal of its nodes' values.
  *
  * For example, given a 3-ary tree:
  *
  *
  *
  *
  *
  *
  *
  * Return its preorder traversal as: [1,3,5,6,2,4].
  *
  *
  *
  * Note:
  *
  * Recursive solution is trivial, could you do it iteratively?
  *
  */
/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val,List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/
 package session1;

 import Utils.Node.Node;

 import java.util.ArrayList;
 import java.util.List;
 import java.util.Stack;

 class Solution589 {
     public List<Integer> preorder(Node root) {
         List<Integer> res = new ArrayList<>();
         if (root == null) return res;
         Stack<Node> stack = new Stack<>();
         stack.add(root);
         while (!stack.isEmpty()) {
             Node node = stack.pop();
             res.add(node.val);
             for (int i = node.children.size() - 1; i >= 0; i--) {
                 stack.add(node.children.get(i));
             }
         }
         return res;
     }

     List<Integer> res2 = new ArrayList<>();

     public List<Integer> preorder2(Node root) {
         if (root == null) return res2;
         res2.add(root.val);
         for (Node n : root.children) {
             preorder2(n);
         }
         return res2;
     }
 }

