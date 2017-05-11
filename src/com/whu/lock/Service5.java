/**
 * 
 */
package com.whu.lock;

import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * @author hongliang
 *
 */
public class Service5 {
	
	private ReentrantReadWriteLock lock=new ReentrantReadWriteLock();
	
	public void read(){
		
		try {
			try {
				lock.readLock().lock();
				System.out.println("获得杜锁 " + Thread.currentThread().getName() + " " + System.currentTimeMillis());
				Thread.sleep(10000);
			} finally {
				lock.readLock().unlock();
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
}
