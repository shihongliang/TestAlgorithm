/**
 * 
 */
package com.whu.leecode;

import java.util.Stack;

/**
 * @author hongliang
 *
 */
public class EvalRPN2 {
	
    public int evalRPN(String[] tokens) {
        if(tokens==null||tokens.length<1)
        	return -1;
        int op1;
        int op2;
        Stack<Integer> stack=new Stack<Integer>();
        for(String token:tokens)
        {
        	if("+".equals(token)||"-".equals(token)||"*".equals(token)||"/".equals(token))
        	{
        		op1=stack.pop();
        		op2=stack.pop();
        		switch(token.charAt(0))
        		{
        			case '+':
        				op1+=op2;
        				break;
        			case '-':
        				op1-=op2;
        				break;
        			case '*':
        				op1*=op2;
        			case '/':
        				if(op2!=0)
        					op1/=op2;
        		}
        		stack.push(op1);
        	}
        	   else {
                   stack.push(Integer.parseInt(token));
               }
        	
        }
		return stack.pop();
    }
	
}
