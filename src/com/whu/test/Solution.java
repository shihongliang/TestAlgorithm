/**
 * 
 */
package com.whu.test;

/**
 * @author hongliang
 *
 */
public class Solution {
	
	
	public static void main(String[]args)
	{
		int arr[]={2, 5, 1, 1, 1, 1, 4, 3, 7, 5, 7};
		
		int len=arr.length;
		int leftIndex=0,rightIndex=len-1;
		
		int sumLeft=arr[leftIndex],sumRight=arr[rightIndex];
		int sumMin=0;
		int flag=0;
		
		while(leftIndex<rightIndex&&flag==0)
		{
			if(sumLeft<sumRight)
			{
				leftIndex+=1;
				sumLeft+=arr[leftIndex];
			}
			else if(sumLeft>sumRight)
			{
				rightIndex-=1;
				sumRight+=arr[rightIndex];
			}
			else{
				
				flag=1;
				
				
				
			}
			
		}
		
		
		
		
		
		
	}
	
}
