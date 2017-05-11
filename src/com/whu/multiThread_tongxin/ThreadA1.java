/**
 * 
 */
package com.whu.multiThread_tongxin;

/**
 * @author hongliang
 *
 */
public class ThreadA1 extends Thread {
	
	private Object lock;
	
	/**
	 * 
	 */
	public ThreadA1(Object lock) {
		
		this.lock=lock;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Thread#run()
	 */
	@Override
	public void run() {
		
		super.run();
	}
	
	
}
