/**
 * 
 */
package com.whu.lock;

/**
 * @author hongliang
 *
 */
public class MyThreadB4 extends Thread {
	
	private MyService4 service;

	/**
	 * @param service
	 */
	public MyThreadB4(MyService4 service) {
		super();
		this.service = service;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Thread#run()
	 */
	@Override
	public void run() {
		
		for(int i=0;i<Integer.MAX_VALUE;i++)
		{
			service.get();
		}
		
	}
	
}
