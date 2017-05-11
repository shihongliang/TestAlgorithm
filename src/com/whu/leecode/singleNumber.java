/**
 * 
 */
package com.whu.leecode;

/**
 * @author hongliang
 *
 */
public class singleNumber {
	
    public int singleNumber(int[] nums) {
	
    	int[] count=new int[32];
    	int result=0;
    	for(int i=0;i<32;i++)
    	{
    		for(int n:nums)
    		{
    			if(((n>>i)&1)==1)
    			{
    				count[i]++;
    			}
    		}
    		
    		result|=(count[i]%3)<<i;
    	}
    	
    	return result;
        
    }
	
}
