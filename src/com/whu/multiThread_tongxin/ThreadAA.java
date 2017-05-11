/**
 * 
 */
package com.whu.multiThread_tongxin;

/**
 * @author hongliang
 *
 */
public class ThreadAA  extends Thread{
	
	private Object lock;
	
	/**
	 * 
	 */
	public ThreadAA(Object lock) {
		super();
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
