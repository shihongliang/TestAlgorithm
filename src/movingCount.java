/**
 * 
 */

/**
 * @author hongliang
 *
 */
public class movingCount {
    public int movingCount(int threshold, int rows, int cols)
    {
        boolean[][] visited=new boolean[rows][cols];
        return movingCountCore(threshold,rows,cols,0,0,visited);
        
    }

	/**
	 * @param threshold
	 * @param rows
	 * @param cols
	 * @param i
	 * @param j
	 * @param visited
	 * @return
	 */
	private int movingCountCore(int threshold, int rows, int cols, int i, int j, boolean[][] visited) {
		int count=0;
		if(i<=0||i>rows||j<0||j>=cols||numberIndexCount(i)+numberIndexCount(j)>threshold||visited[i][j])
			return 0;
		visited[i][j]=true;
		count = 1 + movingCountCore(threshold, rows, cols, i - 1, j, visited)
        + movingCountCore(threshold, rows, cols, i + 1, j, visited)
        + movingCountCore(threshold, rows, cols, i, j - 1, visited)
        + movingCountCore(threshold, rows, cols, i, j + 1, visited);
		return count;
	}

	/**
	 * @param i
	 * @return
	 */
	private int numberIndexCount(int number) {
		int sum=0;
		while(number>0)
		{
			sum+=number%10;
			number/=10;
		}
		return sum;
	}
	
	public static void main(String[]args)
	{
		int sum=new movingCount().movingCount(5, 10, 10);
		System.out.println(sum);
		
	}
	
}
