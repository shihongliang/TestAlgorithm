import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * 
 */

/**
 * @author hongliang
 *
 */
public class PrintMinNumber222 {

	public String PrintMinNumber(int[] numbers) {

		int len = numbers.length;
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < len; i++) {
			list.add(numbers[i]);
		}

		Collections.sort(list, new Comparator<Integer>() {

			@Override
			public int compare(Integer str1, Integer str2) {

				String s1 = str1 + "" + str2;
				String s2 = str2 + "" + str1;
				return s1.compareTo(s2);
			}

		});
		String s="";
		for(int j:list)
		{
			s+=j;
		}
		

		return s;
	}

}
