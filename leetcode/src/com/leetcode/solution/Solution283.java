package com.leetcode.solution;

public class Solution283 {

    public static void main(String[] args) {
        int[] ints = {2,0,1};
        moveZeroes(ints);
        System.out.println(ints[1]);
    }




    public static void moveZeroes(int[] nums) {
        // 答案区便捷方法
        if (nums == null) {
            return;
        }
        // 记录0的位置
        int j = 0;
        for (int i =0;i<nums.length;i++) {
            if (nums[i]!=0) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j++] = temp;
            }
        }

    }

//    public static void moveZeroes(int[] nums) {
//
//        int zero = 0;
//        int num = 0;
//
//        while (zero != nums.length - 1) {
//            while (nums[zero] != 0 && zero < nums.length-1) {
//                zero++;
//            }
//            while (nums[num] == 0 && num < nums.length-1) {
//                num++;
//            }
//            if (nums[zero] == 0 && nums[num] ==0) {
//                break;
//            }
//            if (zero < num) {
//                int temp = nums[zero];
//                nums[zero] = nums[num];
//                nums[num] = temp;
//            } else {
//                num++;
//            }
//        }
//
//    }

}
