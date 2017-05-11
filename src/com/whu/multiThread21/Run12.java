/**
 * 
 */
package com.whu.multiThread21;

import com.whu.multiThread21.PublicClass.PrivateClass;

/**
 * @author hongliang
 *
 */
public class Run12 {
	
	public static void main(String[]args)
	{
		PublicClass publicClass=new PublicClass();
		publicClass.setUsername("usernameValue");
		publicClass.setPassword("passwordValue");
		System.out.println(publicClass.getUsername()+" -- "+publicClass.getPassword());
		PrivateClass privateClass=publicClass.new PrivateClass();
		privateClass.setAge("ageValue");
		privateClass.setAddress("addRessValue");
		System.out.println(privateClass.getAge()+"-->"+privateClass.getAddress());
	}
	
}
