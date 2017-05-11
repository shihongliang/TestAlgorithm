/**
 * 
 */
package com.whu.mulitiThread3;

/**
 * @author hongliang
 *
 */
public class ThreadB1 extends Thread {
	
	private Object lock;

	/**
	 * @param object
	 */
	public ThreadB1(Object lock) {
		super();
		this.lock = lock;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Thread#run()
	 */
	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		Service service=new Service();
		service.testMethod(lock);
	}
	
	
	
}
