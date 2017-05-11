/**
 * 
 */
package com.whu.leecode;

import java.util.HashMap;
import java.util.HashSet;

/**
 * @author hongliang
 *
 */
public class containsDuplicate {
	
	 public boolean containsDuplicate(int[] nums) {
		 HashSet<Integer> set=new HashSet<>(nums.length);

		 for(int i=0;i<nums.length;i++)
		 {
			 
			 if(set.contains(nums[i]))
				return true;
			 else
				set.add(i);
		 }
		 
		 return false;   
	 }
	
}
