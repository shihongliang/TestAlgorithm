/**
 * 
 */
package com.whu.multiThread_tongxin;

/**
 * @author hongliang
 *
 */
public class ThreadA extends Thread{
	
	private MyList list;
	
	public ThreadA(MyList list)
	{
		this.list=list;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Thread#run()
	 */
	@Override
	public void run() {
		
		
		try {
			for(int i=0;i<10;i++)
			{
				list.add();
				System.out.println("添加了"+(i+1)+"个元素");
				Thread.sleep(1000);
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		super.run();
	}
	
	
}
