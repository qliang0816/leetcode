/*
 * @lc app=leetcode id=724 lang=java
 *
 * [724] Find Pivot Index
 *
 * https://leetcode.com/problems/find-pivot-index/description/
 *
 * algorithms
 * Easy (41.04%)
 * Likes:    592
 * Dislikes: 148
 * Total Accepted:    68.2K
 * Total Submissions: 166.2K
 * Testcase Example:  '[1,7,3,6,5,6]'
 *
 * Given an array of integers nums, write a method that returns the "pivot"
 * index of this array.
 * 
 * We define the pivot index as the index where the sum of the numbers to the
 * left of the index is equal to the sum of the numbers to the right of the
 * index.
 * 
 * If no such index exists, we should return -1. If there are multiple pivot
 * indexes, you should return the left-most pivot index.
 * 
 * Example 1:
 * 
 * 
 * Input: 
 * nums = [1, 7, 3, 6, 5, 6]
 * Output: 3
 * Explanation: 
 * The sum of the numbers to the left of index 3 (nums[3] = 6) is equal to the
 * sum of numbers to the right of index 3.
 * Also, 3 is the first index where this occurs.
 * 
 * 
 * 
 * 
 * Example 2:
 * 
 * 
 * Input: 
 * nums = [1, 2, 3]
 * Output: -1
 * Explanation: 
 * There is no index that satisfies the conditions in the problem
 * statement.
 * 
 * 
 * 
 * 
 * Note:
 * 
 * 
 * The length of nums will be in the range [0, 10000].
 * Each element nums[i] will be an integer in the range [-1000, 1000].
 * 
 * 
 * 
 * 
 */
package topvote;

class Solution724 {
    public int pivotIndex(int[] nums) {
        int total = 0, sum = 0;
        for (int num : nums) {
            total += num;
        }
        for (int i = 0; i < nums.length; sum += nums[i++]) {
            if (sum * 2 == total - nums[i]) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 7, 3, 6, 5, 6};
        int[] nums2 = {1, 2, 3};
        System.out.println(new Solution724().pivotIndex(nums1));
        System.out.println(new Solution724().pivotIndex(nums2));
    }
}