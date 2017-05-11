/**
 * 
 */
package com.whu.lock;

/**
 * @author hongliang
 *
 */
public class MyThreadA4 extends Thread {
	
	private MyService4 myService;

	/**
	 * @param myService
	 */
	public MyThreadA4(MyService4 myService) {
		super();
		this.myService = myService;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Thread#run()
	 */
	@Override
	public void run() {
		
		for(int i=0;i<Integer.MAX_VALUE;i++)
		{
			myService.set();
		}
	}
	
	
	
}
