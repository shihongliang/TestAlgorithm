/**
 * 
 */
package com.whu.lock;

/**
 * @author hongliang
 *
 */
public class Run2 {
	
	public static void main(String[]args)
	{
		

		try {
			MyService2 service = new MyService2();
			MyThreadA a = new MyThreadA(service);
			a.start();
			Thread.sleep(3000);
			service.signal();
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
	
	

	
}
