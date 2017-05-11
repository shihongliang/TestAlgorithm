/**
 * 
 */
package com.whu.test;

import java.util.ArrayList;
import java.util.List;

/**
 * @author hongliang
 *
 */
public class test01 {
	
	public static List<String[]> listToArray(List<String> list,int bccSize)
	{
		List<String[]> list2=new ArrayList<String[]>();
		String arr[]=null;
		for(int j=1,len=list.size()+1;j<len;j++)
		{
			if(j==1){
				if(len>bccSize)
				{
					arr=new String[bccSize];
				}
				else{
					arr=new String[len-1];
				}
				
			}
			
			arr[j-(bccSize*list2.size())-1]=list.get(j-1);
			if(j%bccSize==0)
			{
				list2.add(arr);
			}
			if(len-1-j>bccSize)
			{
				arr=new String[bccSize];
			}
			else{
				arr=new String[len-(bccSize*list2.size())-1];
			}
		}
		return list2;
	}
	
	
}
