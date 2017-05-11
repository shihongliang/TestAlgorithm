/**
 * 
 */

/**
 * @author hongliang
 *
 */
public class hasPath {
	
	public boolean  hasPath(char []matrix, int rows, int cols, char[] str) {
		boolean flag=false;
		//将一位数组变为二维数组
		char[][] newMatrix=new char[rows][cols];
		for(int i=0;i<matrix.length;i++)
		{
			newMatrix[i/cols][i%cols]=matrix[i];
			
		}
		
		int[][] flagMatrix=new int[rows][cols];
		for(int i=0;i<flagMatrix.length;i++)
		{
			for(int j=0;j<flagMatrix[0].length;j++)
			{
				flagMatrix[i][j]=0;
			}
		}
		String newStr=String.valueOf(str);
		//对二位数组的一个元素
		for(int i=0;i<newMatrix.length;i++)
		{
			for(int j=0;j<newMatrix[0].length;j++)
			{
				if(newMatrix[i][j]==str[0])
				{
					flagMatrix[i][j]=1;
					if(newStr.length()==1)
					{
						flag=true;
					}
					else
					{
						flag=this.getResult(newMatrix,flagMatrix,i,j,newStr.substring(1));
						
					}
				}
			}
		}
		return flag;
		
		
	}

	/**
	 * @param newMatrix
	 * @param flagMatrix
	 * @param i
	 * @param j
	 * @param substring
	 * @return
	 */
	private boolean getResult(char[][] newMatrix, int[][] flagMatrix, int aIndex, int bIndex, String newStr) {
		char temp=newStr.charAt(0);
		if(newStr.length()==1)
		{
		    //左
            if (bIndex > 0 && flagMatrix[aIndex][bIndex - 1] == 0 && newMatrix[aIndex][bIndex - 1] == temp) {
                return true;
            }
            // 上
            if (aIndex > 0 && flagMatrix[aIndex - 1][bIndex] == 0 && newMatrix[aIndex - 1][bIndex] == temp) {
                return true;
            }
            // 右
            if (bIndex < (flagMatrix[0].length - 1) && flagMatrix[aIndex][bIndex + 1] == 0 && newMatrix[aIndex][bIndex + 1] == temp) {
                return true;
            }
            // 下
            if (aIndex < (flagMatrix.length - 1) && flagMatrix[aIndex + 1][bIndex] == 0 && newMatrix[aIndex + 1][bIndex] == temp) {
                return true;
            }

			
		}
		
	     boolean flag = false;
         if (bIndex > 0 && flagMatrix[aIndex][bIndex - 1] == 0 && newMatrix[aIndex][bIndex - 1] == temp) {
             flagMatrix[aIndex][bIndex - 1] = 1;
             flag = this.getResult(newMatrix, flagMatrix, aIndex, bIndex - 1, newStr.substring(1));
         }
         if (aIndex > 0 && flagMatrix[aIndex - 1][bIndex] == 0 && newMatrix[aIndex - 1][bIndex] == temp && flag == false) {
             flagMatrix[aIndex - 1][bIndex] = 1;
             flag = this.getResult(newMatrix, flagMatrix, aIndex - 1, bIndex, newStr.substring(1));
         }
         if (bIndex < (flagMatrix[0].length - 1) && flagMatrix[aIndex][bIndex + 1] == 0 && newMatrix[aIndex][bIndex + 1] == temp && flag == false) {
             flagMatrix[aIndex][bIndex + 1] = 1;
             flag = this.getResult(newMatrix, flagMatrix, aIndex, bIndex + 1, newStr.substring(1));
         }
         if (aIndex < (flagMatrix.length - 1) && flagMatrix[aIndex + 1][bIndex] == 0 && newMatrix[aIndex + 1][bIndex] == temp && flag == false) {
             flagMatrix[aIndex + 1][bIndex] = 1;
             flag = this.getResult(newMatrix, flagMatrix, aIndex + 1, bIndex, newStr.substring(1));
         }

         return flag;
	}
	
}
