/**
 * 
 */
package com.whu.huawei;

import java.util.Scanner;

/**
 * @author hongliang
 *
 */
public class Main {
	
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		
		while(sc.hasNext())
		{
			int times=0;
			int n=sc.nextInt();
			int[] inputArr=new int[n];
			for(int i=0;i<n;i++)
			{
			inputArr[i]=sc.nextInt();
			}
			
			int head=0;
			int tail=n-1;
			while(head<tail)
			{
				if(inputArr[head]>inputArr[tail])
				{
					inputArr[tail--]=inputArr[tail+1];
					times++;
				}
				
				else if(inputArr[head]<inputArr[tail])
				{
					inputArr[++head]=inputArr[head-1];
					times++;
				}
				else{
					head++;
					tail--;
				}
				
			}
			System.out.println(	times);
			
		}
		sc.close();
	}
	
}
