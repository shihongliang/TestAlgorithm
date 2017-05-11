/**
 * 
 */
package com.whu.lock;

/**
 * @author hongliang
 *
 */
public class Run3 {
	
	public static void main(String[]args)
	{
		try {
			MyService3 service=new MyService3();
			ThreadA3 a=new ThreadA3(service);
			a.setName("A");
			a.start();
			ThreadB3 b=new ThreadB3(service);
			b.setName("B");
			b.start();
			Thread.sleep(3000);
			service.sinallA_A();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
