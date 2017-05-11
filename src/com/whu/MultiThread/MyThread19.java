/**
 * 
 */
package com.whu.MultiThread;

/**
 * @author hongliang
 *
 */
public class MyThread19 extends Thread{
	
	/* (non-Javadoc)
	 * @see java.lang.Thread#run()
	 */
	@Override
	public void run() {
		
		long beginTime=System.currentTimeMillis();
		int count=0;
		for(int i=1;i<5000000;i++)
		{
			//Thread.yield();
			count=count+i;
		}
		
		long endTime=System.currentTimeMillis();
		System.out.println("用时： "+(endTime-beginTime)+" 毫秒");
		
	}
	
}
