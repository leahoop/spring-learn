package com.leetcode.solution;

public class Solution75 {

    public static void main(String[] args) {
        int[] ints = {2, 1, 0, 2};
        sortColors(ints);
        System.out.println("a");
    }


//    public static void sortColors(int[] nums) {
//        int length = nums.length;
//        for (int i = 0; i < length-1; i++) {
//            for (int j = 0; j < length - 1 - i; j++) {
//                if (nums[j] > nums[j + 1]) {
//                    int temp = nums[j];
//                    nums[j] = nums[j + 1];
//                    nums[j + 1] = temp;
//                }
//            }
//        }
//    }

    public static void sortColors(int[] nums) {
        // 官方题解
        int length = nums.length;
        int L = 0;
        int R = length - 1;

        for (int i = 0; i <= R; i++) {
            while (nums[i] == 2 && i <= R) {
                int temp = nums[R];
                nums[R] = nums[i];
                nums[i] = temp;
                R--;
            }
            if (nums[i] == 0) {
                int temp = nums[L];
                nums[L] = nums[i];
                nums[i] = temp;
                L++;
            }
        }

    }
}
