/**
 * 
 */
package com.whu.lock;

/**
 * @author hongliang
 *
 */
public class ThreadB5 extends Thread {
	
	private Service5 service;

	/**
	 * @param service
	 */
	public ThreadB5(Service5 service) {
		super();
		this.service = service;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Thread#run()
	 */
	@Override
	public void run() {
		service.read();
	}
	
	
}
