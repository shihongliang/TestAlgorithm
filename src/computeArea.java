/**
 * 
 */

/**
 * @author hongliang
 *
 */
public class computeArea {
	
	  public int computeArea(int A, int B, int C, int D, int E, int F, int G, int H) {
		  
		  long area=(long)(C-A)*(D-B)+(long)(G-E)*(H-F);
		  long width=Math.max((long)Math.min(C, G)-(long)Math.max(A, E),0);
		  long heigh=Math.max((long)Math.min(D, H)-(long)Math.max(B, F),0);
		  
		  
		  return (int) (area-heigh*width);
	        
	  }
	
}
