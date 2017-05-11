/**
 * 
 */
package com.whu.multiThread_tongxin;

/**
 * @author hongliang
 *
 */
public class ThreadC extends Thread {
	
	private C1 r;

	/**
	 * @param r
	 */
	public ThreadC(C1 r) {
		super();
		this.r = r;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Thread#run()
	 */
	@Override
	public void run() {
		
		while(true)
		{
			r.getValue();
		}
	
	}
	
}
