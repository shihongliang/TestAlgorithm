/**
 * 
 */
package com.whu.multiThread21;

/**
 * @author hongliang
 *
 */
public class ThreadA2 extends Thread{
	
	private MyService service;

	/**
	 * @param service
	 */
	public ThreadA2(MyService service) {
		super();
		this.service = service;
	}
	
	
	/* (non-Javadoc)
	 * @see java.lang.Thread#run()
	 */
	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		service.testMethod1();
	}
	
}
