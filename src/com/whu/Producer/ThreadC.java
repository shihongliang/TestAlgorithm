/**
 * 
 */
package com.whu.Producer;

/**
 * @author hongliang
 *
 */
public class ThreadC extends Thread {
	
	private ThreadB threadB;

	/**
	 * @param threadB
	 */
	public ThreadC(ThreadB threadB) {
		super();
		this.threadB = threadB;
	}
	
/* (non-Javadoc)
 * @see java.lang.Thread#run()
 */
@Override
public void run() {
	threadB.interrupt();
}
	
}
