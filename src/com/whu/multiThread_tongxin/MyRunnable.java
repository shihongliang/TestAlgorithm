/**
 * 
 */
package com.whu.multiThread_tongxin;

/**
 * @author hongliang
 *
 */
public class MyRunnable {
	
	private static Object lock=new Object();
	private static Runnable runnable1=new Runnable(){

		@Override
		public void run() {
			
			try {
				synchronized (lock) {
					System.out.println(" wait time = "+System.currentTimeMillis());
					lock.wait(5000);
					System.out.println(" wait end time = "+System.currentTimeMillis());
				}
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		}
		
	};
	
	public static void main(String[]args)
	{
		Thread t=new Thread(runnable1);
		t.start();
	}
	
	
}
