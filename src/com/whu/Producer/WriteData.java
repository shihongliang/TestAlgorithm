/**
 * 
 */
package com.whu.Producer;

import java.io.IOException;
import java.io.PipedOutputStream;

/**
 * @author hongliang
 *
 */
public class WriteData {
	
	public void writeMethod(PipedOutputStream out)
	{
		try {
			System.out.println(" write: ");
			for(int i=0;i<300;i++)
			{
				String outData=" "+(i+1);
				out.write(outData.getBytes());
				System.out.println(outData);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
