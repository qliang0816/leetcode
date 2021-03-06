/*
 * @lc app=leetcode id=704 lang=java
 *
 * [704] Binary Search
 *
 * https://leetcode.com/problems/binary-search/description/
 *
 * algorithms
 * Easy (47.48%)
 * Likes:    240
 * Dislikes: 30
 * Total Accepted:    49K
 * Total Submissions: 103.1K
 * Testcase Example:  '[-1,0,3,5,9,12]\n9'
 *
 * Given a sorted (in ascending order) integer array nums of n elements and a
 * target value, write a function to search target in nums. If target exists,
 * then return its index, otherwise return -1.
 * 
 * 
 * Example 1:
 * 
 * 
 * Input: nums = [-1,0,3,5,9,12], target = 9
 * Output: 4
 * Explanation: 9 exists in nums and its index is 4
 * 
 * 
 * 
 * Example 2:
 * 
 * 
 * Input: nums = [-1,0,3,5,9,12], target = 2
 * Output: -1
 * Explanation: 2 does not exist in nums so return -1
 * 
 * 
 * 
 * 
 * Note:
 * 
 * 
 * You may assume that all elements in nums are unique.
 * n will be in the range [1, 10000].
 * The value of each element in nums will be in the range [-9999, 9999].
 * 
 * 
 */


package topvote;

class Solution704 {
    public int search(int[] nums, int target) {
        int first = 0;
        int end = nums.length - 1;
        while (first <= end) {
            int mid = first + (end - first) / 2;
            if (nums[mid] < target) {
                first = mid + 1;
            } else if (nums[mid] > target) {
                end = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(new Solution704().search(new int[]{-1, 0, 3, 5, 9, 12}, 9));
        System.out.println(new Solution704().search(new int[]{-1, 0, 3, 5, 9, 12}, 2));
    }
}