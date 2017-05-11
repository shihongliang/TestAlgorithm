/**
 * 
 */
package com.whu.multiThread21;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author hongliang
 *
 */
public class AddCountThread extends Thread{
	
	private AtomicInteger count=new AtomicInteger(0);
	
	/* (non-Javadoc)
	 * @see java.lang.Thread#run()
	 */
	@Override
	public void run() {
		
		for(int i=0;i<10000;i++)
		{
			System.out.println(count.incrementAndGet());
		}
				
		
	}
	
}
