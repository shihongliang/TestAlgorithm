/**
 * 
 */
package com.whu.leecode;

/**
 * @author hongliang
 *
 */
public class search {
	
    public boolean search(int[] nums, int target) {
		
    	if(nums!=null&&nums.length>0)
    	{
    		//找最小元素的下标
    		int minIndex=findMinIndex(nums);
    		
    		if(minIndex==0)
    			return binarySearch(nums,0,nums.length-1,target);
    		else{
    			if(nums[nums.length-1]>target)
    			{
    				return true;
    			}
    			else if(nums[nums.length-1]>target)
    			{
    				return binarySearch(nums,minIndex,nums.length-1,target);
    			}
    			else{
    				return binarySearch(nums,0,minIndex-1,target);
    			}
    			
    		}
 
    	}
    	
    	
    	return false;
        
    }

	/**
	 * @param nums
	 * @param i
	 * @param j
	 * @param target
	 * @return
	 * 二分查找
	 * 
	 * 	 */
	private boolean binarySearch(int[] nums, int start, int end, int target) {
		
		int mid=0;
		while(start<=end)
		{
			mid=start+((end-start)>>1);
			if(nums[mid]==target)
			{
				return true;
			}
			else if(nums[mid]>target)
			{
				end=mid-1;
			}
			else{
				start=mid+1;
			}
		}
		
		return false;
	}

	/**
	 * @param nums
	 * @return
	 */
	private int findMinIndex(int[] nums) {
		
		if(nums==null||nums.length<1)
			throw new IllegalArgumentException();
		int lo=0;
		int hi=nums.length-1;
		int mid=0;
		
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
				//因为采用顺序搜索方法，不能采用lo++
				return sequenceSearchMinIndex(nums,lo,hi);
				
			}
			
			if(nums[mid]>=nums[lo])
			{
				lo=mid;
			}
			else if(nums[mid]<=nums[hi])
			{
				hi=mid;
			}
			
		}
		
		
		return mid;
	}

	/**
	 * @param nums
	 * @param lo
	 * @param hi
	 * @return
	 * 从搜索算法中找出数组的小标的最小值，nums是有序数组的一个轴
	 */
	private int sequenceSearchMinIndex(int[] nums, int start, int end) {
		
		for(int i=start;i<end;i++)
		{
			if(nums[i]>nums[i+1])
			{
				return i+1;
			}
		}
		
		return start;
	}
	
}
