package com.example.interviewpreparation;

/**
 * Given an integer array nums, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.
 * <p>
 * A subarray is a contiguous part of an array.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
 * Output: 6
 * Explanation: [4,-1,2,1] has the largest sum = 6.
 * Example 2:
 * <p>
 * Input: nums = [1]
 * Output: 1
 * Example 3:
 * <p>
 * Input: nums = [5,4,-1,7,8]
 * Output: 23
 *
 * @author kojusujan1111@gmail.com 15/11/21
 */

public class MaximumSubArray {
    public static int maxSubArray(int[] nums) {
        int max = nums[0];
        int currentSum = 0;

        for (int num : nums) {
            if (currentSum < 0) currentSum = 0;
            currentSum += num;

            max = Math.max(currentSum, max);
        }
        return max;
    }
}
