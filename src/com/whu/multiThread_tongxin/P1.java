/**
 * 
 */
package com.whu.multiThread_tongxin;

/**
 * @author hongliang
 *
 */
public class P1 {
	
	private String lock;

	/**
	 * @param lock
	 */
	public P1(String lock) {
		super();
		this.lock = lock;
	}
	
	public void setValue()
	{
		try {
			synchronized (lock) {
				while(!ValueObject.value.equals(""))
				{
					System.out.println(" 生成者： "+Thread.currentThread().getName()+" WAITING");
					lock.wait();
				}
				System.out.println("生成者： "+Thread.currentThread().getName()+"ＲＵＮＮＩＮＧ　了");
				String value=System.currentTimeMillis()+"_"+System.nanoTime();
				ValueObject.value=value;
				lock.notify();
				
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
}
