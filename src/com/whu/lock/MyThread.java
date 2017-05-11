/**
 * 
 */
package com.whu.lock;

/**
 * @author hongliang
 *
 */
public class MyThread extends Thread{
	
	private Service3 service;

	/**
	 * @param service
	 */
	public MyThread(Service3 service) {
		super();
		this.service = service;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Thread#run()
	 */
	@Override
	public void run() {
		service.testMethod();
	}
	
	
}
