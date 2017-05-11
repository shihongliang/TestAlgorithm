/**
 * 
 */
package com.whu.mulitiThread3;

/**
 * @author hongliang
 *
 */
public class ThreadA extends Thread {

	private MyList list;

	/**
	 * @param list
	 */
	public ThreadA(MyList list) {
		super();
		this.list = list;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Thread#run()
	 */
	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			for(int i=0;i<10;i++)
			{
				list.add();
				System.out.println("添加了 "+(i+1)+" 个元素");
				Thread.sleep(1000);
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	
}
