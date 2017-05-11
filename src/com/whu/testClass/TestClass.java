/**
 * 
 */
package com.whu.testClass;

/**
 * @author hongliang
 *
 */
public class TestClass {
	
	private int num;
	public int inc(){
		for(int i=0;i<10;i++)
		{
			num=i;
		}
		return num;
	}
	
	public static void main(String[]args)
	{
		new TestClass().inc();
	}
	
}
