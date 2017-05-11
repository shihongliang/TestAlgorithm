/**
 * 
 */
package com.whu.leecode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author hongliang
 *
 */
public class removeElement {

    public int removeElement(int[] nums, int val) {
    		
    	  List<Integer> list=new ArrayList<Integer>();
    	
    	  for(int i=0;i<nums.length;i++)
    	  {
    		  list.add(i);
    	  }
    	
    	  for(int i=0;i<list.size();i++)
    	  {
    		  if(list.get(i)==val)
    		  {
    			  list.remove(i);
    		  }
    	  }
    	
    	
    	return list.size();
        
    }
	
}
