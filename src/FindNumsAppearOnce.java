/**
 * 
 */

/**
 * @author hongliang
 *
 */
public class FindNumsAppearOnce {
	
	  public void FindNumsAppearOnce(int [] array,int num1[] , int num2[]) {
		  
		  int len=array.length;
		  
		  for(int i=0;i<len;i++)
		  {
			  for(int j=1;j<i;j++)
			  {
				  if((array[i]&array[j])==0)
				  {
					  
				  }
			  }
		  }
		  
	  }
	
}
