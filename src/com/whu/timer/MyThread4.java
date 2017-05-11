/**
 * 
 */
package com.whu.timer;

/**
 * @author hongliang
 *
 */
public class MyThread4 extends Thread {
	
	
	/* (non-Javadoc)
	 * @see java.lang.Thread#run()
	 */
	@Override
	public void run() {
		
		for(int i=0;i<5;i++)
		{
			System.out.println(MyObject.getInstance().hashCode());
		}
		
	}
	
	
}
