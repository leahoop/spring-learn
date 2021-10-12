package com.leetcode.solution;

import java.util.ArrayList;
import java.util.List;

public class Solution448 {

    public static void main(String[] args) {
        List<Integer> disappearedNumbers = findDisappearedNumbers(new int[]{2,3,4,5,6,7,8,1});

    }

    public static List<Integer> findDisappearedNumbers(int[] nums) {


        for (int i = 0; i < nums.length; i++) {
            while (nums[i] != nums[nums[i] - 1]) {
                int temp = nums[i];
                int num = nums[i];
                nums[i] = nums[nums[i] - 1];
                nums[num - 1] = temp;
            }
        }
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            int temp = i + 1;
            if (nums[i] != temp) {
                list.add(temp);
            }

        }

        return list;
    }
//    public static List<Integer> findDisappearedNumbers(int[] nums) {
//
//        int length = nums.length;
//        Map<Integer, Integer> map = new HashMap<>();
//        for (int i = 1; i <= length; i++) {
//            map.put(i, 0);
//        }
//
//        for (int i = 0; i < nums.length; i++) {
//            Integer integer = map.get(nums[i]);
//            map.put(nums[i], ++integer);
//        }
//        List<Integer> list = new ArrayList<>();
//        map.forEach((key, value) -> {
//            if (value == 0) {
//                list.add(key);
//            }
//        });
//        return list;
//    }

}
