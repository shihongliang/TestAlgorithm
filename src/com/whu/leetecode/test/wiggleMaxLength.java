package com.whu.leetecode.test;

import java.util.ArrayList;
import java.util.List;

/**
 * @author hongliang
 */
public class wiggleMaxLength {

    public int wiggleMaxLength(int[] nums) {

        if (nums.length < 2) {
            return nums.length;
        }
        int maxLength = 1;
        boolean increasing = nums[1] > nums[0];
        int prev = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (increasing) {
                if (nums[i] > prev) {
                    increasing = !increasing;
                    maxLength++;
                }
            } else {
                if (nums[i] < prev) {
                    increasing = !increasing;
                    maxLength++;
                }
            }
            prev = nums[i];
        }
        return maxLength;
    }
}
