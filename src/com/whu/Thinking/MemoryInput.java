/**
 * 
 */
package com.whu.Thinking;

import java.io.*;
/**
 * @author hongliang
 *
 */
public class MemoryInput {
	
	public static void main(String[]args) throws IOException
	{
		DataOutputStream out=new DataOutputStream(
				new BufferedOutputStream(
					new FileOutputStream("Data.txt")
						)
		);
		
		out.writeDouble(3.1415925);
		out.writeUTF("Tha was pi");
		out.writeDouble(1.413);
		out.close();
		DataInputStream in=new DataInputStream(
				new FileInputStream("Data.txt")
				);
		
		System.out.println(in.readDouble());
		System.out.println(in.readUTF());
		System.out.println(in.readDouble());
		System.out.println(in.readUTF());
		
	}
	
}
