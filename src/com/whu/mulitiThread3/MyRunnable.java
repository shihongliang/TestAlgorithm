/**
 * 
 */
package com.whu.mulitiThread3;

/**
 * @author hongliang
 *
 */
public class MyRunnable {
	
	private static Object lock=new Object();
	private static Runnable runnable=new Runnable(){

		@Override
		public void run() {
			
			try {
				synchronized (lock) {
					System.out.println(" wait begin timer= "+System.currentTimeMillis());
					lock.wait(5000);
					System.out.println(" wait begin timer= "+System.currentTimeMillis());
				}
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
	};
	
	public static void main(String[]args)
	{
		Thread t=new Thread(runnable);
		t.start();
	}
	
	
}
