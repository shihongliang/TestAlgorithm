/**
 * 
 */

/**
 * @author hongliang
 *
 */
public class isNumeric {
	public boolean isNumeric(char[] str) {
		
		if(str.length<=0)
			return false;
		int dem=0;
		int e=0;
		for(int i=0;i<str.length;i++)
		{
			if((str[i]=='+'||str[i]=='-')&&i==0)
			{
				continue;
			}
			else if(str[i]>='0'&&str[i]<=9)
				continue;
			else if(str[i]=='.'&&dem==0)
			{
				dem++;
			}
			else if((str[i]=='e'||str[i]=='E')&&e==0)
			{
				dem++;
				e++;
				if(i+1<str.length&&(str[i+1]=='+'||str[i+1]=='-'))
				{
					dem++;
					e++;
					if(i+1<str.length&&(str[i+1]=='+'||str[i]=='-'))
					{
						i++;
					}
					 if(i+1 == str.length)
		                    return false;
				}
				else
					 return true;
				
			}
	
		}
		
		
		return true;
	}
	
	public static void main(String[]args)
	{
		isNumeric in=new isNumeric();
		char[] str=new char[20];
		String s="1.2";
		str=s.toCharArray();

		System.out.println(in.isNumeric(str));
		
	}
	
	
}
