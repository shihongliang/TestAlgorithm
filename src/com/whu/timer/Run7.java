
/**
 * 
 */
package com.whu.timer;

/**
 * @author hongliang
 *
 */
public class Run7 {
	
	public static void main(String[]args)
	{
		ThreadGroup mainGroup=Thread.currentThread().getThreadGroup();
		ThreadGroup groupA=new ThreadGroup(mainGroup,"A");
		Runnable runnable=new Runnable(){

			@Override
			public void run() {
				
				try {
					System.out.println(" runMethod ");
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
			
		};
		
		ThreadGroup groupB=new ThreadGroup(groupA,"B");
		//分配空间，但一定全部用完
		ThreadGroup[] listGroup1=new ThreadGroup[Thread.currentThread().getThreadGroup().activeCount()];
		//传入true是递归取得的子数组
		Thread.currentThread().getThreadGroup().enumerate(listGroup1,true);
		
		for(int i=0;i<listGroup1.length;i++)
		{
			if(listGroup1[i]!=null)
			{
				System.out.println(listGroup1[i].getName());
			}
		}
		
		ThreadGroup[] listGroup2=new ThreadGroup[Thread.currentThread().getThreadGroup().activeCount()];
		Thread.currentThread().getThreadGroup().enumerate(listGroup2,false);
		for(int i=0;i<listGroup2.length;i++)
		{
			if(listGroup2[i]!=null)
			{
				System.out.println(listGroup2[i].getName());
			}
		}
		
		
	}
	
}
