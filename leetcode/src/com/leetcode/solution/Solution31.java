package com.leetcode.solution;

import java.util.Arrays;

public class Solution31 {

    public static void main(String[] args) {
        nextPermutation(new int[]{1, 2, 3});
    }

    public static void nextPermutation(int[] nums) {
        // 官方题解
        if (nums.length == 1) {
            return;
        }

        int length = nums.length - 1;
        int len = length;
        int j = 0;
        while (len > 0) {
            if (nums[len] > nums[len - 1]) {
                j = len;
                break;
            }
            len--;
        }
        if (j == 0) {
            Arrays.sort(nums);
            return;
        }

        int k = 0;
        for (int x = length; x > 0; x--) {
            if (nums[j - 1] < nums[x]) {
                k = x;
                break;
            }
        }
        int temp = nums[j - 1];
        nums[j - 1] = nums[k];
        nums[k] = temp;

        Arrays.sort(nums, j , nums.length);      //将后面降序变为升序

        System.out.println(1);

    }

}
