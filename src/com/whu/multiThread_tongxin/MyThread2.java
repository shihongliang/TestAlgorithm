/**
 * 
 */
package com.whu.multiThread_tongxin;

/**
 * @author hongliang
 *
 */
public class MyThread2 extends Thread{
	
	private Object lock;
	
	public MyThread2(Object lock)
	{
		this.lock=lock;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Thread#run()
	 */
	@Override
	public void run() {
		
		synchronized (lock) {
			System.out.println("开始 notify time= "+System.currentTimeMillis());
			lock.notify();
			System.out.println("结束 notify time= "+System.currentTimeMillis());
		}
		
	}
	
	
}