/**
 * 
 */
package com.whu.mulitiThread3;



/**
 * @author hongliang
 *
 */
public class P {	
	
	private String lock;

	/**
	 * @param lock
	 */
	public P(String lock) {
		super();
		this.lock = lock;
	}
	
	public void setValue()
	{
		try {
			synchronized (lock) {
				//if(!ValueObject.value.equals(""))
					lock.wait();
				
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	

}
