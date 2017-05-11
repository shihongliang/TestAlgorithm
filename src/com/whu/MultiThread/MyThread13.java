/**
 * 
 */
package com.whu.MultiThread;

/**
 * @author hongliang
 *
 */
public class MyThread13 extends Thread{
	
	/* (non-Javadoc)
	 * @see java.lang.Thread#run()
	 */
	@Override
	public void run() {
		
		try {
			for(int i=0;i<500000;i++)
			{
				if(this.interrupted())
				{
					System.out.println("已经处于停止状态！退出。。。。");
				throw new InterruptedException();
				}
				System.out.println("i= "+(i+1));
			}
			
			System.out.println("我在for下面");
		} catch (InterruptedException e) {
			System.out.println("进入MyThread.java类run方法 ");
			e.printStackTrace();
		}
		
	}
	
}
