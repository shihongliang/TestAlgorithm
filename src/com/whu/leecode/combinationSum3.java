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
public class combinationSum3 {
	
	  public List<List<Integer>> combinationSum3(int k, int n) {
		
		  List<Integer> list=new ArrayList<Integer>();
		  List<List<Integer>> llist=new ArrayList<List<Integer>>();
		  
		  helper(llist,list,k,1,n);
		  
		  return null;
	        
	    }

	/**
	 * @param llist
	 * @param list
	 * @param k
	 * @param i
	 * @param n
	 */
	private void helper(List<List<Integer>> llist, List<Integer> list, int k, int start, int n) {
			if(n<0)
				return ;
			if(n==0&&list.size()==k)
			{
				llist.add(new ArrayList<Integer>(list));
				return ;
			}
			for(int i=start;i<=9;i++)
			{
				list.add(i);
				 helper(llist,list,k,i+1,n-1);
			}
			list.remove(list.size()-1);
			
	}



}
