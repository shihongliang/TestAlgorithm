/**
 * 
 */
package com.whu.mulitiThread3;

/**
 * @author hongliang
 *
 */
public class Service {
	
	public void testMethod(Object lock)
	{
		try {
			synchronized (lock) {
				System.out.println(" begin wait()");
				lock.wait();
				System.out.println(" end wait()");
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
