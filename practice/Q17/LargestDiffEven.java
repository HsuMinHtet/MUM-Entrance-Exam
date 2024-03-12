package Q17;

import java.util.*;

public class LargestDiffEven {

	public static int largestDifferenceOfEvens(int[] a) {
		List<Integer> list = new ArrayList<>();
		int big = 0, small = 0;
		if (a.length == 0 || a == null)
			return -1;
		else {
			for (int i = 0; i < a.length; i++) {
				if (a[i] % 2 == 0)
					list.add(a[i]);
			}
			if (list.size() <= 1)
				return -1;
			else {
				big = list.get(0);
				small = list.get(0);
				for (int j = 0; j < list.size(); j++) {
					if (big < list.get(j))
						big = list.get(j);
					if (small > list.get(j))
						small = list.get(j);
				}
				if (big != 0 && small != 0)
					return big - small;
				else
					return 0;
			}
		}
	}

	public static void main(String[] args) {
		int[] a = { 1, 3, 5, 9 };
		int[] b = { 1, 18, 5, 7, 33 };
		int[] c = { 2, 2, 2, 2 };
		int[] d = { 1, 2, 1, 2, 1, 4, 1, 6, 4 };

		System.out.println(largestDifferenceOfEvens(a));
		System.out.println(largestDifferenceOfEvens(b));
		System.out.println(largestDifferenceOfEvens(c));
		System.out.println(largestDifferenceOfEvens(d));
	}

}
