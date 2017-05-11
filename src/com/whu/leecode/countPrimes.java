/**
 * 
 */
package com.whu.leecode;

/**
 * @author hongliang
 *
 */
public class countPrimes {
	
    public int countPrimes(int n) {
    	
    	if(n<=0)
    		return 0;
    	boolean[] notPrime=new boolean[n];
    	notPrime[0]=true;
        notPrime[1]=true;
    	
        for(int i=2;i*i<n;i++)
        {
        	if(!notPrime[i])
        	{
        		for(int j=2;j<n;j++)
        		{
        			notPrime[j]=false;
        		}
        	}
        }
        //统计质数的个数
        int result=0;
        for(boolean b:notPrime)
        {
        	if(!b)
        	{
        		result++;
        	}
        }
    	
    	return result;
    }
	
}
