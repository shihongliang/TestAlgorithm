/**
 * 
 */
package com.whu.lock;

/**
 * @author hongliang
 *
 */
public class ThreadA3 extends Thread {

	private MyService3 service;

	/**
	 * @param service
	 */
	public ThreadA3(MyService3 service) {
		super();
		this.service = service;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Thread#run()
	 */
	@Override
	public void run() {
		service.awaitA();
	}
	
	
}
