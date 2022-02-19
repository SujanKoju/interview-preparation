package com.example.interviewpreparation;

import java.util.HashMap;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;

/**
 * @author kojusujan1111@gmail.com 03/01/22
 * <p>
 * Given two strings s and t, return true if t is an anagram of s, and false otherwise.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: s = "anagram", t = "nagaram"
 * Output: true
 * Example 2:
 * <p>
 * Input: s = "rat", t = "car"
 * Output: false
 * <p>
 * What if the inputs contain Unicode characters? How would you adapt your solution to such a case?
 */

public class ValidAnagram {
    public static boolean isAnagram(String string1, String string2) {
        if (string1.length() != string2.length()) return false;
        HashMap<Character, Integer> hashMap1 = getHashMap(string1);
        HashMap<Character, Integer> hashMap2 = getHashMap(string2);
        AtomicBoolean isAnagram = new AtomicBoolean(true);
        hashMap1.forEach((character, integer) -> {
            if (!hashMap2.containsKey(character)) isAnagram.set(false);
            else {
                isAnagram.set(Objects.equals(hashMap2.get(character), integer));
            }
        });
        return isAnagram.get();
    }

    private static HashMap<Character, Integer> getHashMap(String string1) {
        HashMap<Character, Integer> hashMap1 = new HashMap<>();
        for (char c : string1.toCharArray()) {
            if (hashMap1.containsKey(c)) {
                hashMap1.put(c, hashMap1.get(c) + 1);
            } else {
                hashMap1.put(c, 1);
            }
        }
        return hashMap1;
    }

    public static void main(String[] args) {
        System.out.println(isAnagram("aacc", "caac"));
    }
}
