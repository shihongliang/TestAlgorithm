/**
 * 
 */
package com.whu.lock;

/**
 * @author hongliang
 *
 */
public class ThreadB extends Thread{
	
	private MyService service;

	/**
	 * @param service
	 */
	public ThreadB(MyService service) {
		super();
		this.service = service;
	}
	
	
	/* (non-Javadoc)
	 * @see java.lang.Thread#run()
	 */
	@Override
	public void run() {
		service.methodB();
	}
	
	
}
