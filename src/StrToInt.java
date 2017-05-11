/**
 * 
 */

/**
 * @author hongliang
 *
 */
public class StrToInt {
	public static int StrToInt(String str) {
	
		int len=str.length();
		char t=0;
		int s=0;
		
		if(str==null||str.length()==0)
			return s;
		
		
		
		if(str.charAt(0)=='-'||str.charAt(0)=='+')
		{
			for(int i=1;i<len;i++)
			{
				if(str.charAt(i)<48||str.charAt(i)>57)
					return 0;
				t=str.charAt(i);
				s+=t-'0';

				
				if(i!=len-1)
					s*=10;
			
			}
		}
		else
		{
			for(int i=0;i<len;i++)
			{
				if(str.charAt(i)<48||str.charAt(i)>57)
					return 0;
				t=str.charAt(i);
				s+=t-'0';

				
				if(i!=len-1)
					s*=10;
			
			}
		}
		
		if(str.charAt(0)=='-')
		{
			s=-s;
		}
		
		System.out.println(s);
		return s;
	}
	
	public static void main(String[]args)
	{
		String str="+123";
		System.out.println(StrToInt(str));
		
	}
	
}
