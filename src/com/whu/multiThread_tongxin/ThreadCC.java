/**
 * 
 */
package com.whu.multiThread_tongxin;

/**
 * @author hongliang
 *
 */
public class ThreadCC extends Thread{
	
	private Object lock;
	
	/**
	 * 
	 */
	public ThreadCC(Object lock) {
		this.lock=lock;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Thread#run()
	 */
	@Override
	public void run() {
		
		Service service=new Service();
		service.testMethod(lock);
	}
	
}
