package com.example.interviewpreparation;

import java.util.HashMap;
import java.util.Map;

/**
 * Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: nums = [1,2,3,1]
 * Output: true
 * Example 2:
 * <p>
 * Input: nums = [1,2,3,4]
 * Output: false
 * Example 3:
 * <p>
 * Input: nums = [1,1,1,3,3,4,3,2,4,2]
 * Output: true
 *
 * @author kojusujan1111@gmail.com 10/11/21
 */

public class ContainsDuplicate {
    public static boolean containsDuplicate(int[] nums) {
        Map<Integer, Integer> nosMap = new HashMap<>();
        for (int num : nums) {
            if (nosMap.containsKey(num)) return true;
            else nosMap.put(num, 1);
        }
        return false;
    }
}
