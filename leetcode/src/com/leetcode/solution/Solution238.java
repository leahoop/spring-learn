package com.leetcode.solution;

import java.util.Arrays;

public class Solution238 {

    public static void main(String[] args) {
        int[] ints = productExceptSelf(new int[]{1, 2, 3, 4});
        System.out.println(ints[0]);

    }



    public static int[] productExceptSelf(int[] nums) {
        // 看题解获取思路，优化
        int length = nums.length;

        int[] temp = new int[nums.length];
        int x = 1;
        for (int i = 0; i < length; i++) {
            temp[i] = x;
            x *= nums[i];
        }
        int y = 1;
        for (int i = length - 1; i >= 0; i--) {
            temp[i] = y * temp[i];
            y *= nums[i];
        }
        return temp;
    }
//
//    public static int[] productExceptSelf(int[] nums) {
//        // 看题解获取思路
//        int length = nums.length;
//
//        int[] temp = new int[nums.length];
//        int x = 1;
//        for (int i = 0; i < length; i++) {
//            x *= nums[i];
//            temp[i] = x;
//        }
//        int[] result = new int[length];
//        int y = 1;
//
//        for (int i = length - 1; i >= 0; i--) {
//            if (i == 0) {
//                result[i] = y;
//            } else {
//                result[i] = y * temp[i - 1];
//                y *= nums[i];
//            }
//        }
//        return result;
//    }

}
