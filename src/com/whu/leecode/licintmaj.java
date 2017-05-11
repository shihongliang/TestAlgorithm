/**
 * 
 */
package com.whu.leecode;

/**
 * @author hongliang
 *
 */
public class licintmaj {
	
    public int majorityElement(int[] nums) {
     
    	int main=nums[0];
    	int count=1;
    	for(int i=1;i<nums.length;i++)
    	{
    		if(main==nums[i])
    		{
    			count++;
    		}
    		else
    		{
    			if(count>0)
    				count--;
    			else
    				main=nums[i];
    		}
    	}
    	
    	
    	return 0;
    }
	
}
