/**
 * 
 */
package com.whu.Producer;

/**
 * @author hongliang
 *
 */
public class P_Thread extends Thread{
	
	private P p;

	/**
	 * @param p
	 */
	public P_Thread(P p) {
		super();
		this.p = p;
	}
	
	
	/* (non-Javadoc)
	 * @see java.lang.Thread#run()
	 */
	@Override
	public void run() {
		
		while(true)
		{
			p.pushService();
		}
		
	}
	
	
}
