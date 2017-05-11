/**
 * 
 */
package com.whu.MultiThread;

/**
 * @author hongliang
 *
 */
public class MyThread11 extends Thread {
		
	/* (non-Javadoc)
	 * @see java.lang.Thread#run()
	 */
	@Override
	public void run() {
		
		super.run();
		
		for(int i=0;i<5000000;i++)
		{
			System.out.println("i= "+(i+1));
		}
		
	}
	
}
