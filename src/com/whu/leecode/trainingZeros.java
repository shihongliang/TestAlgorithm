/**
 * 
 */
package com.whu.leecode;

/**
 * @author hongliang
 *
 */
public class trainingZeros {
	
    public int trailingZeroes(int n) {
		
    	int result=0;
    	long temp=n;
    	for(int i=0;i<=temp;i*=5)
    	{
    		result+=n/i;
    	}
    	
    	return result;
    }
	
}
