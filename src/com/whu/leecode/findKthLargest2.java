/**
 * 
 */
package com.whu.leecode;

import java.util.PriorityQueue;

/**
 * @author hongliang
 *
 */
public class findKthLargest2 {
	
	public int findKthLargest(int[] nums, int k){
		PriorityQueue<Integer> pq=new PriorityQueue<>();
		for(int n:nums)
		{
			pq.offer(n);
			if(pq.size()>k)
				pq.poll();
		}
		while(pq.size()!=k)
			pq.poll();
		
		return pq.poll();
		
	}
	
}
