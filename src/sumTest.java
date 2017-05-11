import java.util.Scanner;

/**
 * 
 */

/**
 * @author hongliang
 *
 */
public class sumTest {
	
	public static Integer sum(int num)
	{
		String s=Integer.toString(num);
		int len=s.length();
		int sum=0;
		for(int i=0;i<len;i++)
		{
			sum+=s.charAt(i)-48;
		}
				System.out.println(sum); 
				return sum;
	}
	public static void main(String[]args)
	{
		Scanner in=new Scanner(System.in);
		int num=in.nextInt();
		sum(num);
		
	}
	
}
