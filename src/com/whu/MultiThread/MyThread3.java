/**
 * 
 */
package com.whu.MultiThread;

/**
 * @author hongliang
 *
 */
public class MyThread3 extends Thread{
	
	private int i=5;
	
	/* (non-Javadoc)
	 * @see java.lang.Thread#run()
	 */
	@Override
	public void run() {
		
		System.out.println("i="+(i--)+" threadName= "+Thread.currentThread().getName());
	}
	
	
}
