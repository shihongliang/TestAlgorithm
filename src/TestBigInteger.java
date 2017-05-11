import java.math.BigInteger;

/**
 * 
 */

/**
 * @author hongliang
 *
 */
public class TestBigInteger {
	
	public static void main(String[]args)
	{
		System.out.println(change("3",10,2));
	}

	/**
	 * @param string
	 * @param i
	 * @param j
	 * @return
	 */
	private static String change(String num, int from, int to) {
	
		return new BigInteger(num,from).toString(to);
	}
	
}
