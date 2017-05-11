/**
 * 
 */
package com.whu.Producer;

/**
 * @author hongliang
 *
 */
public class C {
	
	private MyStack myStack;

	/**
	 * @param myStack
	 */
	public C(MyStack myStack) {
		super();
		this.myStack = myStack;
	}
	
	
	public void popService()
	{
		System.out.println("pop= "+myStack.pop());
	}
	
	
}
