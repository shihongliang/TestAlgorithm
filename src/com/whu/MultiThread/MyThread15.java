/**
 * 
 */
package com.whu.MultiThread;

/**
 * @author hongliang
 *
 */
public class MyThread15 extends Thread {
	private long i=0;

	/**
	 * @return the i
	 */
	public long getI() {
		return i;
	}

	/**
	 * @param i the i to set
	 */
	public void setI(long i) {
		this.i = i;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Thread#run()
	 */
	@Override
	public void run() {
		
		while(true)
		{
			i++;
		}
		
	}
	
	
	
}
