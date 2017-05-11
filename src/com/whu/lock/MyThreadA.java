/**
 * 
 */
package com.whu.lock;

/**
 * @author hongliang
 *
 */
public class MyThreadA extends Thread {
	
	private MyService2 service;

	/**
	 * @param service
	 */
	public MyThreadA(MyService2 service) {
		super();
		this.service = service;
	}
	
	
	/* (non-Javadoc)
	 * @see java.lang.Thread#run()
	 */
	@Override
	public void run() {
		try {
			service.wait();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
}
