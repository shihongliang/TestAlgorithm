/**
 * 
 */
package com.whu.leecode;

/**
 * @author hongliang
 *
 */
public class merge {
	
    public void merge(int[] nums1, int m, int[] nums2, int n) {
    	
    	int pa=m-1;
    	int pb=n-1;
    	int index=m+n-1;
    	while(pa>=0&&pb>=0)
    	{
    		if(nums1[pa]>=nums2[pb])
    		{
    			nums1[index--]=nums1[pb--];
    		}
    		else{
    			nums1[index--]=nums2[pb--];
    		}
    		
    	}
    	
    	while(pb>=0)
    	{
    		nums1[index--]=nums2[pb--];
    	}
    	
        
    }
	
}
