/**
 * 
 */
package com.whu.leecode;

import java.util.Stack;

/**
 * @author hongliang
 *
 */
public class evalRPN {
	
    public int evalRPN(String[] tokens) {
		Stack<String> stack=new Stack<String>();
		Integer s=0;
		for(int i=0;i<tokens.length;i++)
		{
			if(tokens[i]=="+"||tokens[i]=="-"||tokens[i]=="*"||tokens[i]=="/")
			{
				String s1=stack.pop();
				String s2=stack.pop();
				s=Integer.parseInt(s1)+Integer.parseInt(tokens[i])+Integer.parseInt(s2);
				
			}
			stack.push(tokens[i]);
			
		}
    	
    	return s;
        
    }
	
}
