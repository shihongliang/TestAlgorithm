/**
 * 
 */
package com.whu.leecode;

import java.util.Stack;

/**
 * @author hongliang
 *
 */
public class longestValidParenthese {
	
    public int longestValidParentheses(String s) {
	
    	Stack<Integer> st=new Stack<Integer>();
    	
    	int max=0;
    	
    	for(int i=0;i<s.length();i++)
    	{
    		if(s.charAt(i)==')'&&!st.isEmpty()&&s.charAt(st.peek())=='(')
    		{
    			st.pop();
    			max=Math.max(max, i-((st.isEmpty())?-1:st.peek()));
    		}
    		else
    			st.push(i);
    	}
    	
    	
    	return max;
        
    }

}
