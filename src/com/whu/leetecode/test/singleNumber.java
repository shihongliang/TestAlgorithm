package com.whu.leetecode.test;

/**
 * @author hongliang
 */
public class singleNumber {

    public int[] singleNumber(int[] nums) {
        int a = nums[0];
        for (int i = 1; i < nums.length; i++) {
            a ^= nums[i];
        }
        System.out.println(a);
        a &= -a;
        System.out.println(a);
        int[] ret = { 0, 0 };
        for (int num : nums) {
            if ((num & a) == 0) {
                ret[0] ^= num;
            } else {
                ret[1] ^= num;
            }
        }
        return ret;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 2, 1, 3, 2, 5 };
        singleNumber s = new singleNumber();
        s.singleNumber(nums);
    }

}
