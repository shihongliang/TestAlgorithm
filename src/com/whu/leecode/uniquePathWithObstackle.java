/**
 * 
 */
package com.whu.leecode;

/**
 * @author hongliang
 *
 */
public class uniquePathWithObstackle {
	
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
		
    	if(obstacleGrid==null||obstacleGrid.length<1||obstacleGrid[0].length<1||obstacleGrid[0][0]==1||obstacleGrid[obstacleGrid.length - 1][obstacleGrid[0].length - 1] == 1)
    		return 0;
    	int rows=obstacleGrid.length;
    	int cols=obstacleGrid[0].length;
    	int[][] result=new int[rows][cols];
    	
    	for(int i=0;i<rows;i++)
    	{
    		result[i][0]=obstacleGrid[i][0]==0?0:obstacleGrid[i-1][0];
    	}
    	
    	for(int i=0;i<cols;i++)
    	{
    		result[0][i]=obstacleGrid[0][i]==0?0:obstacleGrid[0][i-1];
    	}
    	
    	for(int i=1;i<rows;i++)
    	{
    		for(int j=1;j<cols;j++)
    		{
    			result[i][j]=obstacleGrid[i][j]==0?0:obstacleGrid[i-1][j-1];
    		}
    	}
    	
    	
    	
    	return obstacleGrid[rows-1][cols-1];
        
    }

}
