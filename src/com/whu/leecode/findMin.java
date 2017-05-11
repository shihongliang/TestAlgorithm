/**
 * 
 */
package com.whu.leecode;

/**
 * @author hongliang
 *
 */
public class findMin {
	
    public int findMin(int[] nums) {
    	//参数校验
    	if(nums==null||nums.length<1)
    	{
    		throw new IllegalArgumentException();
    	}
    	
    	int lo=0;
    	int hi=nums.length-1;
    	int mid=0;
    	//可以与排除数组全局有序的情况
    	while(nums[lo]>=nums[hi])
    	{
    		if(hi-lo==1)
    		{
    			mid=hi;
    			break;
    		}
    		mid=lo+((hi-lo)>>1);
    		if(nums[mid]==nums[lo]&&nums[mid]==nums[hi])
    		{
    			return sequenceSearch(nums,lo,hi);
    			
    		}
    		
    		//如果mid在有序数组中
    		if(nums[mid]>=nums[lo])
    		{
    			lo=mid;
    		}else if(nums[mid]<=nums[hi]){
    			hi=mid;
    		}
    		
    	}
    			
    	
    	
    	return 0;
        
    }

	/**
	 * @param nums
	 * @param lo
	 * @param hi
	 * @return
	 */
	private int sequenceSearch(int[] nums, int start, int end) {
		for(int i=start;i<end;i++)
		{
			if(nums[i]>nums[i+1])
			{
				return nums[i+1];
			}
		}
		return nums[start];
	}
	
}
