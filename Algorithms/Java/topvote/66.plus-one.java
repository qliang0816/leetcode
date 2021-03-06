/*
 * @lc app=leetcode id=66 lang=java
 *
 * [66] Plus One
 *
 * https://leetcode.com/problems/plus-one/description/
 *
 * algorithms
 * Easy (41.19%)
 * Likes:    847
 * Dislikes: 1517
 * Total Accepted:    390.2K
 * Total Submissions: 947.2K
 * Testcase Example:  '[1,2,3]'
 *
 * Given a non-empty array of digits representing a non-negative integer, plus
 * one to the integer.
 * 
 * The digits are stored such that the most significant digit is at the head of
 * the list, and each element in the array contain a single digit.
 * 
 * You may assume the integer does not contain any leading zero, except the
 * number 0 itself.
 * 
 * Example 1:
 * 
 * 
 * Input: [1,2,3]
 * Output: [1,2,4]
 * Explanation: The array represents the integer 123.
 * 
 * 
 * Example 2:
 * 
 * 
 * Input: [4,3,2,1]
 * Output: [4,3,2,2]
 * Explanation: The array represents the integer 4321.
 * 
 */

package topvote;

class Solution66 {
    public int[] plusOne(int[] digits) {
        int n = digits.length;
        for (int i = n - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }

            digits[i] = 0;
        }

        int[] newNumber = new int[n + 1];
        newNumber[0] = 1;

        return newNumber;
    }

    public static void main(String[] args) {
        int[] digits1 = {1, 2, 3};
        int[] digits2 = {1, 2, 9};
        int[] digits3 = {9, 9, 9};
        int[] res1 = new Solution66().plusOne(digits1);
        int[] res2 = new Solution66().plusOne(digits2);
        int[] res3 = new Solution66().plusOne(digits3);
        for (int i : res1) {
            System.out.println(i);
        }
        System.out.println("----");
        for (int i : res2) {
            System.out.println(i);
        }
        System.out.println("----");
        for (int i : res3) {
            System.out.println(i);
        }
    }
}