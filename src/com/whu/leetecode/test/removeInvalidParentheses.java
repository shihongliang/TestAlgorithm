package com.whu.leetecode.test;

import java.util.ArrayList;
import java.util.List;

/**
 * @author hongliang
 */
public class removeInvalidParentheses {

    public List<String> removeInvalidParentheses(String s) {
        List<String> ans = new ArrayList<String>();
        remove(s, ans, 0, 0, new char[] { '(', ')' });

        return ans;
    }

    /**
     * @param s
     * @param ans
     * @param i
     * @param j
     * @param cs
     */
    private void remove(String s, List<String> ans, int last_i, int last_j, char[] par) {
        // TODO Auto-generated method stub
        for (int stack = 0, i = last_i; i < s.length(); i++) {
            if (s.charAt(i) == par[0])
                stack++;
            if (s.charAt(i) == par[1])
                stack--;
            if (stack >= 0)
                continue;
            for (int j = last_j; j <= i; j++) {
                if (s.charAt(j) == par[1] && (j == last_j || s.charAt(j - 1) != par[1])) {
                    remove(s.substring(0, j) + s.substring(j + 1, s.length()), ans, i, j, par);
                }
                return;
            }
            String reversed = new StringBuilder(s).reverse().toString();
            if (par[0] == '(') {
                remove(reversed, ans, 0, 0, new char[] { ')', '(' });
            } else {
                ans.add(reversed);
            }
        }
    }
}
