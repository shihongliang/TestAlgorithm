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
public class MyService4 {
	
	private ReentrantLock lock=new ReentrantLock();
	private Condition condition=lock.newCondition();
	
	private boolean hasValue=false;
	
	public void set()
	{
		try {
			lock.lock();
			while(hasValue==true)
			{
				condition.wait();
			}
			
			System.out.println(" 打印* ");
			hasValue=true;
			condition.signal();
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			lock.unlock();
		}
		
	}
	
	
	public void get()
	{
		try {
			lock.lock();
			while(hasValue=false)
			{
				condition.await();
			}
			System.out.println("打印=== ");
			hasValue=false;
			condition.signal();
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			lock.unlock();
		}
		
		
	}
	
	
}
