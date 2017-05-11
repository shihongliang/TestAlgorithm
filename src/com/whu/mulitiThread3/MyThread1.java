/**
 * 
 */
package com.whu.mulitiThread3;

/**
 * @author hongliang
 *
 */
public class MyThread1 extends Thread {
	
	private Object lock;

	/**
	 * @param lock
	 */
	public MyThread1(Object lock) {
		super();
		this.lock = lock;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Thread#run()
	 */
	@Override
	public void run() {

		try {
			synchronized (lock) {
				System.out.println(" 开始 wait time= "+System.currentTimeMillis());
				lock.wait();
				System.out.println("结束 wait time= "+System.currentTimeMillis());
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
}
