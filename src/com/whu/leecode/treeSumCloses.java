/**
 * 
 */
package com.whu.leecode;

import java.util.Arrays;

/**
 * @author hongliang
 *
 */
public class treeSumCloses {
	
    public int threeSumClosest(int[] nums, int target) {
    	
    	//记录最小的差值
    	long minDiff=Long.MAX_VALUE;
    	//记录最小的差值对应的的三个整数
    	long result=0;
    	//每次求得差值
    	long diff;
    	//每次求得整数和
    	long sum;
    	Arrays.sort(nums);
    	
    	for(int i=0;i<nums.length;i++){
    		int j=i+1;
    		int k=nums.length-1;
    		
    		while(j<k){
    			sum=nums[j]+nums[k]+nums[i];
    			diff=Math.abs(target-sum);
    			if(diff==0){
    				return (int) sum;
    			}
    			//如果当前的差值比之前的差值最小
    			if(diff<minDiff){
    				minDiff=diff;
    				result=sum;
    			}
    			
    			if(sum>target){
    				k--;
    			}else{
    				j++;
    			}
    			
    		}
    		
    	}
    	
    	
		return (int) result;
        
    }

}
