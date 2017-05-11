/**
 * 
 */
package com.whu.timer;

/**
 * @author hongliang
 *
 */
public class Run5 {
	
	public static void main(String[]args)
	{
		//在main组中添加一个线程组A，然后在这个A组中添加元素
		//方法activeGroupCount和activeCount的值不是固定的
		
		ThreadGroup mainGroup=Thread.currentThread().getThreadGroup();
		ThreadGroup group=new ThreadGroup(mainGroup,"A");
		Runnable runnable=new Runnable(){

			@Override
			public void run() {
				
				try {
					System.out.println("runMethod");
					Thread.sleep(10000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		};
		
		Thread newThread=new Thread(group,runnable);
		newThread.setName("2");
		newThread.start();
		
		ThreadGroup[] listGroup=new ThreadGroup[Thread.currentThread().getThreadGroup().activeCount()];
		Thread.currentThread().getThreadGroup().enumerate(listGroup);
		System.out.println(" main线程中有多少个子线程组  "+listGroup.length+" 名字为： "+listGroup[0].getName());
		Thread[] listThread=new Thread[listGroup[0].activeCount()];
		listGroup[0].enumerate(listThread);
		System.out.println(listThread[0].getName());
		
		
	}
	
}
