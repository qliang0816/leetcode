/*
 * @lc app=leetcode id=507 lang=java
 *
 * [507] Perfect Number
 *
 * https://leetcode.com/problems/perfect-number/description/
 *
 * algorithms
 * Easy (34.21%)
 * Likes:    151
 * Dislikes: 431
 * Total Accepted:    40.4K
 * Total Submissions: 118K
 * Testcase Example:  '28'
 *
 * We define the Perfect Number is a positive integer that is equal to the sum
 * of all its positive divisors except itself. 
 * 
 * Now, given an integer n, write a function that returns true when it is a
 * perfect number and false when it is not.
 * 
 * 
 * Example:
 * 
 * Input: 28
 * Output: True
 * Explanation: 28 = 1 + 2 + 4 + 7 + 14
 * 
 * 
 * 
 * Note:
 * The input number n will not exceed 100,000,000. (1e8)
 * 
 */
package topvote;

class Solution507 {
    public boolean checkPerfectNumber(int num) {
        if (num == 1) return false;

        int sum = 1;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                sum += i + num / i;
            }
        }

        return sum == num;
    }

    public static void main(String[] args) {
        System.out.println(new Solution507().checkPerfectNumber(28));
    }
}