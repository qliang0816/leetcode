import java.util.HashMap;
import Utils.TreeNode.*;

/*
 * @lc app=leetcode.cn id=105 lang=java
 *
 * [105] 从前序与中序遍历序列构造二叉树
 *
 * https://leetcode-cn.com/problems/construct-binary-tree-from-preorder-and-inorder-traversal/description/
 *
 * algorithms
 * Medium (61.88%)
 * Likes:    258
 * Dislikes: 0
 * Total Accepted:    27.5K
 * Total Submissions: 44.3K
 * Testcase Example:  '[3,9,20,15,7]\n[9,3,15,20,7]'
 *
 * 根据一棵树的前序遍历与中序遍历构造二叉树。
 * 
 * 注意:
 * 你可以假设树中没有重复的元素。
 * 
 * 例如，给出
 * 
 * 前序遍历 preorder = [3,9,20,15,7]
 * 中序遍历 inorder = [9,3,15,20,7]
 * 
 * 返回如下的二叉树：
 * 
 * ⁠   3
 * ⁠  / \
 * ⁠ 9  20
 * ⁠   /  \
 * ⁠  15   7
 * 
 */

// @lc code=start
/**
 * Definition for a binary tree node. public class TreeNode { int val; TreeNode
 * left; TreeNode right; TreeNode(int x) { val = x; } }
 */
class Solution {
    int pre_inx = 0;
    int[] preorder;
    int[] inorder;
    HashMap<Integer, Integer> inx_map = new HashMap<>();

    public TreeNode helper(int in_left, int in_right) {
        if (in_left == in_right) {
            return null;
        }
        int root_val = this.preorder[this.pre_inx++];
        TreeNode root = new TreeNode(root_val);

        int index = inx_map.get(root_val);

        root.left = helper(in_left, index);
        root.right = helper(index + 1, in_right);
        return root;
    }

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        this.preorder = preorder;
        this.inorder = inorder;
        int idx = 0;
        for (Integer val : inorder) {
            this.inx_map.put(val, idx++);
        }
        return helper(0, inorder.length);
    }
}
// @lc code=end
