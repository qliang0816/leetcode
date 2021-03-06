import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/*
 * @lc app=leetcode.cn id=216 lang=java
 *
 * [216] 组合总和 III
 *
 * https://leetcode-cn.com/problems/combination-sum-iii/description/
 *
 * algorithms
 * Medium (68.74%)
 * Likes:    70
 * Dislikes: 0
 * Total Accepted:    9.6K
 * Total Submissions: 14K
 * Testcase Example:  '3\n7'
 *
 * 找出所有相加之和为 n 的 k 个数的组合。组合中只允许含有 1 - 9 的正整数，并且每种组合中不存在重复的数字。
 * 
 * 说明：
 * 
 * 
 * 所有数字都是正整数。
 * 解集不能包含重复的组合。 
 * 
 * 
 * 示例 1:
 * 
 * 输入: k = 3, n = 7
 * 输出: [[1,2,4]]
 * 
 * 
 * 示例 2:
 * 
 * 输入: k = 3, n = 9
 * 输出: [[1,2,6], [1,3,5], [2,3,4]]
 * 
 * 
 */

// @lc code=start
class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> list = new ArrayList<>();
        backTrace(list, new Stack<Integer>(), k, n, 1);
        return list;
    }

    public void backTrace(List<List<Integer>> list, Stack<Integer> temp, int size, int n, int start) {
        if (n < 0 || temp.size() > size) {
            return;
        }
        if (n == 0 && temp.size() == size) {
            list.add(new ArrayList<>(temp));
            return;
        }
        for (int i = start; i < 10; i++) {
            temp.push(i);
            backTrace(list, temp, size, n - i, i + 1);
            temp.pop();
        }
    }
}

// @lc code=end
