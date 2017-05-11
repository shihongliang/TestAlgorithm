/**
 * 
 */
package com.whu.leecode;

/**
 * @author hongliang
 *
 */
public class numIslands {
	
	   public int numIslands(char[][] grid) {
		
		   if(grid==null||grid.length==0||grid[0].length==0)
			   return 0;
		   //元素默认值是false
		   boolean[][] visited=new boolean[grid.length][grid[0].length];
		   
		   int result=0;
		   for(int i=0;i<grid.length;i++)
			   for(int j=0;j<grid[0].length;j++)
			   {
				   if(!visited[i][j]&&grid[i][j]=='1')
				   {
					   result++;
					   bfs(grid,visited,i,j);
				   }
			   }
		   
		   return result; 
	    }

	/**
	 * @param grid广度优先搜索
	 * @param visited
	 * @param i
	 * @param j
	 */
	private void bfs(char[][] grid, boolean[][] visited, int row, int col) {
		if(row>=0&&row<grid.length&&col>0&&col<grid[0].length&&!visited[row][col]&&grid[row][col]=='1')
		{
			visited[row][col]=true;
			bfs(grid,visited,row-1,col);
			bfs(grid,visited,row,col+1);
			bfs(grid,visited,row+1,col);
			bfs(grid,visited,row,col-1);
		}
		
		
	}
	
}
