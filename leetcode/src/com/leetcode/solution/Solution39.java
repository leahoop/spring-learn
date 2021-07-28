package com.leetcode.solution;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Solution39 {


    public static void main(String[] args) {
        int[] ints = {2, 3, 6,7};
        List<List<Integer>> permute = combinationSum(ints, 7);
        permute.stream().forEach(e -> {
            e.stream().forEach(a -> System.out.print(a));
            System.out.println();
        });
    }


    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        LinkedList<Integer> stack = new LinkedList<>();
        track(candidates, res, stack, 0, target,0);
        return res;
    }

    private static void track(int[] nums, List<List<Integer>> res,
                              LinkedList<Integer> stack, int result, int target, int begin) {
        if (result == target) {
            res.add(new ArrayList<>(stack));
        }
        for (int i = begin; i < nums.length; i++) {
            if (result > target) {
                break;
            }
            result += nums[i];
            stack.add(nums[i]);
            track(nums, res, stack, result, target, i);
            stack.removeLast();
            result = result - nums[i];
        }
    }

}
