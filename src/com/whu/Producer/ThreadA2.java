/**
 * 
 */
package com.whu.Producer;

/**
 * @author hongliang
 *
 */
public class ThreadA2 extends Thread{
	
	/* (non-Javadoc)
	 * @see java.lang.Thread#run()
	 */
	@Override
	public void run() {
		
		try {
			for(int i=0;i<10;i++)
			{
				System.out.println("在 ThreadA线程总取值为:"+Tools.t1.get());
				Thread.sleep(100);
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}
	
}
