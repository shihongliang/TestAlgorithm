package com.whu.leetecode.test;

/**
 * @author hongliang
 */
public class Test {

    public int getLCS(int[] a, int[] b) {
        int[][] dp = new int[a.length][b.length];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                if (a[i] == b[j])
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                else
                    dp[i][j] = Math.max(dp[i][j - 1], dp[i - 1][j]);
            }
        }
        return 0;
    }
}
