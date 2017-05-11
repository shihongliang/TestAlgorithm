/**
 * 
 */
package com.whu.leecode;

/**
 * @author hongliang
 *
 */
public class maxSubArray {
	
	public static int maxSubArray(int[] nums) {
		
		if(nums==null||nums.length<0)
			try {
				throw new Exception();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		int max=Integer.MAX_VALUE;
		int curSum=0;
		
		for(int i:nums)
		{
			if(curSum<0)
				curSum=0;
			else
				curSum+=i;
			
			if(max<curSum)
				max=curSum;
			
		}
		
		
		
		return max;
		
		
	}

}
