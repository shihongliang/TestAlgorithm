/**
 * 
 */
package com.whu.multiThread_tongxin;

/**
 * @author hongliang
 *
 */
public class Service {
	
	public void testMethod(Object lock)
	{
		
		try {
			synchronized (lock) {
				System.out.println(" begin wait(");
				lock.wait();
				System.out.println(" end wait()");
				
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("出现异常了，因为wait被中断了 ");
		}
		
	}
	
}
