/**
 * 
 */
package com.whu.leecode;

/**
 * @author hongliang
 *
 */
public class rotate {
	
    public void rotate(int[] nums, int k) {
        
    	for(int i=0;i<k/2+1;i++)
    	{
    		int temp=nums[k-i-1];
    		nums[k-i-1]=nums[i];
    		nums[i]=temp;
    	}
    	
    	for(int j=k;j<nums.length/2+1;j++)
    	{
    		int temp=nums[k-j-1];
    		nums[k-j-1]=nums[j];
    		nums[j]=temp;
    	}
    	
    	for(int i=0;i<nums.length/2+1;i++)
    	{
    		int temp=nums[k-i-1];
    		nums[k-i-1]=nums[i];
    		nums[i]=temp;
    	}
    	
    	
    }
	
}
