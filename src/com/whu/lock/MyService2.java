/**
 * 
 */
package com.whu.lock;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author hongliang
 *
 */
public class MyService2 {
	
	private Lock lock=new  ReentrantLock();
	
	private Condition condition=lock.newCondition();
	
	public void await()
	{
		try {
			lock.lock();
			System.out.println(" await 时间为: "+System.currentTimeMillis());
			condition.await();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			lock.unlock();
		}
	}
	
	
	public void signal(){
		try {
			lock.lock();
			System.out.println("signal的时间为: " + System.currentTimeMillis());
			condition.signal();
		} finally {
			lock.unlock();
		}
	}
	
	
}
