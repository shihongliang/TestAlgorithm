/**
 * 
 */
package com.whu.MultiThread;

/**
 * @author hongliang
 *
 */
public class MyThread2 extends Thread {
		
	private int i;
	public MyThread2(int i){
		super();
		this.i=i;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Thread#run()
	 */
	@Override
	public void run() {
		
		System.out.println(i);
	}
	
}
