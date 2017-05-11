/**
 * 
 */
package com.whu.leecode;

/**
 * @author hongliang
 *
 */
public class numTrees {
	
    public int numTrees(int n) {
		
    	if(n<=0)
    		return 0;
    	else if(n==1)
    		return 1;
    	
    	int[] result=new int[n+1];
    	result[0]=0;
    	result[1]=1;
    	
    	for(int i=2;i<=n;i++)
    	{
    		result[i]=2*result[i-1];
    		for(int j=1;j<=i-1;j--)
    		{
    			result[i]=result[j]*result[j-1-i];
    		}
    	}
    	
    	return n;
        
    }
	
}
