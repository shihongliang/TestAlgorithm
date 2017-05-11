/**
 * 
 */
package com.whu.lock;

/**
 * @author hongliang
 *
 */
public class Run {
	
	public static void main(String[]args)
	{
		try {
			MyService service=new MyService();
			ThreadA a =new ThreadA(service);
			a.setName("A");
			a.start();
			ThreadAA aa=new ThreadAA(service);
			aa.setName("aa");
			aa.start();
			Thread.sleep(5000);
			ThreadB b=new ThreadB(service);
			b.setName("b");
			b.start();
			ThreadBB bb=new ThreadBB(service);
			bb.setName("bb");
			bb.start();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
