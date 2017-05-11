/**
 * 
 */
package com.whu.test;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author hongliang
 *
 */
public class SendThread implements Runnable{


	private DataOutputStream dout;
	

	/**
	 * @param dout
	 */
	public SendThread(DataOutputStream dout) {
		super();
		this.dout = dout;
	}


	@Override
	public void run() {
		
		while(true)
		{
			String msg;
			
			try {
				BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
				//注意不能直接用DataInputStream 封装的标准输入，原因前文已经提到
				msg=bf.readLine();
				dout.writeUTF(msg);
			} catch (IOException e) {
				break;
			}
			
		}
		
	}
	
	
	
}
