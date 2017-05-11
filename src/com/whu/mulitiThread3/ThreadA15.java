/**
 * 
 */
package com.whu.mulitiThread3;

/**
 * @author hongliang
 *
 */
public class ThreadA15 extends Thread{
	
	private Object lock;

	/**
	 * @param lock
	 */
	public ThreadA15(Object lock) {
		super();
		this.lock = lock;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Thread#run()
	 */
	@Override
	public void run() {
		
		Service15 service =new Service15();
		service.testMethod(lock);
		
	}
	
}
