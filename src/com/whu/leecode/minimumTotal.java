/**
 * 
 */
package com.whu.leecode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author hongliang
 *
 */
public class minimumTotal {
	
    public int minimumTotal(List<List<Integer>> triangle) {
    	
    	if(triangle==null||triangle.size()<0)
    		return -1;
    	int[][] minSum=new int[triangle.size()][];
    	
    	for(int i=0;i<minSum.length;i++)
    	{
    		minSum[i]=new int[i+1];
    	}
    	
    	//设置第一行
    	minSum[0][0]=triangle.get(0).get(0);
    	
    	for(int i=1;i<minSum.length;i++)
    	{
    		List<Integer> line=triangle.get(0);
    		for(int j=0;j<minSum[i].length;j++)
    		{
    			
    			if(j==0)
    			{
    				minSum[i][0]=line.get(0)+minSum[i-1][0];
    			}
    			else if(i==j)
    			{
    				minSum[i][j]=line.get(j)+minSum[i-1][j-1];
    			}
    			else if(i>j)
    			{
    				minSum[i][j]=line.get(j)+Math.min(minSum[i-1][j-1], minSum[i-1][j]);
    			}
    			
    		}
    	}
    	
    	int min=minSum[minSum.length-1][0];
    	int length=minSum[minSum.length-1].length;
    	for(int i=1;i<length;i++)
    	{
    		if(min>minSum[length-1][i])
    		{
    			min=minSum[length-1][i];
    		}
    	}
    	
    	
    	return min;
        
    }
	
}
