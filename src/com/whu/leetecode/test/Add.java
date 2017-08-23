package com.whu.leetecode.test;

/**
 * @author hongliang
 */
public class Add {

    public int Add(int num1, int num2) {
        int sum = 0;
        int cacarray = 0;
        while (num2 != 0) {
            sum = num1 ^ num2;
            cacarray = (num1 & num2) << 1;
            num2 = cacarray;
        }
        return num1;
    }
}
