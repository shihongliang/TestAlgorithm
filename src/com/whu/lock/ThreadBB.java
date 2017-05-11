/**
 * 
 */
package com.whu.lock;

/**
 * @author hongliang
 *
 */
public class ThreadBB  extends Thread{
	
	private MyService service;

	/**
	 * @param servoce
	 */
	public ThreadBB(MyService service) {
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
