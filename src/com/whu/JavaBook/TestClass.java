/**
 * 
 */
package com.whu.JavaBook;

import java.util.HashMap;

import org.junit.Test;

/**
 * @author hongliang
 *
 */
public class TestClass {
	
	private HashMap<String,Integer> map=new HashMap<String,Integer>();
	public synchronized void add(String key)
	{
		Integer value=map.get(key);
		if(value==null)
		{
			map.put(key, 1);
		}
		else
		{
			map.put(key, value+1);
		}
	}
		
}
