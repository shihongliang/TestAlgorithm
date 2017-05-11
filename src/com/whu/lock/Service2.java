/**
 * 
 */
package com.whu.lock;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author hongliang
 *
 */
public class Service2 {
	
	public ReentrantLock lock=new ReentrantLock();
	
	public Condition newCondition=lock.newCondition();
	public void waitMethod()
	{
		try {
			lock.lock();
			Thread.sleep(Integer.MAX_VALUE);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			lock.unlock();
		}
		
	}
	
}
