/**
 * 
 */
package com.whu.leecode;

/**
 * @author hongliang
 *
 */
public class setZeroes {
	
    public void setZeroes(int[][] matrix) {
     
    	//第一行被设置的flag
    	boolean rowFlag=false;
    	boolean colFlag=false;
    	
    	
    	for(int i=0;i<matrix.length;i++)
    	{
    		for(int j=0;j<matrix[0].length;j++)
    		{
    			if(matrix[i][j]==0)
    			{
    				if(i==0)
    					rowFlag=true;
    				if(j==0)
    					colFlag=true;
    				
    				matrix[i][0]=0;
    				matrix[0][j]=0;
    			}
    		}
    	}
    	
    	
    	for(int i=1;i<matrix.length;i++)
    	{
    		for(int j=1;j<matrix.length;j++)
    		{
    			if(matrix[i][0]==0||matrix[0][j]==0)
    				matrix[i][j]=0;
    		}
    	}
    	
    	if(rowFlag)
    	{
    		for(int j=0;j<matrix.length;j++)
    		{
    			matrix[0][j]=0;
    		}
    	}
    	
    	if(colFlag)
    	{
    		for(int j=0;j<matrix.length;j++)
    		{
    			matrix[j][0]=0;
    		}
    	}
    	
    }
	
}
