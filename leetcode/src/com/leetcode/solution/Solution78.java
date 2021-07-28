package com.leetcode.solution;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Solution78 {


    public static void main(String[] args) {
        int[] ints = {1, 2, 3};
        List<List<Integer>> permute = subsets(ints);
        permute.stream().forEach(e->{
            e.stream().forEach(a -> System.out.print(a));
            System.out.println();
        });
    }

    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        LinkedList<Integer> stack = new LinkedList<>();
        track(nums, res, stack,0);
        return res;
    }


    private static void track(int[] nums, List<List<Integer>> res, LinkedList<Integer> stack,
                              int begin) {
        if (stack.size() <= nums.length) {
            res.add(new ArrayList<>(stack));
        }
        for (int i = begin; i<nums.length; i++) {
            if (stack.contains(nums[i])) {
                continue;
            }
            stack.add(nums[i]);
            track(nums, res, stack, i);
            stack.removeLast();
        }
    }

}
