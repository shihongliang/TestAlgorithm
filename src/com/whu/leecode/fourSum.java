/**
 * 
 */
package com.whu.leecode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * @author hongliang
 *
 */
public class fourSum {
    public List<List<Integer>> fourSum(int[] nums, int target) {
		
    	List<List<Integer>> result=new LinkedList<>();
    	
    	if(nums==null||nums.length<4)
    		return result;
    	Arrays.sort(nums);
    	for(int i=0;i<nums.length;i++){
    		if(i>0&&nums[i]==nums[i-1]){
    			continue;
    		}
    		
    		for(int j=nums.length-1;j>i+2;j--){
    			if(j<nums.length-1&&nums[j]==nums[j+1]){
    				continue;
    			}
    			
    			int start=i+1;
    			int end=j-1;
    			int n=target-nums[i]-nums[j];
    			
    			while(start<end){
    				if(nums[start]+nums[end]==n){
    					List<Integer> four=new ArrayList<Integer>();
    					four.add(nums[i]);
    					four.add(nums[start]);
    					four.add(nums[end]);
    					four.add(nums[j]);
    					result.add(four);
    					
    					do{
    						start++;
    					}while(start<end&&nums[start]==nums[start-1]);
    					
    					do{
    						end--;
    					}while(start<end&&nums[end]==nums[end+1]);
    					
    				}else if(nums[start]+nums[end]<n) {
    					do{
    						start++;
    					}while(start<end&&nums[start]==nums[start-1]);
    				}else{
    					do{
    						end--;
    					}while(start<end&&nums[end]==nums[end+1]);
    				}
    			}
    			
    			
    		}
    		
    	}
    	
    	
    	
    	return result;
        
    }

}
