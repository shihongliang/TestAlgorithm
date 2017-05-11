/**
 * 
 */
package com.whu.Thinking;

/**
 * @author hongliang
 *
 */
public class TerminitionCondition {
	
	public static void main(String[]args)
	{
		Book novel=new Book(true);
		novel.checkIn();
		new Book(true);
		System.gc();
	}
	
}


class Book{
	boolean checkout=false;
	Book(boolean checkout)
	{
		checkout=checkout;
	}
	
	void checkIn()
	{
		checkout=false;
	}
	
	protected void finilize()
	{
		if(checkout)
		{
			System.out.println("Error:checked out");
		}
	}
	
}