/**
 * 
 */
package com.whu.leecode;

/**
 * @author hongliang
 *
 */
public class exist {
	
    public boolean exist(char[][] board, String word) {
		//[注意我们假定输入的参数是合法的]
    	boolean[][] visited=new boolean[board.length][board[0].length];
    	
    	//以每一个举证为起点进行搜索，找到一个路径就停止
    	for(int i=0;i<board.length;i++)
    	{
    		for(int j=0;j<board[0].length;j++)
    		{
    			if(search(board,visited,i,j,word,new int[]{0}))
    			{
    				return true;
    			}
    		}
    	}
    	
    	
    	
    	return false;
        
    }

	/**
	 * @param board
	 * @param visited
	 * @param i
	 * @param j
	 * @param ks
	 * @return
	 */
	private boolean search(char[][] board, boolean[][] visited, int row, int col,String word, int[] idx) {
		
		//如果搜索的位置等于字符串的长度，说明已经找到匹配了
		if(idx[0]==word.length())
		{
			return true;
		}
		
		boolean hasPath=false;
		if(check(board,visited,row,col,word,idx[0]))
		{
			visited[row][col]=true;
			idx[0]++;
			hasPath=search(board,visited,row-1,col,word,idx)||search(board,visited,row,col+1,word,idx)||search(board,visited,row+1,col,word,idx)
					||search(board,visited,row+1,col,word,idx)||search(board,visited,row,col-1,word,idx);
			if(!hasPath)
			{
				visited[row][col]=false;
				idx[0]--;
			}
			
		}
		
		return false;
	}

	/**判定访问位置是否合法的
	 * @param board
	 * @param visited
	 * @param row
	 * @param col
	 * @param word
	 * @param i
	 * @return
	 */
	private boolean check(char[][] board, boolean[][] visited, int row, int col, String word, int idx) {
		
		return row>=0&&row<board.length
				&&col>=0&&col<board[0].length
				&&!visited[row][col]&&board[row][col]==word.charAt(idx)	;
			
	}
	
}
