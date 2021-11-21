package com.example.interviewpreparation;

import java.util.Arrays;

/**
 * Given an integer array nums, return an array answer such that answer[i] is equal to the product of all the elements of nums except nums[i].
 * <p>
 * The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.
 * <p>
 * You must write an algorithm that runs in O(n) time and without using the division operation.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: nums = [1,2,3,4]
 * Output: [24,12,8,6]
 * Example 2:
 * <p>
 * Input: nums = [-1,1,0,-3,3]
 * Output: [0,0,9,0,0]
 *
 * @author kojusujan1111@gmail.com 11/11/21
 */

public class ProductOfArrayExceptSelf {
    public static int[] productExceptSelf(int[] nums) {
        int[] response = new int[nums.length];
        if (nums.length == 1) {
            response[0] = nums[0];
        } else {
            int tempResult = 1;
            for (int i = 0; i < nums.length; i++) {
                for (int j = 0; j < nums.length; j++) {
                    if (i != j) {
                        tempResult = tempResult * nums[j];
                    }
                }
                response[i] = tempResult;
                tempResult = 1;
            }
        }
        return response;
    }

    public static void main(String[] args) {
        int[] num = {1, 2, 3, 4};
        System.out.println(Arrays.toString(ProductOfArrayExceptSelf.productExceptSelf(num)));
    }
}
