/**
 * 
 */
package com.whu.Producer;

/**
 * @author hongliang
 *
 */
public class C_Thread extends Thread{
	
	private C r;

	/**
	 * @param r
	 */
	public C_Thread(C r) {
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
			r.popService();
		}
	}
	
}
