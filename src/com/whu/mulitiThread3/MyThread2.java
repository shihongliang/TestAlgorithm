/**
 * 
 */
package com.whu.mulitiThread3;

/**
 * @author hongliang
 *
 */
public class MyThread2 extends Thread {
	
	private Object lock;

	/**
	 * @param lock
	 */
	public MyThread2(Object lock) {
		super();
		this.lock = lock;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Thread#run()
	 */
	@Override
	public void run() {
		synchronized (lock) {
			System.out.println("开始notify time= "+System.currentTimeMillis());
			lock.notify();
			System.out.println("结束 noptify time= "+System.currentTimeMillis());
		}
	}
	
	
	
}
