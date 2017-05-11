/**
 * 
 */
package com.whu.MultiThread2;

/**
 * @author hongliang
 *
 */
public class ThreadB1 extends Thread {
	
	private Service service;

	/**
	 * @param service
	 */
	public ThreadB1(Service service) {
		super();
		this.service = service;
	}
	
	
	/* (non-Javadoc)
	 * @see java.lang.Thread#run()
	 */
	@Override
	public void run() {
		
		service.setUsernamePassword("b", "bb");
	}
	
	
}
