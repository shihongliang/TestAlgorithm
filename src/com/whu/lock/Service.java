/**
 * 
 */
package com.whu.lock;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @author hongliang
 *
 */
public class Service {
	
	private ReentrantLock lock;

	/**
	 * @param lock
	 */
	public Service(boolean isFair) {
		super();
		lock=new ReentrantLock(isFair);
		
	}
	
	/**
	 * 
	 */
	public Service() {
		// TODO Auto-generated constructor stub
	}

	public void serviceMethod()
	{
		try {
			lock.lock();
			System.out.println(" ThreadName= "+Thread.currentThread().getName());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			lock.unlock();
		}
	}
	
	
	public void serviceMethod1()
	{
		try {
			lock.lock();
			System.out.println("serviceMethod1 getHoldCount" + lock.getHoldCount());
			serviceMethod2();
		} finally {
			// TODO: handle finally clause
			lock.unlock();
		}
		
	}
	
	public void serviceMethod2()
	{
		try {
			lock.lock();
			System.out.println("service Method2 getHoldCount"+ lock.getHoldCount());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			lock.unlock();
		}
	}
	
	
}
