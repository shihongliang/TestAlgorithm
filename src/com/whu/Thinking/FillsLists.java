/**
 * 
 */
package com.whu.Thinking;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author hongliang
 *
 */

class StringAddress{
	private String s;
	public StringAddress(String s)
	{
		this.s=s;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "StringAddress [s=" + s + "]";
	}
	
	
}

public class FillsLists {
	
	public static void main(String[]args)
	{
		List<StringAddress> list=new ArrayList<StringAddress>();
		System.out.println(list);
		Collections.fill(list, new StringAddress("World!"));
		System.out.println(list);
	}
	
}
