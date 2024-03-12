package Q9;

import java.util.*;

public class Trivalent {

	public static int isTrivalent(int[] a) {
		int j;
		int same_Count = 0;
		List<Integer> list = new ArrayList<>();
		if (a == null || a.length == 0) {
			return 0;
		} else {
			list.add(a[0]);
			for (int i = 1; i < a.length; i++) {
				j = list.size();
				while (j != 0) {
					if (list.get(j - 1) == a[i])
						same_Count++;
					j--;
				}
				if (same_Count == 0) {
					list.add(a[i]);
				}
				same_Count = 0;
			}
			if (list.size() == 3) {
				return 1;
			}
			return 0;
		}
	}

	public static void main(String[] args) {
		int[] Number_Array1 = { -1, 0, 1, 0, 0, 0 };
		int[] Number_Array2 = {};
		int[] Number_Array3 = { 2147483647, -1, -1, -2147483648 };
		int[] Number_Array4 = { 22, 19, 10, 10, 19, 22, 22, 10 };
		int[] Number_Array5 = { 1, 2, 2, 2, 2, 2, 2 };

		System.out.println(isTrivalent(Number_Array1));
		System.out.println(isTrivalent(Number_Array2));
		System.out.println(isTrivalent(Number_Array3));
		System.out.println(isTrivalent(Number_Array4));
		System.out.println(isTrivalent(Number_Array5));

	}

}
