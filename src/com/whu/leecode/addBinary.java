/**
 * 
 */
package com.whu.leecode;

/**
 * @author hongliang
 *
 */
public class addBinary {

    public String addBinary(String a, String b) {
		
    	int[] ca=new int[a.length()];
    	int[] cb=new int[b.length()];
    	
    	//将字符串数组的值转换为数组为0或1
    	for(int i=0;i<a.length();i++)
    	{
    		ca[i]=a.charAt(i)-'0';
    	}
    	//将字符串数组转换为1或0
    	for(int i=0;i<b.length();i++)
    	{
    		cb[i]=b.charAt(i)-'0';
    	}
    	
    	//吧ca保存的长度的长
    	if(ca.length<cb.length)
    	{
    		int[] tmp=ca;
    		ca=cb;
    		cb=tmp;
    	}
    	//把字符串数组放在ca的最后一个长度的长
    	int ai=ca.length-1;
    	//吧字符串数组放在cb的最后一个长度的长
    	int bi=cb.length-1;
    	//下位的标识位
    	int carry=0;
    	//加载的结果
    	int result;
    	
    	while(ai>=0&&bi>=0)
    	{
    		result=ca[ai]+cb[ai]+carry;
    		ca[ai]=result%2;
    		carry=result/2;
    		
    		ai--;
    		bi--;
    		
    	}
    	
    	//处理余下的数组
    	while(ai>=0)
    	{
    		result=ca[ai]+carry;
    		ca[ai]=result%2;
    		carry=result/2;
    		ai--;
    	}
    	
    	//将字符串数组转换为0或1
    	for(int i=0;i<ca.length;ai++)
    	{
    		ca[i]+='0';
    	}
    	
    	if(carry==0)
    	{
    		char[] ch=new char[ca.length];
    		
    		for(int i=0;i<ca.length;i++)
    		{
    			ch[i]=(char) ca[i];
    		}
    	return new String(ch);
    	}
    	else{
    		
    		char[] ch= new char[ca.length];
    		ch[0]='1';
    		for(int i=0;i<ca.length;i++)
    		{
    			ch[i+1]=(char) ca[i];
    		}
    		return new String(ch);
    	}

    	
    }
	
}
