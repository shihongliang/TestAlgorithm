/**
 * 
 */
package com.whu.Producer;

/**
 * @author hongliang
 *
 */
public class ThreadB extends Thread {
	
	/* (non-Javadoc)
	 * @see java.lang.Thread#run()
	 */
	@Override
	public void run() {
		try {
			ThreadA a=new ThreadA();
			a.start();
			a.join();
			System.out.println("线程B在 run end 处打印了");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			System.out.println("线程B在catch处打印了");
			e.printStackTrace();
		}
	}
	
}
