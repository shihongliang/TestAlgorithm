/**
 * 
 */
package com.whu.Thinking;

/**
 * @author hongliang
 *
 */
public class SimpleConstructor {
	
	public static void main(String[]args)
	{
		for(int i=0;i<8;i++)
		{
			new Rock2(i);
			
		}
	}
	
}

class Rock2{
	Rock2(int i)
	{
		System.out.println("Rock"+i+" ");
	}
}

