/**
 * 
 */
package com.whu.leecode;

import java.util.Deque;
import java.util.LinkedList;

/**
 * @author hongliang
 *
 */
public class isValid {

    public boolean isValid(String s) {
		
    	Deque<Character> stack=new LinkedList<Character>();
    	int index=0;
    	Character top;
    	while(index<s.length()){
    		Character c=s.charAt(index);
    		switch(c){
    		case '(':
    		case '[':
    		case '{':
    			stack.addFirst(c);
    			break;
    		case ')':
    			if(stack.isEmpty()){
    				return false;
    			}
    			top=stack.getFirst();
    			if(top=='('){
    				stack.removeFirst();
    			}else if(top=='['||top=='{'){
    				stack.removeFirst();
    			}else{
    				stack.addFirst(c);
    				}
    			break;
    		case ']':
    			if(stack.isEmpty()){
    				return false;
    			}
    			top=stack.getFirst();
    			if(top=='['){
    				stack.removeFirst();
    			}else if(top=='('||top=='{'){
    				return false;
    			}else{
    				stack.addFirst(c);
    			}
    			break;
    		case '}':
    			top=stack.getFirst();
    			if(stack.isEmpty()){
    				return false;
    			}
    			else if(top=='['||top=='('){
    				return false;
    			}
    			else{
    				stack.addFirst(c);
    			}
    			break;
    			default:
    				return false;
    		}
    		index++;
    	}
    	
    	return stack.isEmpty();
        
    }
	
}
