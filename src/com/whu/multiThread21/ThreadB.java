/**
 * 
 */
package com.whu.multiThread21;

/**
 * @author hongliang
 *
 */
public class ThreadB extends Thread{
	
	private Service service;
	private MyObject object;
	/**
	 * @param service
	 * @param object
	 */
	public ThreadB( MyObject object) {
		super();
	
		this.object = object;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Thread#run()
	 */
	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		object.speedPrintString();
	}
	
}
