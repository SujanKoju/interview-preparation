package com.example.interviewpreparation;

import java.util.Arrays;
import java.util.HashMap;

/**
 * @author kojusujan1111@gmail.com 07/11/21
 * <p>
 * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
 * <p>
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 * <p>
 * You can return the answer in any order.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: nums = [2,7,11,15], target = 9
 * Output: [0,1]
 * Output: Because nums[0] + nums[1] == 9, we return [0, 1].
 * Example 2:
 * <p>
 * Input: nums = [3,2,4], target = 6
 * Output: [1,2]
 * Example 3:
 * <p>
 * Input: nums = [3,3], target = 6
 * Output: [0,1]
 */

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) { // O(n^2)
        int[] response = new int[2];
        if (nums.length < 2) return response;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    response[0] = i;
                    response[1] = j;
                }
            }
        }
        return response;
    }

    public static int[] twoSumWithOn(int[] nums, int target) { // O(n)
        int[] response = new int[2];
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int difference =  target-nums[i] ;
            boolean contains = map.containsKey(difference);
            if (!contains) {
                map.put(nums[i], i);
            } else {
                response[0] = map.get(difference);
                response[1] = i;
                return response;
            }
        }
        return response;
    }

    public static void main(String[] args) {
        int[] num = {1, -3, 3, 4, 5};
        System.out.println(Arrays.toString(TwoSum.twoSumWithOn(num, 0)));
    }
}
