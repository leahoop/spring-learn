package com.leetcode.solution;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Solution46 {


    public static void main(String[] args) {
        int[] ints = {1, 2, 3};
        List<List<Integer>> permute = permute(ints);
        permute.stream().forEach(e->{
            e.stream().forEach(a -> System.out.print(a));
            System.out.println();
        });
    }


    public static List<List<Integer>> permute(int[] nums) {

        List<List<Integer>> res = new ArrayList<>();
        LinkedList<Integer> stack = new LinkedList<>();
        track(nums, res, stack);
        return res;

    }

    private static void track(int[] nums, List<List<Integer>> res, LinkedList<Integer> stack) {
        if (nums.length == stack.size()) {
            res.add(new ArrayList<>(stack));
        }
        for (int i = 0; i<nums.length; i++) {
            if (stack.contains(nums[i])) {
                continue;
            }
            stack.add(nums[i]);
            track(nums, res, stack);
            stack.removeLast();
        }
    }

}
