/**
 * 
 */
package com.whu.multiThread_tongxin;

/**
 * @author hongliang
 *
 */
public class C {
	private String lock;
	public C(String lock)
	{
		this.lock=lock;
	}
	
	public void getValue()
	{
		try {
			synchronized (lock) {
				
				if(ValueObject.value.equals(""))
				{
					lock.wait();
				}
				System.out.println("get值为： "+ValueObject.value);
				ValueObject.value="";
				lock.notify();
				
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
}
