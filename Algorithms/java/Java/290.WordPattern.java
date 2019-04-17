package Java;
/*
Given a pattern and a string str, find if str follows the same pattern.

Here follow means a full match, such that there is a bijection between a letter in pattern and a non-empty word in str.

Example 1:

Input: pattern = "abba", str = "dog cat cat dog"
Output: true
Example 2:

Input:pattern = "abba", str = "dog cat cat fish"
Output: false
Example 3:

Input: pattern = "aaaa", str = "dog cat cat dog"
Output: false
Example 4:

Input: pattern = "abba", str = "dog dog dog dog"
Output: false
Notes:
You may assume pattern contains only lowercase letters, and str contains lowercase letters that may be separated by a single space.
 */

import java.util.HashMap;
import java.util.Map;

class Solution290 {
    public boolean wordPattern(String pattern, String str) {
        Map<Character, String> map = new HashMap<>();
        String[] strArr = str.split(" ");
        if (strArr.length != pattern.length()) return false;
        for (int i = 0; i < strArr.length; i++) {
            if (map.containsKey(pattern.charAt(i))) {
                if (!map.get(pattern.charAt(i)).equals(strArr[i])) return false;
            } else {
                if (map.containsValue(strArr[i])) {
                    return false;
                } else {
                    map.put(pattern.charAt(i), strArr[i]);
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(new Solution290().wordPattern("abba", "dog cat cat dog"));
        System.out.println(new Solution290().wordPattern("abba", "dog cat cat fish"));
        System.out.println(new Solution290().wordPattern("aaaa", "dog cat cat dog"));
        System.out.println(new Solution290().wordPattern("abba", "dog dog dog dog"));
    }
}