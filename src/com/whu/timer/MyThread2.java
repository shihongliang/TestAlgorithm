/**
 * 
 */
package com.whu.timer;

/**
 * @author hongliang
 *
 */
public class MyThread2 extends Thread {
	
	/* (non-Javadoc)
	 * @see java.lang.Thread#run()
	 */
	@Override
	public void run() {
		
		System.out.println(MyObject.getInstance().hashCode());
		
	}
	
}
