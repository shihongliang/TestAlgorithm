package com.whu.leetecode.test;

/**
 * @author hongliang
 */
public class missingNumber {

    public int missingNumber(int[] nums) {
        int xor = 0, i = 0;
        for (i = 0; i < nums.length; i++) {
            xor = xor ^ i ^ nums[i];
        }
        System.out.println(xor ^ i);
        return xor ^ i;
    }

    public static void main(String[] args) {
        int[] nums = { 0, 1, 3 };
        missingNumber m = new missingNumber();
        int num = m.missingNumber(nums);
        System.out.println(num);
    }
}
