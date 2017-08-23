package com.whu.leetecode.test;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author hongliang
 */
public class PrintMinNumber {
    public String PrintMinNumber(int[] numbers) {
        String[] s = new String[numbers.length];
        for (int i = 0; i < s.length; i++) {
            s[i] = String.valueOf(numbers[i]);
        }
        Arrays.sort(s, 0, s.length, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                // TODO Auto-generated method stub
                return (o1 + o2).compareTo(o2 + o1);
            }
        });
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length; i++) {
            sb.append(s[i]);
        }
        return sb.toString();
    }
}
