/**
 * 
 */
package com.whu.lock;

/**
 * @author hongliang
 *
 */
public class MyThreadBB  extends Thread{
	
	private Service4 service;

	/**
	 * @param service
	 */
	public MyThreadBB(Service4 service) {
		super();
		this.service = service;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Thread#run()
	 */
	@Override
	public void run() {
		service.notifyMethod();
	}
	
	
}
