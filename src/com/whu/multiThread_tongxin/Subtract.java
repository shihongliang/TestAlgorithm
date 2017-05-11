/**
 * 
 */
package com.whu.multiThread_tongxin;

/**
 * @author hongliang
 *
 */
public class Subtract {
	
	private String lock;
	
	/**
	 * 
	 */
	public Subtract(String lock) {
		this.lock=lock;
	}
	
	public void subtract()
	{
		synchronized (lock) {
			
		}
	}
	
	
}
