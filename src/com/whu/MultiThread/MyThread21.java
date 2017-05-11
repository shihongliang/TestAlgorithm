/**
 * 
 */
package com.whu.MultiThread;

import java.util.Random;

/**
 * @author hongliang
 *
 */
public class MyThread21 extends Thread {
	
	/* (non-Javadoc)
	 * @see java.lang.Thread#run()
	 */
	@Override
	public void run() {
		long beginTime=System.currentTimeMillis();
		long addResult=0;
		for(int i=0;i<10;i++)
		{
			for(int j=0;j<50000;j++)
			{
				Random random=new Random();
				random.nextInt();
				addResult=addResult+1;
			}
		}
		
		long endTime=System.currentTimeMillis();
		System.out.println("++++++++thread2 use time="+(endTime-beginTime));
		
	}
	
}
