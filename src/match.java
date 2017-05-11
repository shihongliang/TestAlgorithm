/**
 * 
 */

/**
 * @author hongliang
 *
 */
public class match {

	public boolean match(char[] str, char[] pattern) {
	
		int i=0;
		while(i<str.length)
		{
			if(str[i]==pattern[i])
			{
				i++;
			}
			else if(str[i]!=pattern[i])
			{
				if(".".equals(str[i])||".".equals(pattern[i]))
				{
					i++;
				}
				else
				{
					return false;
				}
			}
		}
			
		return true;
	}
	
	public static void main(String[]args)
	{
		match m=new match();
		char[] str={'a','a','a'};
		char[] pattern={'a','.','a'};
		System.out.println(m.match(str, pattern));
		
	}
	

}
