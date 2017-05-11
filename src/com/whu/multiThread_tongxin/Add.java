/**
 * 
 */
package com.whu.multiThread_tongxin;



/**
 * @author hongliang
 *
 */
public class Add {
	
	private String lock;
	
	public Add(String lock)
	{
		this.lock=lock;
	}
	
	public void add()
	{
		synchronized (lock) {
	
			lock.notifyAll();
		}
	}
	
	
}
