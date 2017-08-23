package com.whu.leetecode.test;

import java.util.HashMap;

/**
 * @author hongliang
 */
public class lengthOfLongestSubstring {

    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        if (s == null)
            return 0;
        if (s.length() <= 1)
            return s.length();
        int longest = -1;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (map.containsKey(ch)) {
                longest = Math.max(map.size(), longest);
                i = map.get(ch);
                map.clear();
            } else {
                map.put(ch, i);
            }
        }
        longest = Math.max(map.size(), longest);
        map.clear();
        return longest;
    }
}
