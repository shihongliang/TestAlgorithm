/**
 * 
 */
package com.whu.multiThread_tongxin;



/**
 * @author hongliang
 *
 */
public class P {
	
	private String lock;
	
	/**
	 * 
	 */
	public P(String lock) {
		this.lock=lock;
	}
	
	public void setValue()
	{
		try {
			synchronized (lock) {
				if(!ValueObject.value.equals(""))
				{
					lock.wait();
				}
				String value=System.currentTimeMillis()+"_"+System.nanoTime();
				System.out.println("set值为： "+value);
				ValueObject.value=value;
				lock.notify();
				
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
}
