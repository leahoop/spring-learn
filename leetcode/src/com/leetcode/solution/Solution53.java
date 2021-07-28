package com.leetcode.solution;

public class Solution53 {

    public static void main(String[] args) {
        int i = maxSubArray(new int[]{-1, 0, -2});
        System.out.println(i);
    }

    public static int maxSubArray(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }
        int result = nums[0];
        for (int i =0 ;i < nums.length;i ++) {
            int num = nums[i];
            int loop = nums[i];
            for (int j = i + 1; j < nums.length; j++) {
                num = num + nums[j];
                if (num > loop) {
                    loop = num;
                }
            }

            if (num > loop) {
                loop = num;
            }

            if (loop > result) {
                result = loop;
            }
        }
        return result;
    }

}
