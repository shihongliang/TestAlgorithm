/**
 * 
 */

/**
 * @author hongliang
 *
 */
public class multiply {
	  public int[] multiply(int[] A) {
		 int[] B=new int[A.length];
		 
		 
		 B[0]=A[0];
		 
		 for(int i=1;i<A.length;i++)
		 {
			 B[i]=B[i-1]*A[i];
			 
		 }
		 
		 int tmp=1;
		 
		 for(int i=A.length-2;i>=0;i--)
		 {
			tmp*=A[i+1];
			B[i]*=tmp;
		 }
		 
		System.out.println(B);
		  
		return B;
     }
	 
	 
	  public static void main(String[]args)
	  {
		  multiply m=new multiply();
	
		  
		
	  }
	  
	 
}
