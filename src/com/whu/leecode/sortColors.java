/**
 * 
 */
package com.whu.leecode;

/**
 * @author hongliang
 *
 */
public class sortColors {
	
    public void sortColors(int[] nums) {
    	
    	 int t=0;
    	 int sum=0;
    	 
    	for(int i=0;i<nums.length;i++)
    	{
    		
    		if(nums[i]==1)
    		{
    			t+=nums[i];
    		}
    		sum+=nums[i];
    	}
    	
    	
    	int t2=(sum-t)/2;
    	
    	int t0=nums.length-t2-t;
    	
        
    }

}
