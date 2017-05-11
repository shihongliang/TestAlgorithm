/**
 * 
 */
package com.whu.leecode;

import java.util.Stack;

/**
 * @author hongliang
 *
 */
public class MinStack2 {
	
	private final static int DEFAULT_SIZE=1000;
	private int[] stack;
	private int[] minIndex;
	private int min=Integer.MAX_VALUE;
	private int index=-1;
	private int current=-1;
	
    /** initialize your data structure here. */
    public MinStack2() {
        stack=new int[DEFAULT_SIZE];
        minIndex=new int[DEFAULT_SIZE];
    }
    
    public void push(int x) {
    	current++;
    	if(current>=stack.length)
    	{
    		int[] tmp=new int[current*2];
    		System.arraycopy(minIndex, 0, tmp, 0, minIndex.length);
    		minIndex=tmp; 
    	}
    	stack[current]=x;
    	if(x<min)
    	{
    		min=x;
    		index=current;
    	}
        minIndex[current]=index;
    }
    
    public void pop() {
    	
    	current--;
    	if(current>=0)
    	{
    		min=stack[minIndex[current]]; 
    		index=minIndex[current];
    	}
    	
    }
    
    public int top() {
    	
    	if(current<0)
    		return -1;
    	
		return stack[current];
        
    }
    
    public int getMin() {
    	 return stack[minIndex[current]];
    
        
    }
	
}
