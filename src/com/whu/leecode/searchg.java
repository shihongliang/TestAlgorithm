/**
 * 
 */
package com.whu.leecode;

/**
 * @author hongliang
 *
 */
public class searchg {
	
    public int search(int[] nums, int target) {
    	
    	
    	if(nums!=null&&nums.length>0)
    	{
    		
    		//找到最小下标
    		int minIndex=searchMinIndex(nums,0,nums.length-1);
    		
    		//整个数组全局有序
    		if(minIndex==0)
    		{
    			return binarySearch(nums,0,nums.length-1,target);
    		}
    		else{
    			
    			if(nums[nums.length-1]==target)
    			{
    				return nums.length-1;
    			}else if(nums[nums.length-1]>target)
    			{
    				return binarySearch(nums,minIndex,nums.length-1,target);
    			}else{
    				return binarySearch(nums,0,minIndex-1,target);
    			}
    			
    		}
    		
    	}
    	
    	
		return target;
        
    }

	/**
	 * @param nums
	 * @param i
	 * @param j
	 * @return
	 */
	private int searchMinIndex(int[] nums, int start, int end) {
		
		int mid;
		
		while(start<=end)
		{
			mid=start+((end-start)>>1);
			
			if(nums[mid]>nums[mid+1]){
				return mid+1;
			}
			else  if(nums[mid]<nums[mid+1]){
				start=mid;
			}else{
				end=mid;
			}
			
		}
		
		
		return 0;
	}

	/**
	 * @param nums
	 * @param minIndex
	 * @param i
	 * @param target
	 * @return
	 */
	private int binarySearch(int[] nums, int start, int end, int target) {
		
		int mid;
		while(start<=end)
		{
			mid=start+((end=start)>>1);
			
			if(nums[mid]==target)
			{
				return mid;
			}
			else if(nums[mid]>target)
			{
				end=mid-1;
			}
			else{
				start=mid+1;
			}
			
		}
		
		return -1;
	}



}
