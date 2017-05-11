/**
 * 
 */
package com.whu.multiThread_tongxin;

/**
 * @author hongliang
 *
 */
public class C1 {
	
	private String lock;

	/**
	 * @param lock
	 */
	public C1(String lock) {
		super();
		this.lock = lock;
	}
	
	public void getValue()
	{
		try {
			synchronized (lock) {
				
				while(ValueObject.value.equals(""))
				{
					System.out.println("消费者： "+Thread.currentThread().getName()+" WAITING");
					lock.wait();
				}
				System.out.println("消费者： "+Thread.currentThread().getName()+"Running了");
				ValueObject.value="";
				lock.notify();
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
