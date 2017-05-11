/**
 * 
 */

/**
 * @author hongliang
 *
 */
public class TestNumsum {
	
    public static int NumberOf1Between1AndN_Solution(int n) {
        int count=0;
        String s=Integer.toString(n);
        int len=s.length();
    	
        for(int i=0;i<len;i++)
        {
        	if(s.charAt(i)==1)
        	{
        		for(int j=0;j<=s.charAt(i)-'0';j++)
        		{
        			if(j==1)
        			{
        				count+=2;
        			}
        			else
        			{
        				count++;
        			}
        		}
        	}
        }
        System.out.println(count);
    	return count;
    }
    
    public static void main(String[]args)
    {
    	int num=13;
    	 NumberOf1Between1AndN_Solution(num);
    }
    
}
