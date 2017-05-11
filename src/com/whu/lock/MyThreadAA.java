/**
 * 
 */
package com.whu.lock;

/**
 * @author hongliang
 *
 */
public class MyThreadAA extends Thread {
	
	private Service4 service;

	/**
	 * @param service
	 */
	public MyThreadAA(Service4 service) {
		super();
		this.service = service;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Thread#run()
	 */
	@Override
	public void run() {
		
		service.waitMethod();
		
	}
	
	
	
}
