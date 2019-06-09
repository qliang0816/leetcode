/*
 * @lc app=leetcode id=492 lang=java
 *
 * [492] Construct the Rectangle
 *
 * https://leetcode.com/problems/construct-the-rectangle/description/
 *
 * algorithms
 * Easy (48.67%)
 * Likes:    131
 * Dislikes: 200
 * Total Accepted:    44.9K
 * Total Submissions: 92.2K
 * Testcase Example:  '1'
 *
 * 
 * For a web developer, it is very important to know how to design a web page's
 * size. So, given a specific rectangular web page’s area, your job by now is
 * to design a rectangular web page, whose length L and width W satisfy the
 * following requirements:
 * 1. The area of the rectangular web page you designed must equal to the given
 * target area.
 * 2. The width W should not be larger than the length L, which means L >= W.
 * 3. The difference between length L and width W should be as small as
 * possible.
 * 
 * You need to output the length L and the width W of the web page you designed
 * in sequence.
 * 
 * 
 * 
 * Example:
 * 
 * Input: 4
 * Output: [2, 2]
 * Explanation: The target area is 4, and all the possible ways to construct it
 * are [1,4], [2,2], [4,1]. 
 * But according to requirement 2, [1,4] is illegal; according to requirement
 * 3,  [4,1] is not optimal compared to [2,2]. So the length L is 2, and the
 * width W is 2.
 * 
 * 
 * 
 * Note:
 * 
 * The given area won't exceed 10,000,000 and is a positive integer
 * The web page's width and length you designed must be positive integers.
 * 
 * 
 */
package Java;

class Solution492 {
    public int[] constructRectangle(int area) {
        int[] res = new int[2];
        res[0] = (int) Math.sqrt(area);
        res[1] = (int) Math.sqrt(area);
        while (res[0] * res[1] != area) {
            if (res[0] * res[1] > area) {
                res[1]--;
            } else if (res[0] * res[1] < area) {
                res[0]++;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] res = new Solution492().constructRectangle(4);
        System.out.printf("%d %d", res[0], res[1]);
    }
}