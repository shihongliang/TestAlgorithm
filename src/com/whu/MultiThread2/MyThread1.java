/**
 * 
 */
package com.whu.MultiThread2;

/**
 * @author hongliang
 *
 */
public class MyThread1 extends Thread {
	
	private Task task;

	/**
	 * @param task
	 */
	public MyThread1(Task task) {
		super();
		this.task = task;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Thread#run()
	 */
	@Override
	public void run() {
	
		super.run();
		
		commonUtils.beginTime1=System.currentTimeMillis();
		task.doLongTimeTask();
		commonUtils.endTime1=System.currentTimeMillis();
		
	}
	
}
