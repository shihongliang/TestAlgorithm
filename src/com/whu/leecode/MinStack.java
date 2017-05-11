/**
 * 
 */
package com.whu.leecode;

import java.util.Stack;

/**
 * @author hongliang
 *
 */
public class MinStack {
	
	private Stack<Integer> minStack=new Stack<Integer>();
	private Stack<Integer> pq=new Stack<Integer>();
	
    /** initialize your data structure here. */
    public MinStack() {
        
    }
    
    public void push(int x) {
    
        minStack.push(x);
        pq.push(Math.min(x, pq.size()>0?pq.peek():x));
        
    }
    
    public void pop() {
    	if(!minStack.isEmpty())
        minStack.pop();
    	pq.pop();
    	
    }
    
    public int top() {
    	
		return minStack.peek();
        
    }
    
    public int getMin() {
    	
    	
    	
		return pq.peek();
        
    }
	
}
