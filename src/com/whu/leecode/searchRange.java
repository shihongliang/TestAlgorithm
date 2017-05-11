/**
 * 
 */
package com.whu.leecode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author hongliang
 *
 */
public class searchRange {
	
	
    public int[] searchRange(int[] nums, int target) {
    	
    	
    	List<Integer> list=new ArrayList<Integer>();
    	int[]  aa=new int[2];
    	for(int i=0;i<nums.length;i++)
    	{
    		if(nums[i]==target)
    		{
    			list.add(i);
    		}
    		else{
    			aa[0]=-1;
    			aa[1]=-1;
    			return aa ;
    		}
    	}
    	
    
    	
    	aa[0]=list.get(0);
    	aa[1]=list.get(nums.length-1);
    	
    	
    	return aa;
        
    }

}
