/*
 * @lc app=leetcode id=532 lang=java
 *
 * [532] K-diff Pairs in an Array
 *
 * https://leetcode.com/problems/k-diff-pairs-in-an-array/description/
 *
 * algorithms
 * Easy (29.79%)
 * Likes:    353
 * Dislikes: 785
 * Total Accepted:    63.8K
 * Total Submissions: 214.2K
 * Testcase Example:  '[3,1,4,1,5]\n2'
 *
 *
 * Given an array of integers and an integer k, you need to find the number of
 * unique k-diff pairs in the array. Here a k-diff pair is defined as an
 * integer pair (i, j), where i and j are both numbers in the array and their
 * absolute difference is k.
 *
 *
 *
 * Example 1:
 *
 * Input: [3, 1, 4, 1, 5], k = 2
 * Output: 2
 * Explanation: There are two 2-diff pairs in the array, (1, 3) and (3,
 * 5).Although we have two 1s in the input, we should only return the number of
 * unique pairs.
 *
 *
 *
 * Example 2:
 *
 * Input:[1, 2, 3, 4, 5], k = 1
 * Output: 4
 * Explanation: There are four 1-diff pairs in the array, (1, 2), (2, 3), (3,
 * 4) and (4, 5).
 *
 *
 *
 * Example 3:
 *
 * Input: [1, 3, 1, 5, 4], k = 0
 * Output: 1
 * Explanation: There is one 0-diff pair in the array, (1, 1).
 *
 *
 *
 * Note:
 *
 * The pairs (i, j) and (j, i) count as the same pair.
 * The length of the array won't exceed 10,000.
 * All the integers in the given input belong to the range: [-1e7, 1e7].
 *
 *
 */
package session1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution532 {
    public int findPairs(int[] nums, int k) {
        if (k < 0) return 0;
        int res = 0;
        List<Integer> list = new ArrayList<>();
        Arrays.sort(nums);
        for (int num : nums) list.add(num);
        for (int i = 0; i < list.size(); i++) {
            if (i > 0 && list.get(i).equals(list.get(i - 1))) continue;
            if (list.subList(i + 1, list.size()).contains(list.get(i) + k) || list.subList(i + 1, list.size()).contains(list.get(i) - k))
                res++;
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(new Solution532().findPairs(new int[]{1, 2, 3, 4, 5}, 5));
        System.out.println(new Solution532().findPairs(new int[]{3, 1, 4, 1, 5}, 2));
        System.out.println(new Solution532().findPairs(new int[]{1, 2, 3, 4, 5}, 1));
        System.out.println(new Solution532().findPairs(new int[]{1, 3, 1, 5, 4}, 0));
    }
}

