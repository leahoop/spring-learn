package com.leetcode.solution;

public class Solution64 {

    public static void main(String[] args) {
        int i = minPathSum(new int[][]{{1,2,3},{4,5,6}});
        System.out.println(i);
    }

    public static int minPathSum(int[][] grid) {
        int m = grid.length - 1;
        int n = grid[0].length - 1;
        int[][] dp = new int[grid.length][grid[0].length];
        dp[0][0] = grid[0][0];
        for (int i =1; i <= m; i++) {
            dp[i][0] = grid[i][0] + dp[i - 1][0];
        }
        for (int i =1; i <= n; i++) {
            dp[0][i] = grid[0][i] + dp[0][i-1];
        }
        for (int i = 1; i<=m;i++) {
            for (int j=1;j<=n;j++) {
                dp[i][j] = Math.min(dp[i][j-1], dp[i-1][j]) + grid[i][j];
            }
        }
        return dp[m][n];
    }


}
