import java.util.ArrayList;

/**
 * 
 */

/**
 * @author hongliang
 *
 */
public class TestPermutation {
	
	
    public static void main(String[]args)
    {
    	String str="abc";
    	int len=str.length();
    	String result="";
    	Permutation(str,result,len);
    	
    }

	/**
	 * @param str
	 * @param result
	 * @param len
	 */
	private static void Permutation(String str, String result, int len) {
			
		if(result.length()==len)
		{
			System.out.println(result);
		}
		else
		{
			for(int i=0;i<len;i++)
			{
				if(result.indexOf(str.charAt(i))<0)
				{
					Permutation(str,result+str.charAt(i),str.length());
					
				}
			}
		}
		
	}
    
}
