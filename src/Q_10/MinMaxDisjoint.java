package Q_10;

/**
 * min and max, should only one for each and not duplicate not adjacent if so,
 * return 1 for array size 1 or 0, return 0
 *
 */
public class MinMaxDisjoint {

	public static int isMinMaxDisjoint(int[] a) {
		int min, max;
		int min_count = 0;
		int max_count = 0;

		if (a == null || a.length == 0 || a.length <= 2)
			return 0;

		else {
			min = a[0];
			max = a[0];
			for (int i = 0; i < a.length; i++) {
				if (max < a[i])
					max = a[i];
				if (min > a[i])
					min = a[i];
			}
			for (int j = 0; j < a.length; j++) {
				if (min == a[j]) {
					min_count++;
					if (min_count > 1)
						return 0;
				}
				if (max == a[j]) {
					max_count++;
					if (max_count > 1)
						return 0;
				}
				if (j < a.length - 1) {
					if ((a[j] == min && a[j + 1] == max) || (a[j] == max && a[j + 1] == min)) {
						return 0;
					}
				}

			}

		}
		return 1;
	}

	public static void main(String[] args) {
		int[] Number_Array1 = { 18, -13, 4, 0 };
		int[] Number_Array2 = { 9, 0, 5, 9 };
		int[] Number_Array3 = { 0, 5, 18, 0, 9 };
		int[] Number_Array4 = { 7, 7, 7, 7 };
		int[] Number_Array5 = { 5, 4, 3, 2, 1 };
		int[] Number_Array6 = { 1, 2 };
		int[] Number_Array7 = {};

		System.out.println(isMinMaxDisjoint(Number_Array1));
		System.out.println(isMinMaxDisjoint(Number_Array2));
		System.out.println(isMinMaxDisjoint(Number_Array3));
		System.out.println(isMinMaxDisjoint(Number_Array4));
		System.out.println(isMinMaxDisjoint(Number_Array5));
		System.out.println(isMinMaxDisjoint(Number_Array6));
		System.out.println(isMinMaxDisjoint(Number_Array7));

	}

}
