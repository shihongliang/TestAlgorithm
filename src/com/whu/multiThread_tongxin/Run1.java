/**
 * 
 */
package com.whu.multiThread_tongxin;

/**
 * @author hongliang
 *
 */
public class Run1 {
	
	public static void main(String[]args)
	{
		String lock=new String("");
		P1 p=new P1(lock);
		C1 r=new C1(lock);
		ThreadP[] pThread=new ThreadP[2];
		ThreadC[] rThread=new ThreadC[2];
		
		for(int i=0;i<2;i++)
		{
			pThread[i]=new ThreadP(p);
			pThread[i].setName("生产者 ： "+(i+1));
			rThread[i]=new ThreadC(r);
			rThread[i].setName("消费者： "+(i+1));
			pThread[i].start();
			rThread[i].start();
		}
		
	}
	
}
