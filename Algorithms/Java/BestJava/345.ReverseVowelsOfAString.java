package BestJava;
/*
345. Reverse Vowels of a String

Write a function that takes a string as input and reverse only the vowels of a string.

Example 1:

Input: "hello"
Output: "holle"

Example 2:

Input: "leetcode"
Output: "leotcede"

Note:
The vowels does not include the letter "y".
 */

class Solution345 {
    public String reverseVowels(String s) {
        if (s == null || s.length() == 0) return s;
        String vowels = "aeiouAEIOU";
        char[] chars = s.toCharArray();
        int start = 0;
        int end = s.length() - 1;
        while (start < end) {

            while (start < end && !vowels.contains(chars[start] + "")) {
                start++;
            }

            while (start < end && !vowels.contains(chars[end] + "")) {
                end--;
            }

            char temp = chars[start];
            chars[start] = chars[end];
            chars[end] = temp;

            start++;
            end--;
        }
        return new String(chars);
    }

    public static void main(String[] args) {
        System.out.println(new Solution345().reverseVowels("hello"));
        System.out.println(new Solution345().reverseVowels("leetcode"));
    }
}