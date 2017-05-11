/**
 * 
 */
package com.whu.mulitiThread3;

/**
 * @author hongliang
 *
 */
public class Service15 {
	
	public void testMethod(Object lock)
	{
		try {
			System.out.println("begin wait");
			lock.wait();
			System.out.println(" end wait");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("出现异常，因为是wait状态的线程被intterupt了");
		}
	}
	
}
