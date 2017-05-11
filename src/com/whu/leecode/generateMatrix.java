/**
 * 
 */
package com.whu.leecode;

/**
 * @author hongliang
 *
 */
public class generateMatrix {
	
    public int[][] generateMatrix(int n) {
		
    	int[][] res=new int[n][n];
    	
     	int level=(int) Math.ceil(n/2);
     	int num=1;
     	
     	for(int i=0;i<level;i++)
     	{
     		
     		for(int j=0;j<n-i;j++)
     		{
     			res[i][j]=num++;
     		}
     		
     		for(int j=i+1;j<n-i;j++)
     		{
     			res[j][n-i-1]=num++;
     		}
     		
     		for(int j=n-i-2;j>=i;j--)
     		{
     			res[n-i-1][j]=num++;
     		}
     		
     		for(int j=n-i-2;j>=i+1;j--)
     		{
     			res[j][i]=num++;
     		}
     		
     	}
     	
    	 
    	
    	
    	
    	return res;
        
    }

}
