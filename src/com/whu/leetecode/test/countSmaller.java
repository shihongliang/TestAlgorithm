package com.whu.leetecode.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author hongliang
 */
public class countSmaller {

    public List<Integer> countSmaller(int[] nums) {
        List<Integer> sorted = new ArrayList<Integer>();
        Integer[] ans = new Integer[nums.length];
        for (int i = nums.length - 1; i >= 0; i--) {
            int index = findIndex(sorted, nums[i]);
            ans[i] = index;
            sorted.add(index, nums[i]);
        }
        return Arrays.asList(ans);
    }

    /**
     * @param sorted
     * @param i
     * @return
     */
    private int findIndex(List<Integer> sorted, int target) {
        // TODO Auto-generated method stub
        if (sorted.size() == 0)
            return 0;
        int start = 0;
        int end = sorted.size() - 1;
        if (sorted.get(end) < target)
            return end + 1;
        if (sorted.get(end) > target)
            return 0;
        while (start + 1 < end) {
            int mid = (start + end) / 2;
            if (sorted.get(mid) < target)
                start = mid + 1;
            else
                end = mid;
        }
        if (sorted.get(start) >= target)
            return start;
        return end;
    }
}
