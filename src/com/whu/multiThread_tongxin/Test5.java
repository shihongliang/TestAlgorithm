/**
 * 
 */
package com.whu.multiThread_tongxin;

/**
 * @author hongliang
 *
 */
public class Test5 {
	
	public static void main(String[]args)
	{
		try {
			Object lock=new Object();
			ThreadAA a =new ThreadAA(lock);
			a.start();
			ThreadBB b=new ThreadBB(lock);
			b.start();
			ThreadCC c=new ThreadCC(lock);
			c.start();
			Thread.sleep(1000);
			NotifyTThread notifyThread=new NotifyTThread(lock);
			notifyThread.start();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}
