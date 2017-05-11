/**
 * 
 */
package com.whu.test;

import java.lang.reflect.Field;

/**
 * @author hongliang
 *
 */
public class Test_1 {
	
	public static void main(String[]args)
	{
		Field[] fields=CompanyA.class.getDeclaredFields();
		
		for(Field f:fields){
			
			Class t=f.getType();
			System.out.println("field name : " + f.getName() + " , type : " + t);

		}
		
	}

}
