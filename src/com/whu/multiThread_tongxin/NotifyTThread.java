/**
 * 
 */
package com.whu.multiThread_tongxin;

/**
 * @author hongliang
 *
 */
public class NotifyTThread extends Thread {
	
	private Object lock;
	
	/**
	 * 
	 */
	public NotifyTThread(Object lock) {
		this.lock=lock;
	}
	
	
	/* (non-Javadoc)
	 * @see java.lang.Thread#run()
	 */
	@Override
	public void run() {
		
		synchronized (lock) {
			lock.notify();
		}
		
	}
	
}
