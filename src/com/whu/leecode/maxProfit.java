/**
 * 
 */
package com.whu.leecode;

/**
 * @author hongliang
 *
 */
public class maxProfit {
	
	 public int maxProfit(int[] prices) {
		 if(prices==null||prices.length<0)
			 return 0;
		 int min=prices[0];
		 int profit=0;
		 
		 for(int i=1;i<prices.length;i++)
		 {
			 if(min>prices[i])
				 min=prices[i];
			 
			 else
			 {
				 if(profit<prices[i]-min)
				 {
					 profit=prices[i]-min;
				 }
			 }
			 
			 
		 }
		 
		 
		 
		 return profit;
		
		 
		 
	 }
	
}
