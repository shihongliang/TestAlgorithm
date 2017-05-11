/**
 * 
 */
package com.whu.multiThread_tongxin;

/**
 * @author hongliang
 *
 */
public class MyThread1 extends Thread{
	
	private Object lock;
	
	public MyThread1(Object lock)
	{
		this.lock=lock;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Thread#run()
	 */
	@Override
	public void run() {
		
		try {
			synchronized (lock) {
				System.out.println("开始 wait time= "+System.currentTimeMillis());
				lock.wait();
				System.out.println("结束 wati time= "+System.currentTimeMillis());
				
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
}
