package com.leetcode.solution;

public class Solution55 {

    public static void main(String[] args) {
        int[] a = new int[]{4,0,4,2,2,0,1,3,3,0,3};
        System.out.println(canJump(a));

    }

    public static boolean canJump(int[] nums) {
        // 官方题解
        int length = nums.length;
        int target = length - 1;
        int max = 0;
        for (int i=0;i<length;i++) {
            if (i <= max ) {
                max = Math.max(max, nums[i] + i);
                if (max >= target) {
                    return true;
                }
            }
        }
        return false;
    }

}
