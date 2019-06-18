/*
 * @lc app=leetcode id=476 lang=java
 *
 * [476] Number Complement
 *
 * https://leetcode.com/problems/number-complement/description/
 *
 * algorithms
 * Easy (62.35%)
 * Likes:    543
 * Dislikes: 70
 * Total Accepted:    106.7K
 * Total Submissions: 171.2K
 * Testcase Example:  '5'
 *
 * Given a positive integer, output its complement number. The complement
 * strategy is to flip the bits of its binary representation.
 * 
 * Note:
 * 
 * The given integer is guaranteed to fit within the range of a 32-bit signed
 * integer.
 * You could assume no leading zero bit in the integer’s binary
 * representation.
 * 
 * 
 * 
 * Example 1:
 * 
 * Input: 5
 * Output: 2
 * Explanation: The binary representation of 5 is 101 (no leading zero bits),
 * and its complement is 010. So you need to output 2.
 * 
 * 
 * 
 * Example 2:
 * 
 * Input: 1
 * Output: 0
 * Explanation: The binary representation of 1 is 1 (no leading zero bits), and
 * its complement is 0. So you need to output 0.
 * 
 * 
 */
package session1;

class Solution476 {
    public int findComplement(int num) {
        int temp = num, c = 0;
        while (temp > 0) {
            temp >>= 1;
            c = (c <<= 1) + 1;
        }
        return num ^ c;
    }

    public static void main(String[] args) {
        System.out.println(new Solution476().findComplement(5));
    }
}