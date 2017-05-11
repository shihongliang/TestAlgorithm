/**
 * 
 */
package com.whu.leecode;

/**
 * @author hongliang
 *
 */
public class findKthLargest {
	
	   public int findKthLargest(int[] nums, int k) {
		
		   
		   int temp=0;
		   for(int i=0;i<nums.length;i++)
			   for(int j=i+1;j<nums.length;j++)
			   {
				   if(nums[j]<nums[i])
				   {
					   temp=nums[j];
					   nums[j]=nums[i];
					   nums[i]=temp;
				   }
			   }
		   
		   if(k<0||k>nums.length)
		   {
			   return -1;
		   }
		   
		   for(int i=0;i<nums.length;i++)
		   {
			   if(i==k)
			   {
				   return k;
			   }
		   }
			 return -1;   
		 
	   }
	
}
