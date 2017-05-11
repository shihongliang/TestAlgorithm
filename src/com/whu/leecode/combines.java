/**
 * 
 */
package com.whu.leecode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author hongliang
 *
 */
public class combines {
	
	private List<List<Integer>> result;
	private List<Integer> list;
	
    public List<List<Integer>> combine(int n, int k) {
		
    	result=new LinkedList<>();
    	
    	if(n>0&&k>0&&n>=k)
    	{
    		list=new LinkedList<>();
    		combine(1,n,k);
    	}
    	
    	
    	
    	
    	
    	return result;
        
    }

	/**
	 * @param i
	 * @param n
	 * @param k
	 */
	private void combine(int start, int end, int num) {
		
		if(num==0)
		{
			List<Integer> tmp=new ArrayList<>();
			for(Integer i:list)
			{
				tmp.add(i);
			}
			
			result.add(tmp);
			return ;
			
		}
		
		int endFirst=end-num+1;
		for(int i=start;i<endFirst;i++)
		{
			list.add(i);
			combine(i+1,end,num-1);
			list.remove(new Integer(i));
		}
		
		
	}
	
}
