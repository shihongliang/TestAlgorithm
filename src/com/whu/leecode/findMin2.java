/**
 * 
 */
package com.whu.leecode;

/**
 * @author hongliang
 *
 */
public class findMin2 {
	
    public int findMin(int[] nums) {
		if(nums==null||nums.length<0)
			return -1;
    	
    	return binarySearch(nums,0,nums.length-1);
        
    }

	/**
	 * @param nums
	 * @param i
	 * @param j
	 * @return
	 */
	private int binarySearch(int[] nums, int start, int end) {
		int mid;
		
		while(start<end)
		{
			mid=start+(end-start)>>1;
			if(nums[mid]>nums[mid+1])
				return nums[mid+1];
			else if(nums[mid]>start)
			{
				mid=start;
			}
			else
				end=mid;
			
		}
		
		return nums[0];
	}
	
}
