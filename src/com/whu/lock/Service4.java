/**
 * 
 */
package com.whu.lock;

import java.util.Calendar;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author hongliang
 *
 */
public class Service4 {
	
	private ReentrantLock lock=new ReentrantLock();
	private Condition condition=lock.newCondition();
	
	public void waitMethod()
	{
		try {
			Calendar calendarRef=Calendar.getInstance();
			calendarRef.add(Calendar.SECOND, 10);
			lock.lock();
			System.out.println(" wait method timer= "+ System.currentTimeMillis());
			condition.awaitUntil(calendarRef.getTime());
			System.out.println(" wait end timer= "+ System.currentTimeMillis());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			lock.unlock();
		}
		
	}
	
	
	public void notifyMethod(){
		try {
			Calendar calendarRef=Calendar.getInstance();
			calendarRef.add(Calendar.SECOND, 10);
			lock.lock();
			System.out.println(" wait method timer= "+ System.currentTimeMillis());
			condition.signalAll();
			System.out.println(" wait end timer= "+ System.currentTimeMillis());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			lock.unlock();
		}
	}
	
	
	
}
