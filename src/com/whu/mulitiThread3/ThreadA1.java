/**
 * 
 */
package com.whu.mulitiThread3;

/**
 * @author hongliang
 *
 */
public class ThreadA1 extends Thread{
	
	private Object lock;

	/**
	 * @param lock
	 */
	public ThreadA1(Object lock) {
		super();
		this.lock = lock;
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
