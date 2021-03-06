/*
 * @lc app=leetcode id=748 lang=java
 *
 * [748] Shortest Completing Word
 *
 * https://leetcode.com/problems/shortest-completing-word/description/
 *
 * algorithms
 * Easy (54.05%)
 * Likes:    114
 * Dislikes: 424
 * Total Accepted:    19.9K
 * Total Submissions: 36.8K
 * Testcase Example:  '"1s3 PSt"\n["step","steps","stripe","stepple"]'
 *
 * 
 * Find the minimum length word from a given dictionary words, which has all
 * the letters from the string licensePlate.  Such a word is said to complete
 * the given string licensePlate
 * 
 * Here, for letters we ignore case.  For example, "P" on the licensePlate
 * still matches "p" on the word.
 * 
 * It is guaranteed an answer exists.  If there are multiple answers, return
 * the one that occurs first in the array.
 * 
 * The license plate might have the same letter occurring multiple times.  For
 * example, given a licensePlate of "PP", the word "pair" does not complete the
 * licensePlate, but the word "supper" does.
 * 
 * 
 * Example 1:
 * 
 * Input: licensePlate = "1s3 PSt", words = ["step", "steps", "stripe",
 * "stepple"]
 * Output: "steps"
 * Explanation: The smallest length word that contains the letters "S", "P",
 * "S", and "T".
 * Note that the answer is not "step", because the letter "s" must occur in the
 * word twice.
 * Also note that we ignored case for the purposes of comparing whether a
 * letter exists in the word.
 * 
 * 
 * 
 * Example 2:
 * 
 * Input: licensePlate = "1s3 456", words = ["looks", "pest", "stew", "show"]
 * Output: "pest"
 * Explanation: There are 3 smallest length words that contains the letters
 * "s".
 * We return the one that occurred first.
 * 
 * 
 * 
 * Note:
 * 
 * licensePlate will be a string with length in range [1, 7].
 * licensePlate will contain digits, spaces, or letters (uppercase or
 * lowercase).
 * words will have a length in the range [10, 1000].
 * Every words[i] will consist of lowercase letters, and have length in range
 * [1, 15].
 * 
 * 
 */
package topvote;

class Solution748 {
    public String shortestCompletingWord(String licensePlate, String[] words) {
        licensePlate = licensePlate.toLowerCase();
        int[] map = new int[26];
        int count = 0;
        for (char c : licensePlate.toCharArray()) {
            if (c >= 'a' && c <= 'z') {
                count++;
                map[c - 'a']++;
            }
        }

        String result = null;
        int minLen = Integer.MAX_VALUE;
        for (String s : words) {
            int[] m = new int[26];
            int ct = 0;
            for (char c : s.toCharArray()) {
                if (m[c - 'a'] < map[c - 'a']) {
                    m[c - 'a']++;
                    ct++;
                    if (ct == count) {
                        if (s.length() < minLen) {
                            result = s;
                            minLen = s.length();
                        }
                        break;
                    }
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(new Solution748().shortestCompletingWord("1s3 PSt", new String[]{"step", "steps", "stripe", "stepple"}));
        System.out.println(new Solution748().shortestCompletingWord("1s3 456", new String[]{"looks", "pest", "stew", "show"}));
    }
}