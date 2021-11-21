package com.example.interviewpreparation;

import java.util.Arrays;
import java.util.OptionalInt;

/**
 * Given an integer array nums, find a contiguous non-empty subarray within the array that has the largest product, and return the product.
 * <p>
 * It is guaranteed that the answer will fit in a 32-bit integer.
 * <p>
 * A subarray is a contiguous subsequence of the array.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: nums = [2,3,-2,4]
 * Output: 6
 * Explanation: [2,3] has the largest product 6.
 * Example 2:
 * <p>
 * Input: nums = [-2,0,-1]
 * Output: 0
 * Explanation: The result cannot be 2, because [-2,-1] is not a subarray.
 *
 * @author kojusujan1111@gmail.com 17/11/21
 */

public class MaxProductSubArray {
    public int maxProduct(int[] nums) {
       int result = nums[0];
        int currentMax = 1;
        int currentMin = 1;
            for (Integer num : nums) {
                int temp = currentMax*num;
                currentMax=Math.max(num*currentMax,num*currentMin);
                currentMax=Math.max(currentMax,num);

                currentMin=Math.min(temp,num*currentMin);
                currentMin=Math.min(currentMin,num);

                result=(Math.max(currentMax,result));
            }
            return result;
    }
}
