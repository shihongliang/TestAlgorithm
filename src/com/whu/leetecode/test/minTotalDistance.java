package com.whu.leetecode.test;

import java.util.ArrayList;
import java.util.List;

/**
 * @author hongliang
 */
public class minTotalDistance {

    public int minTotalDistance(int[][] grid) {
        List<Integer> ipos = new ArrayList<Integer>();
        List<Integer> jpos = new ArrayList<Integer>();
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1) {
                    ipos.add(i);
                    jpos.add(j);
                }
            }
        }
        int sum = 0;
        for (Integer pos : ipos) {
            sum += Math.abs(pos - ipos.get(ipos.size() / 2));
        }
        for (Integer pos : jpos) {
            sum += Math.abs(pos - jpos.get(jpos.size() / 2));
        }
        return sum;
    }

}
