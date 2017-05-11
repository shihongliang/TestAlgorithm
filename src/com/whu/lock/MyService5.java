/**
 * 
 */
package com.whu.lock;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author hongliang
 *
 */
public class MyService5 {
	
	public ReentrantLock lock=new ReentrantLock();
	
	public void waitMethod(){
		try {
			if(lock.tryLock(3,TimeUnit.SECONDS))
			{
				System.out.println(Thread.currentThread().getName()+" 获得锁");
				Thread.sleep(3000);
			}else
			{
				System.out.println(Thread.currentThread().getName()+"没有获得锁");
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			if(lock.isHeldByCurrentThread())
			{
				lock.unlock();
			}
		}
		
	}
	
	
}
