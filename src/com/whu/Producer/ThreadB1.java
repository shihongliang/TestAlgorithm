/**
 * 
 */
package com.whu.Producer;

/**
 * @author hongliang
 *
 */
public class ThreadB1 extends Thread{
	
	synchronized public void run()
	{
		try {
			System.out.println(" begin B ThreadName= "+Thread.currentThread().getName()+" "+System.currentTimeMillis());
			Thread.sleep(5000);
			System.out.println(" end B　ThreadName= "+Thread.currentThread().getName()+" "+System.currentTimeMillis());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
