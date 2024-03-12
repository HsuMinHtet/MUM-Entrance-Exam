package Q1;

import java.util.*;

public class Inertial_3 {
	public static int isIntertial(int[] a) {
		int max_even = 0;
		List<Integer> odd = new ArrayList<Integer>();
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 != 0) {
				odd.add(a[i]);
			}
			if (a[i] > max_even) {
				max_even = a[i];
			}
		}
		if (odd.size() == 0 || max_even % 2 != 0)
			return 0;

		for (int x = 0; x < odd.size(); x++) {
			for (int y = 0; y < a.length; y++) {
				if (a[y] % 2 == 0) {
					if (odd.get(x) < a[y] && a[y] != max_even)
						return 0;
				}
			}
		}
		return 1;
	}

	public static void main(String[] args) {
		int[] Number_Array1 = { 1 };
		int[] Number_Array2 = { 2 };
		int[] Number_Array3 = { 1, 2, 3, 4 };
		int[] Number_Array4 = { 1, 1, 1, 1, 1, 1, 2 };
		int[] Number_Array5 = { 2, 12, 4, 6, 8, 11 };
		int[] Number_Array6 = { 2, 12, 12, 4, 6, 8, 11 };
		int[] Number_Array7 = { -2, -4, -6, -8, -11 };
		int[] Number_Array8 = { 2, 3, 5, 7 };
		int[] Number_Array9 = { 2, 4, 6, 8, 10 };

		System.out.println("Result1	: " + isIntertial(Number_Array1));
		System.out.println("Result2	: " + isIntertial(Number_Array2));
		System.out.println("Result3	: " + isIntertial(Number_Array3));
		System.out.println("Result4	: " + isIntertial(Number_Array4));
		System.out.println("Result5	: " + isIntertial(Number_Array5));
		System.out.println("Result6	: " + isIntertial(Number_Array6));
		System.out.println("Result7	: " + isIntertial(Number_Array7));
		System.out.println("Result8	: " + isIntertial(Number_Array8));
		System.out.println("Result9	: " + isIntertial(Number_Array9));

	}
}
