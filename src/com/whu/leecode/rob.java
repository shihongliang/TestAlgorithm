/**
 * 
 */
package com.whu.leecode;

/**
 * @author hongliang
 *
 */
public class rob {
	
    public int rob(int[] nums) {
		if(nums==null||nums.length==0)
			return 0;
		if(nums.length>2)
			nums[2]+=nums[0];
		
		int i=3;
		for(;i<nums.length;i++)
		{
			nums[i]+=Math.max(nums[i-2], nums[i-3]);
		}
		
		if(nums.length==1)
			return nums[0];
		else if(nums.length==2)
			return Math.max(nums[0], nums[2]);
		else
			return Math.max(nums[i-1], nums[i-2]);

    }
}
