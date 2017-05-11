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
public class generate {
	
    public List<List<Integer>> generate(int numRows) {
	
		
		
	
		
		List<List<Integer>> list=new ArrayList<List<Integer>>();
		int[][]  data=new int[numRows][numRows];
		
		
		if(numRows<0)
			return null;
		
		if(numRows>=1)
		{
			List<Integer> result=new ArrayList<Integer>();
			result.add(1);
			list.add(result);
		}
		if(numRows>=2)
		{
			List<Integer> result=new ArrayList<Integer>();
			result.add(1);
			result.add(1);
			list.add(result);
		}
		if(numRows>=3)
		{
			
			
			for(int i=3;i<numRows;i++)
			{
				List<Integer> result=new ArrayList<Integer>();
				List<Integer> prev=list.get(i-2);
				result.add(1);
				
				for(int j=2;j<=i-1;j++)
				{
					result.add(prev.get(j-1)+prev.get(j-2));
				}
				result.add(1);
				list.add(result);
			}
			
		}
		
		
    	
    	return list;
        
    }
	
}
