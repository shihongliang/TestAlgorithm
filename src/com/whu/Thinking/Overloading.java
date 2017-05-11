/**
 * 
 */
package com.whu.Thinking;

/**
 * @author hongliang
 *
 */
public class Overloading {
	
	public static void main(String[]args)
	{
		for(int i=0;i<5;i++)
		{
			Tree t=new Tree(i);
			t.info();
			t.info("Overriding");
		}
		new Tree();
		
	}
	
}


class Tree
{
	int height;
	Tree()
	{
		System.out.println("Planting a seedling");
		height=0;
	}
	
	Tree(int initialHeight)
	{
		height=initialHeight;
		System.out.println("---"+height);
	}
	
	void info()
	{
		System.out.println("ssss"+height+"-----");
	}
	
	void info(String s)
	{
		System.out.println(s+"---"+height+"feet all");
	}
	
}
