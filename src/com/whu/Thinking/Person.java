/**
 * 
 */
package com.whu.Thinking;

/**
 * @author hongliang
 *
 */
public class Person {
	
	public final String first;
	public final String last;
	public final String address;
	/**
	 * @param first
	 * @param last
	 * @param address
	 */
	public Person(String first, String last, String address) {
		super();
		this.first = first;
		this.last = last;
		this.address = address;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Person [first=" + first + ", last=" + last + ", address=" + address + "]";
	}
	
	
	
	
}
