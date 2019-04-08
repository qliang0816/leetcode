package Java;
/*
You are a professional robber planning to rob houses along a street. Each house has a certain amount of money stashed, the only constraint stopping you from robbing each of them is that adjacent houses have security system connected and it will automatically contact the police if two adjacent houses were broken into on the same night.

Given a list of non-negative integers representing the amount of money of each house, determine the maximum amount of money you can rob tonight without alerting the police.

Example 1:

Input: [1,2,3,1]
Output: 4
Explanation: Rob house 1 (money = 1) and then rob house 3 (money = 3).
             Total amount you can rob = 1 + 3 = 4.
Example 2:

Input: [2,7,9,3,1]
Output: 12
Explanation: Rob house 1 (money = 2), rob house 3 (money = 9) and rob house 5 (money = 1).
             Total amount you can rob = 2 + 9 + 1 = 12.
 */

class Solution198 {
    public int rob(int[] nums) {
        int n = nums.length;
        if (n == 0) return 0;
        if (n == 1) return nums[0];
        int[] mem = new int[n];
        mem[0] = nums[0];
        mem[1] = Math.max(nums[0], nums[1]);
        for (int i = 2; i < n; i++) {
            mem[i] = Math.max(mem[i - 1], mem[i - 2] + nums[i]);
        }
        return mem[n - 1];
    }

    public static void main(String[] args) {
        System.out.println(new Solution198().rob(new int[]{1, 2, 3, 1}));
        System.out.println(new Solution198().rob(new int[]{2, 7, 9, 3, 1}));
        System.out.println(new Solution198().rob(new int[]{2, 1, 1, 2}));
    }
}