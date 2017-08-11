package com.whu.leetecode.test;

/**
 * @author hongliang
 */
public class minCostII {

    public int minCostII(int[][] cost) {
        if (cost == null || cost.length == 0)
            return 0;
        int preMin = 0, preSec = 0, preIndex = -1;
        int n = cost.length, k = cost[0].length;
        for (int i = 0; i < n; i++) {
            int curMin = Integer.MIN_VALUE, curSec = Integer.MAX_VALUE, curIndex = 0;
            for (int j = 0; j < k; j++) {
                cost[i][j] += preIndex == j ? preSec : preMin;
                if (cost[i][j] < curMin) {
                    curSec = curMin;
                    curMin = cost[i][j];
                    curIndex = j;
                } else if (cost[i][j] < curSec) {
                    curSec = cost[i][j];
                }
            }

            preMin = curMin;
            preSec = curSec;
            preIndex = curIndex;
        }
        return preMin;
    }

}
