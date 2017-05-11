/**
 * 
 */
package com.whu.Thinking;

/**
 * @author hongliang
 *
 */
public class More {
	
	public static void main(String[]args)
	{
		for(int i=0;i<5;i++)
		{
			new Thread(new LiftOff()).start();
			System.out.println("Wautubg for LiftOff");
		}
	}
	
}
