/**
 * 
 */
package com.whu.multiThread21;

/**
 * @author hongliang
 *
 */
public class ThreadBB extends Thread{
	
	private Service21 service;

	/**
	 * @param service
	 */
	public ThreadBB(Service21 service) {
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
		service.methodB();
	}
	
}
