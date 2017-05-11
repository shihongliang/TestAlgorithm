/**
 * 
 */
package com.whu.multiThread21;

/**
 * @author hongliang
 *
 */
public class MyService {
	
	private String lock="123";
	
	public void testMethod1(){
		
		try {
			synchronized (lock) {
				System.out.println(Thread.currentThread().getName()+" begin "+System.currentTimeMillis());
				lock="456";
				Thread.sleep(2000);
				System.out.println(Thread.currentThread().getName()+" end "+System.currentTimeMillis());
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}
