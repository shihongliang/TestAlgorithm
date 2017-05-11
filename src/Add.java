/**
 * 
 */

/**
 * @author hongliang
 *
 */
public class Add {

	public static int Add(int num1, int num2) {
		int sum=0;
		int cacarray=0;
		while(num2!=0)
		{
			sum=num1^num2;
			cacarray=(num1&num2)<<1;
			num1=sum;
			num2 =cacarray;
		}
		
		return num1;
	}

	public static void main(String[] args) {
		System.out.println(Add(1, 2));
	}

}
