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
public class subsets {

	private List<List<Integer>> result;
	private List<Integer> l;
	private int[] set;
	private int num;
	
    public List<List<Integer>> subsets(int[] S) {
	
    	int len=S.length;
    	
    	if(S!=null)
    	{
    		l=new ArrayList<>();
    		
    		quickSort(S,0,S.length-1);
    		set=S;
    		for(int i=0;i<S.length;i++)
    		{
    			num=i;
    			subsets(0);
    			
    		}
    		
    	}
    	//附空，加快垃圾回收
    	set=null;
    	l=null;
    	
    	return result;
        
    }

	/**
	 * @param num2
	 * 求元素个数num的子集
	 */
	private void subsets(int start) {
		
		if(num==0)
		{
			List<Integer> tmp=new ArrayList<Integer>();
			for(Integer i:l)
			{
				tmp.add(i);
			}
			result.add(tmp);
			return ;
		}
		
		int endFirst=set.length-num;
		for(int i=start;i<endFirst;i++)
		{
			l.add(set[i]);
			num--;
			subsets(i+1);
			num++;
			l.remove(new Integer(set[i]));
			
		}
		
	}

	/**
	 * 实现快速排序
	 * @param s
	 * @param i
	 * @param j
	 */
	private void quickSort(int[] arr, int lo, int hi) {
		
		
		if(lo<hi)
		{
			int mid=getMid(arr,lo,hi);
			quickSort(arr,mid+1,hi);
			quickSort(arr,lo,mid-1);
		}
		
		
	}

	/**
	 * @param arr
	 * @param lo
	 * @param hi
	 * @return
	 */
	private int getMid(int[] arr, int lo, int hi) {
		
		 int  temp=arr[lo];
		 
		 while(lo<hi)
		 {
			 
			 while(lo<hi&&arr[hi]>temp)
			 {
				 hi--;
			 }
			 arr[lo]=arr[hi];
			 while(lo<hi&&arr[lo]<temp)
				 lo++;
			 arr[hi]=arr[lo];
			 
		 }
		 
	
		 arr[lo]=temp;
		
		
		
		return lo;
	}
	
}
