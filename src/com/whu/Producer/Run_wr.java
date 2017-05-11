/**
 * 
 */
package com.whu.Producer;

import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

/**
 * @author hongliang
 *
 */
public class Run_wr {
	
	public static void main(String[]args)
	{
		try {
			WriteData writeData=new WriteData();
			ReadData readData=new ReadData();
			PipedInputStream inputStream=new PipedInputStream();
			PipedOutputStream outputStream=new PipedOutputStream();
			
			outputStream.connect(inputStream);
			ThreadRead threadRead=new ThreadRead(readData,inputStream);
			threadRead.start();
			Thread.sleep(2000);
			ThreadWriter threadWriter=new ThreadWriter(writeData,outputStream);
			threadWriter.start();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
}
