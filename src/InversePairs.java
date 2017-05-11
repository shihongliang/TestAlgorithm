/**
 * 
 */

/**
 * @author hongliang
 *
 */
public class InversePairs {
	
	   public static int InversePairs(int [] array) {
		   int[] aa=new int[256];
		   int len=array.length;
		   for(int i=0;i<len;i++)
			   for(int j=i+1;j<len;j++)
			   {
				   if(array[i]>array[j])
				   {
					   for(int t=0;t<256;t++)
					   {
						   aa[t]+=array[i]+array[j];
					   }
				   }
			   }
		   
		   return aa[256]; 
	    }
	   
	   
	   public static void main(String[]args)
	   {
		   int[] array={2,1,7,6,5,4};
		 System.out.println(InversePairs(array));
		   
	   }
	   
}
