/**
 * 
 */

/**
 * @author hongliang
 *
 */
public class LastRemaining_Solution {
	   public static int LastRemaining_Solution(int n, int m) {
	
		   if(n<1||m<1)
			   return -1;
		   int[] array=new int[n];
		   int i=-1,step=0;
		   int count=n;
		   while(count>0)
		   {
			   i++;
			   if(i>=n)
				   i=0;
			   if(array[i]==-1)
				   continue;
			   
			   step++;
			   if(step==m)
			   {
				   array[i]=-1;
				   step=0;
				   count--;
			   }
			   
		   }
		   return i;
		
	   }
}
