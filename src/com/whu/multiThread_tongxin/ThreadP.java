/**
 * 
 */
package com.whu.multiThread_tongxin;

/**
 * @author hongliang
 *
 */
public class ThreadP extends Thread{
	
	private P1 p;
	
	/**
	 * 
	 */
	public ThreadP(P1 p) {
		this.p=p;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Thread#run()
	 */
	@Override
	public void run() {
		
		while(true)
		{
			p.setValue();
		}
		
	}
	
}
