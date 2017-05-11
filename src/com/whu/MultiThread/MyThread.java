/**
 * 
 */
package com.whu.MultiThread;

/**
 * @author hongliang
 *
 */
public class MyThread extends Thread{
	
	/* (non-Javadoc)
	 * @see java.lang.Thread#run()
	 */
	@Override
	public void run() {
	
		super.run();
		System.out.println("MyThread");
	}
	
}
