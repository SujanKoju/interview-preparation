package com.example.interviewpreparation;

/**
 * @author kojusujan1111@gmail.com 20/11/21
 */

public class SearchInRotatedSortedArray {
    public static int search(int[] nums, int target) {
        if (nums.length == 0) return -1;
        if (nums.length == 1) {
            if (nums[0] == target) return 0;
            else return -1;
        }
        int start = 0;
        int end = nums.length - 1;

        while (start != end) {
            int mid = start +end / 2;
            if (nums[mid] == target) return mid;
            if (nums[mid] >= nums[start]) {
                if (target >= nums[start] && target <= nums[mid]) end = mid - 1;
                else start = mid + 1;
            } else {
                if (target <= nums[end] && target >= nums[mid]) start = mid + 1;
                else end = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] num = {4, 5, 6, 7, 0,1, 2};
        System.out.println(SearchInRotatedSortedArray.search(num, 0));
    }
}
