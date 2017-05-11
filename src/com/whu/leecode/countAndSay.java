/**
 * 
 */
package com.whu.leecode;

import java.util.Collections;
import java.util.Scanner;

/**
 * @author hongliang
 *
 */
public class countAndSay {
	
    public String countAndSay(int n) {
		
    	if(n<0)
    		return null;
 
    	String result="1";
    	
    	for(int i=2;i<n;i++)
    	{
    		result=countAndSay(result);
    	}
    	System.out.println(result);
    	
    	return result;
        
    
    }

	/**
	 * @param result
	 * @return
	 */
	private String countAndSay(String str) {
		
		StringBuilder sb=new StringBuilder(128);
		int count=1;
		for(int i=1;i<str.length();i++)
		{
			if(str.charAt(i)==str.charAt(i-1))
			{
				count++;
			}else{
				sb.append(count);
				sb.append(str.charAt(i-1));
				count=1;
			}
			
		
			
		}
		
		sb.append(count);
		sb.append(str.charAt(str.length()-1));
		
		return sb.toString();
	}
	
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		countAndSay c=new countAndSay();
		c.countAndSay(n);
		
		
	}
	

}
