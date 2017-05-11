/**
 * 
 */
package com.whu.lock;

/**
 * @author hongliang
 *
 */
public class ThreadA extends Thread{
	
	private MyService service;

	/**
	 * @param service
	 */
	public ThreadA(MyService service) {
		super();
		this.service = service;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Thread#run()
	 */
	@Override
	public void run() {
		service.methodA();
	}
	
}
