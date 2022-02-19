package com.example.interviewpreparation.flexton;

import java.util.HashMap;

/**
 * @author kojusujan1111@gmail.com 28/12/21
 * <p>
 * For a given string "abbbcddddeffabbbbbb"
 * return the characters who are consecutively repeated like "bbb"
 * and how many times it is consecutively repeated on the string
 * For example, For a given string "abbbcddddeffabbbbbb"
 * return a HashMap like, 
 * b -> 2 Note: (bbb & bbbbbb) 
 * d -> 1 
 * f -> 1 
 * Note: “a” appears two times but it is not consecutively 
 * repeated so it is not included. The same is true for “e”. 
 */

public class ConsecutiveCharCount {

    public static HashMap<Character, Integer> count(String str) {
        HashMap<Character, Integer> result = new HashMap<>();
        String trimmedString = str.trim();
        char[] chars = trimmedString.toCharArray();
        if (chars.length <= 1) return result;
        int left = 0;
        int right = 1;
        while (right < chars.length) {
            if (chars[left] != chars[right]) {
                left++;
            } else {
                result.put(chars[left], result.containsKey(chars[left]) ? result.get(chars[left]) + 1 : 1);
                while ((right < chars.length) && (chars[left] == chars[right])) {
                    right++;
                }
                left = right;
            }
            right++;
        }
        return result;
    }

    public static void main(String[] args) {
        String req = "acvasddaddddddddd";
        System.out.println(count(req));
    }
}
