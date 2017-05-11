/**
 * 
 */
package com.whu.Producer;

/**
 * @author hongliang
 *
 */
public class MyThread extends Thread{
	
	/* (non-Javadoc)
	 * @see java.lang.Thread#run()
	 */
	@Override
	public void run() {
		try {
			int secondValue=(int)(Math.random()*10000);
			System.out.println(secondValue);
			Thread.sleep(secondValue);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
