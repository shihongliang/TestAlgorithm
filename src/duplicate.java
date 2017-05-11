/**
 * 
 */

/**
 * @author hongliang
 *
 */
public class duplicate {

	public boolean duplicate(int[] arr) {

		if (arr.length < 0 || arr == null)
			return false;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < 0 || arr.length <= 0)
				return false;

		}

		for (int i = 0; i < arr.length; i++) {

			while (arr[i] != i) {
				if (arr[i] == arr[arr[i]]) {
					System.out.println(arr[i]);
					return true;
				} else {
					int temp = arr[i];
					arr[i] = arr[temp];
					arr[temp] = temp;
				}
			}

		}

		return false;

	}

	public static void main(String[] args) {
		int[] arr = { 2, 3, 1, 0, 2, 5, 3 };
		duplicate d = new duplicate();
		System.out.println(d.duplicate(arr));
	}

}
