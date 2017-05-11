/**
 * 
 */
package com.whu.leecode;

/**
 * @author hongliang
 *
 */
public class searchInsert {
	
    public int searchInsert(int[] nums, int target) {
		
    	
    	int i=0;
    	
    	if(nums==null)
    	{
    		return -1;
    	}
    	
    	while(i<nums.length)
    	{
    		
    		if(nums[i]==target)
    		{
    			return i;
    		}else if(nums[i]<target&&nums[i+1]>target)
    		{
    			return i+1;
    		}
    		
    		i++;
    		
    	}
    	
    	
    	
    	return target;
        
    }

}
