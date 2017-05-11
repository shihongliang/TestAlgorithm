/**
 * 
 */
package com.whu.Thinking;

/**
 * @author hongliang
 *
 */
public class InitialValues {
	boolean t;
	char c;
	byte b;
	short s;
	int i;
	long l;
	float f;
	double d;
	InitialValues refrence;
	void printInitialValues()
	{
		System.out.println("Data type  Initial value");
		System.out.println("Data type  Initial value");
		System.out.println("Data type  Initial value"+refrence);
		
	}
	
	public static void main(String[]args)
	{
		InitialValues  iv=new InitialValues();
		iv.printInitialValues();
		
	}
	
	
}
