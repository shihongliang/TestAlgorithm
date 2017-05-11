/**
 * 
 */
package com.whu.leecode;

/**
 * @author hongliang
 *
 */
public class removeDuplicate {
	
    public int removeDuplicates(int[] A) {
		
    	
    	if(A.length==0)
    		return -1;
    	int index=0;
    	int next=-1;
    	
    	while(next<A.length)
    	{
    		while(next<A.length&&A[index]==A[next])
    		{
    			next++;
    		}
    		
    		if(next<A.length)
    		{
    			index++;
    			A[index]=A[next];
    			next++;
    		}
    		return index+1;
    		
    	}
    	
    	
    	
    	return 0;
        
    }

}
