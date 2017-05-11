/**
 * 
 */
package com.whu.JavaBook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * @author hongliang
 *
 */
public class TestSerializableAndDeseriazable {
	
	public static void main(String[]args)
	{
	    SerializePerson();//序列化Person对象
	    Person p=DeserializePerson();//反序列Perons对象
	}

	/**
	 * @return
	 */
	private static Person DeserializePerson() {	
		Person person=null;
		try {
			ObjectInputStream ois=new ObjectInputStream(new FileInputStream(new File("E:/ims/person.txt")));
			person=(Person) ois.readObject();
			System.out.println("Person对象反序列化成功");
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return person;
	}

	/**
	 * 
	 */
	private static void SerializePerson() {
		Person person=new Person();
		person.setAge(21);
		person.setName("张三");
		person.setSex("男");
		try {
			ObjectOutputStream oo=new ObjectOutputStream(new FileOutputStream(new File("E:/ims/person.txt")));
			oo.writeObject(person);
			System.out.println("Person序列化成功");
			oo.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
}
