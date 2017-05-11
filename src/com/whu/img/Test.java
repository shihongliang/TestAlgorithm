/**
 * 
 */
package com.whu.img;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author hongliang
 *
 */
public class Test {
	private static SimpleDateFormat sdf=new SimpleDateFormat("YYYY:MM:dd HH:ss");
	
	public static void main(String[]args) throws Exception
	{
		int t=(int) Math.floor((new Date().getTime())/1000);
		
		String e=Integer.toHexString(t).toUpperCase();
		
		
		System.out.println(e);
	}
	
}
