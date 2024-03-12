package Q13;

import java.util.*;

public class LargestAdjacent {
	public static int largestAdjacentSum(int[] a) {
		List<Integer> list = new ArrayList<>();
		int result = 0;
		if (a == null || a.length < 2) {
			return 0;
		} else {
			for (int i = 0; i < a.length - 1; i++) {
				list.add(a[i] + a[i + 1]);
			}
			if (list.size() != 0)
				result = list.get(0);
			for (int j = 0; j < list.size(); j++) {
				if (result < list.get(j))
					result = list.get(j);
			}
		}
		return result;
	}

	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4 };
		int[] b = { 18, -12, 9, -10 };
		int[] c = { 1, 1, 1, 1, 1, 1 };
		int[] d = { 1, 1, 1, 2, 1, 1 };
		System.out.println(largestAdjacentSum(a));
		System.out.println(largestAdjacentSum(b));
		System.out.println(largestAdjacentSum(c));
		System.out.println(largestAdjacentSum(d));

	}

}
