/**
 * 
 */
package com.whu.leecode;

/**
 * @author hongliang
 *
 */
public class isHappy {
	
    public boolean isHappy(int n) {
    	
    	String s=String.valueOf(n);
    	int m=0;
    	for(int i=0;i<s.length();i++)
    	{
    		int t=s.charAt(i)-'0';
    		t=t^2;
    		m+=t;
    	}
    	if(m==1)
    	{
    		return true;
    	}else{
    		return isHappy(m);
    	}
    	
    
    }
	
}
