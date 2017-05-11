/**
 * 
 */
package com.whu.leecode;

/**
 * @author hongliang
 *
 */
public class divide {
	
    public int divide(int dividend, int divisor) {
	
    	
    	//相除时溢出处理
    	if(divisor==0||dividend==Integer.MAX_VALUE&&divisor==-1)
    	{
    		return Integer.MAX_VALUE;
    	}
    	
    	int sign=((dividend<0)^(divisor<0))?-1:1;
    	
    	//求绝对值，为防止溢出就是使用long
    	long dvd=Math.abs((long)dividend);
    	long dvs=Math.abs((long)divisor);
    	
    	//记录结果
    	int result=0;
    	
    	//被除数大于除数
    	while(dvd>=dvs)
    	{
    		long tmp=dvs;
    		long mul=1;
    		while(dvd>=(tmp<<1))
    		{
    			tmp<<=1;
    			mul<<=1;
    		}
    		dvd-=tmp;
    		result+=mul;
    	}
    	
    	
    	return result*divisor;
        
    
    }

}
