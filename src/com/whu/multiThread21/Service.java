/**
 * 
 */
package com.whu.multiThread21;

/**
 * @author hongliang
 *
 */
public class Service {
	
	/**
	 * 
	 * @param object
	 */
	public void testMethod1(MyObject object)
	{
		try {
			synchronized (object) {
				System.out.println("testMethod1_getLock time= "+ System.currentTimeMillis()+" run ThreadName= "+ Thread.currentThread().getName());
				Thread.sleep(2000);
				System.out.println("testMethod1 releaseLock time= "+System.currentTimeMillis()+" run ThreadName="+Thread.currentThread().getName());
			
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
