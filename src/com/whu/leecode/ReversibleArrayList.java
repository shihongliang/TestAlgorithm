/**
 * 
 */
package com.whu.leecode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/**
 * @author hongliang
 *
 */
public class ReversibleArrayList<T> extends ArrayList<T>{
	
	public  ReversibleArrayList(Collection<T> c)
	{
		super(c);
	}
	public Iterator<T> reversed(){
		return new Iterator<T>(){

			int current=size()-1;
			
			@Override
			public boolean hasNext() {
			
				return current>-1;
			}

			@Override
			public T next() {
		
				return get(current--);
			}

			@Override
			public void remove() {
				   try {
					throw new Exception();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
			
		};
	}
	
}




















