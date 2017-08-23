package com.whu.leetecode.test;

/**
 * @author hongliang
 */
public class LeftRotateString {

    public String LeftRotateString(String str, int n) {
        int len = str.length();
        String s = "";
        String s2 = "";
        if (n <= 0)
            return str;
        else if (n < len) {
            for (int i = 0; i < n; i++) {
                s += str.charAt(i);
            }
            s2 += str.substring(n, len);
        }
        return s2;
    }

}
