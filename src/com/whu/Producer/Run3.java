/**
 * 
 */
package com.whu.Producer;

/**
 * @author hongliang
 *
 */
public class Run3 {
	
	public static void main(String[]args)
	{
		try {
			for(int i=0;i<10;i++)
			{
				System.out.println("在main线程为 取值为="+Tools.t1.get());
			}
			Thread.sleep(5000);
			ThreadA2 a=new ThreadA2();
			a.start();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
