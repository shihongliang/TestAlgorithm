/**
 * 
 */
package com.whu.multiThread21;

/**
 * @author hongliang
 *
 */
public class ThreadA  extends Thread{

	private Service service;
	private MyObject object;
	/**
	 * @param service
	 * @param object
	 */
	public ThreadA(Service service, MyObject object) {
		super();
		this.service = service;
		this.object = object;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Thread#run()
	 */
	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		service.testMethod1(object);
	}
	
}
