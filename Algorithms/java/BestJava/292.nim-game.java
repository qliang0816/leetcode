/*
 * @lc app=leetcode id=292 lang=java
 *
 * [292] Nim Game
 *
 * https://leetcode.com/problems/nim-game/description/
 *
 * algorithms
 * Easy (55.62%)
 * Likes:    360
 * Dislikes: 1132
 * Total Accepted:    183.7K
 * Total Submissions: 330.2K
 * Testcase Example:  '4'
 *
 * You are playing the following Nim Game with your friend: There is a heap of
 * stones on the table, each time one of you take turns to remove 1 to 3
 * stones. The one who removes the last stone will be the winner. You will take
 * the first turn to remove the stones.
 * 
 * Both of you are very clever and have optimal strategies for the game. Write
 * a function to determine whether you can win the game given the number of
 * stones in the heap.
 * 
 * Example:
 * 
 * 
 * Input: 4
 * Output: false 
 * Explanation: If there are 4 stones in the heap, then you will never win the
 * game;
 * No matter 1, 2, or 3 stones you remove, the last stone will always
 * be 
 * removed by your friend.
 */
package BestJava;

class Solution292 {
    public boolean canWinNim(int n) {
        /*
        剩余石头为 4 的倍数的人必输
         */
        return n % 4 != 0;
    }
}