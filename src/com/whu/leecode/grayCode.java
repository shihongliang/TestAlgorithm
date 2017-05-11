/**
 * 
 */
package com.whu.leecode;

import java.util.LinkedList;
import java.util.List;

/**
 * @author hongliang
 *
 */
public class grayCode {
	
    public List<Integer> grayCode(int n) {
		
    	List<Integer> result=new LinkedList<Integer>();
    	if(n>=0)
    	{
    		result.add(0);
    		int t=1;
    		
    		for(int i=0;i<n;i++)
    		{
    			for( int j=result.size()-1;j>=0;j--)
    			{
    				System.out.println(result.get(j)^t);
    				result.add(result.get(j)^t);
    			}
    			
    			t<<=1;
    		}
    		
    		
    	}
    	
    	
    	return result;
        
    }
    
    public static void main(String[]args)
    {
    	 grayCode  g=new grayCode();
    	 System.out.println(g.grayCode(2));
    }
    
}
