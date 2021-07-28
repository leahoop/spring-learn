package com.leetcode.solution;

public class Solution34 {


    public static void main(String[] args) {
        searchRange(new int[]{2,2}, 2);
    }

    public static int[] searchRange(int[] nums, int target) {

        int left = 0;
        int right = nums.length -1 ;
        int i = get(nums, target, left, right, true);
        int j = get(nums, target, left, right, false);
        return new int[]{i, j};
    }

    private static int get(int[] nums, int target, int left, int right, boolean leftOrRight) {
        int result = -1;
        while (left <= right) {
            int middle = left + (right - left) / 2;
            if (nums[middle] < target) {
                left = middle + 1;
            } else if (nums[middle] > target) {
                right = middle - 1;
            } else {
                result = middle;
                if(leftOrRight)
                    right = middle - 1;
                else
                    left = middle + 1;
            }
        }
        return result;
    }

}
