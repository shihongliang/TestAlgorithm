/**
 * 
 */
package com.whu.Producer;

/**
 * @author hongliang
 *
 */
public class P {
	
	private MyStack myStack;

	/**
	 * @param myStack
	 */
	public P(MyStack myStack) {
		super();
		this.myStack = myStack;
	}
	
	public void pushService()
	{
		myStack.push();
	}
	
}
