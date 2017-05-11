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
public class MyService3 {
	
	private Lock lock=new ReentrantLock();
	private Condition condtionA=lock.newCondition();
	private Condition condtionB=lock.newCondition();
	
	public void awaitA()
	{
		try {
			lock.lock();
			System.out.println(" begin awaitA 时间为： "+System.currentTimeMillis()+" ThreaedName: "+Thread.currentThread().getName());
			condtionA.await();
			System.out.println(" en awaitA 时间为： "+System.currentTimeMillis()+" ThreaedName: "+Thread.currentThread().getName());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void awaitB()
	{
		try {
			lock.lock();
			System.out.println(" begin awaitB 时间为： "+System.currentTimeMillis()+" ThreaedName: "+Thread.currentThread().getName());
			condtionB.await();
			System.out.println(" begin awaitb 时间为： "+System.currentTimeMillis()+" ThreaedName: "+Thread.currentThread().getName());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void sinallA_A()
	{
		try {
			lock.lock();
			System.out.println(" begin signal_a 时间为： " + System.currentTimeMillis() + " ThreaedName: "
					+ Thread.currentThread().getName());
			condtionA.signalAll();
		} finally {
			lock.unlock();
		}
	}
	
	
	public void signallB_B()
	{
		try {
			lock.lock();
			System.out.println(" begin signal_b 时间为： " + System.currentTimeMillis() + " ThreaedName: "
					+ Thread.currentThread().getName());
			condtionB.signalAll();
		} finally {
			lock.unlock();
		}
	}
	
}
