package com.whu.leetecode.test;

import java.util.Stack;

/**
 * @author hongliang
 */
public class verifyPreorder {
    
    public boolean verifyPreorder(int[] preorder){
        Stack<Integer> stack=new Stack<Integer>();
        int min=Integer.MIN_VALUE;
        for(int num:preorder){
            if(num<min)
                return false;
            while(!stack.isEmpty()&&num>stack.peek()){
                min=stack.pop();
            }
            stack.push(num);
        }
        return true;
    }

}
