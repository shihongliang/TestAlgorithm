/**
 * 
 */
package com.whu.leecode;

/**
 * @author hongliang
 *
 */
public class Holder1 {
	
	private Automobile a;
	public Holder1(Automobile a ){
		this.a=a;
	}
	Automobile get()
	{
		return a;
	}
	
}

class Automobile{}
