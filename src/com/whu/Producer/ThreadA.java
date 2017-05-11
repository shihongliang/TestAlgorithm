/**
 * 
 */
package com.whu.Producer;

/**
 * @author hongliang
 *
 */
public class ThreadA extends Thread {

	/* (non-Javadoc)
	 * @see java.lang.Thread#run()
	 */
	@Override
	public void run() {
		for(int i=0;i<Integer.MAX_VALUE;i++)
		{
			String newString=new String();
			Math.random();
		}
	}	

}
