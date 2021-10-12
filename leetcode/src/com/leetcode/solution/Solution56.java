package com.leetcode.solution;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Solution56 {

    public static void main(String[] args) {
//        int[] a = new int[]{4,0,4,2,2,0,1,3,3,0,3};
//        System.out.println(canJump(a));
        int[][] arr1 = new int[][]{{1,4}, {0, 4}};
        int[][] merge = merge(arr1);
        System.out.println(merge[0]);
    }

    public static int[][] merge(int[][] intervals) {
        // 官方答案
        if (intervals.length == 0) {
            return new int[0][2];
        }
        Arrays.sort(intervals, Comparator.comparingInt(k-> k[0]));

        List<int[]> list = new ArrayList<>();
        for (int i = 0; i< intervals.length;i++) {
            int L = intervals[i][0];
            int R = intervals[i][1];
            if (i ==0 || list.get(list.size()-1)[1] < L) {
                list.add(intervals[i]);
            } else {
                list.get(list.size() - 1)[1] = Math.max(R, list.get(list.size() - 1)[1]);
            }

        }
        return list.toArray(new int[list.size()][]);
    }

}
