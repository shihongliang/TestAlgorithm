import java.util.Arrays;

/**
 * 
 */

/**
 * @author hongliang
 *
 */
public class isContinuous {
	public boolean isContinuous(int[] numbers) {
		int count = 0;
		if (numbers.length != 5)
			return false;
		Arrays.sort(numbers);
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] == 0)
				count++;
		}
		if (count > 1)
			return false;

		if (numbers[numbers.length - 1] - numbers[0] != 4)
			return false;
		return true;
	}

	public static void main(String[] args) {
		int[] numbers = { 1, 3, 2,6, 0};
		isContinuous c = new isContinuous();
		boolean f = c.isContinuous(numbers);
		System.out.println(f);
	}
}
