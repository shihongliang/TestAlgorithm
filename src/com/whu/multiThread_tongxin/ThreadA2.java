/**
 * 
 */
package com.whu.multiThread_tongxin;

/**
 * @author hongliang
 *
 */
public class ThreadA2 extends Thread{
	
	public Object lock;
	
	public ThreadA2(Object lock)
	{
		this.lock=lock;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Thread#run()
	 */
	@Override
	public void run() {
		Service service=new Service();
		service.testMethod(lock);
		super.run();
	}
	
	
	
}
