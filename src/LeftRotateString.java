/**
 * 
 */

/**
 * @author hongliang
 *
 */
public class LeftRotateString {
    public static String LeftRotateString(String str,int n) {
		int len=str.length();
		String s="";
		String s2="";
		if(n<=0)
			return str;
		else if(n<=len)
		{
			for(int i=0;i<n;i++)
			{
				s+=str.charAt(i);
			}
			s2+=str.substring(n, len)+s;
		}
    	
    	return s2;
        
    }
    
    public static void main(String[]args)
    {
    	String S="abcXYZdef";
    System.out.println(LeftRotateString(S,9));
    }
    
}
