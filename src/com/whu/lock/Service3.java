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
public class Service3 {
	
	private ReentrantLock lock=new ReentrantLock();
	
	private Condition condition=lock.newCondition();
	
	
	public void testMethod(){
		try {
			lock.lock();
			System.out.println("wait begin");
			condition.awaitUninterruptibly();
			System.out.println("wait end");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			lock.unlock();
		}
		
	}
	
	
}
