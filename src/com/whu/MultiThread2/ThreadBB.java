/**
 * 
 */
package com.whu.MultiThread2;

/**
 * @author hongliang
 *
 */
public class ThreadBB extends Thread{
	
	
	private ObjectService service;

	/**
	 * @param service
	 */
	public ThreadBB (ObjectService service) {
		super();
		this.service = service;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Thread#run()
	 */
	@Override
	public void run() {

		super.run();
		service.serviceMethodB();
	}
	
}
