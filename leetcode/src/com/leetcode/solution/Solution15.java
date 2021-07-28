package com.leetcode.solution;

import java.util.*;

public class Solution15 {

    public static void main(String[] args) {

        int[] ints = {-1, 0, 1, 2, -1, -4};
        List<List<Integer>> permute = threeSum(ints);
        if (permute != null && permute.size() > 0) {
            permute.stream().forEach(e -> {
                e.stream().forEach(a -> System.out.print(a));
                System.out.println();
            });
        } else {
            System.out.println("找不到");
        }


    }


    public static List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        if (nums.length < 3) {
            return new ArrayList<>();
        }
        List<List<Integer>> res = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                return res;
            }
            // 重复过滤
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            int L = i + 1, R = nums.length - 1;
            while (L < R) {
                int temp = nums[i] + nums[L] + nums[R];
                if (temp == 0) {
                    res.add(Arrays.asList(nums[i], nums[L], nums[R]));
                    // 去除重复
                    while (L < R && nums[L] == nums[L + 1]) {
                        L++;
                    }
                    while (L < R && nums[R] == nums[R - 1]) {
                        R--;
                    }

                    L++;
                    R--;
                } else if (temp > 0) {
                    R--;
                } else {
                    L++;
                }
            }
        }
        return res;
    }


//    public static List<List<Integer>> threeSum(int[] nums) {
//        Arrays.sort(nums);
//        List<List<Integer>> res = new ArrayList<>();
//        LinkedList<Integer> stack = new LinkedList<>();
//        boolean[] is = new boolean[nums.length];
//        track(nums, res, stack, 0, 0, is);
//        return res;
//    }
//
//
//    private static void track(int[] nums, List<List<Integer>> res,
//                              LinkedList<Integer> stack, int result, int begin, boolean[] is) {
//        if (stack.size() == 3 && result == 0) {
//            if (!res.contains(stack)) {
//                res.add(new ArrayList<>(stack));
//            }
//        }
//        for (int i = begin; i < nums.length; i++) {
//            if (is[i] || stack.size() > 3) {
//                continue;
//            }
//            result += nums[i];
//            stack.add(nums[i]);
//            is[i] = true;
//            track(nums, res, stack, result, i, is);
//            stack.removeLast();
//            result = result - nums[i];
//            is[i] = false;
//        }
//    }

}
