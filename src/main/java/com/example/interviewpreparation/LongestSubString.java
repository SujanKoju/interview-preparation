package com.example.interviewpreparation;

import java.util.HashMap;

/**
 * @author kojusujan1111@gmail.com 07/11/21
 * Given a string s, find the length of the longest substring without repeating characters.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: s = "abcabcbb"
 * Output: 3
 * Explanation: The answer is "abc", with the length of 3.
 * Example 2:
 * <p>
 * Input: s = "bbbbb"
 * Output: 1
 * Explanation: The answer is "b", with the length of 1.
 * Example 3:
 * <p>
 * Input: s = "pwwkew"
 * Output: 3
 * Explanation: The answer is "wke", with the length of 3.
 * Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.
 * Example 4:
 * <p>
 * Input: s = ""
 * Output: 0
 */

public class LongestSubString {

    public static int lengthOfLongestSubstring(String s) {

            int longestSubStringLength = 0;
            HashMap<Character, Integer> charHashMap = new HashMap<>();
            char[] chars = s.toCharArray();
            if (chars.length == 0) return 0;
            for (int i = 0; i < chars.length; i++) {
                if (charHashMap.containsKey(chars[i])) {
                    int diff = i - charHashMap.get(chars[i]);
                    longestSubStringLength = Math.max(diff, longestSubStringLength);
                }
                charHashMap.put(chars[i], i);
            }
            return longestSubStringLength;
    }

    public static void main(String[] args) {
        System.out.println(LongestSubString.lengthOfLongestSubstring(""));
    }
}
