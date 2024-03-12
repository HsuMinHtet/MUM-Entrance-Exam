package Q_10;

import java.util.*;

/**
 * 2 must occurs <2 times, only 2 for one times 3 must occurs <3 times, 3 should
 * occur 2 or 1 times 
 * Array need to be ascending order
 */
public class SequentialBounded {

	public static int isSequentiallyBounded(int[] a) {
		int count = 0;
		boolean exist = false;
		List<Integer> list = new ArrayList<>();
		// int total_Count = 0;
		if (a == null || a.length == 0)
			return 1;
		else {
			for (int i = 0; i < a.length; i++) {
				if( i<a.length-1 && a[i]>a[i+1]) {
					return 0;
				}
				if (list.size() == 0)
					list.add(a[i]);
				else {
					for (int x = 0; x < list.size(); x++) {
						if (a[i] == list.get(x)) {
							exist = true;
						}
					}
					if (exist == false)
						list.add(a[i]);
				}
				if (exist == false) {

					if (a[i] <= 1)
						return 0;
					else {
						count = 0;
						for (int j = 0; j < a.length; j++) {
							if (a[i] == a[j]) {
								count++;
							}
						}
						if (count >= a[i])
							return 0;

					}
				}
			}
			return 1;
		}
	}

	public static void main(String[] args) {
		int[] Number_Array1 = { 0, 1 };
		int[] Number_Array2 = { -1, 2 };
		int[] Number_Array3 = {};
		int[] Number_Array4 = { 5, 5, 5, 5 };
		int[] Number_Array5 = { 5, 5, 5, 2, 5 };
		int[] Number_Array6 = { 2, 3, 3, 3, 3 };
		int[] Number_Array7 = { 1, 2, 3 };
		int[] Number_Array8 = { 2, 3, 3, 99, 99, 99, 99, 99 };

		System.out.println(isSequentiallyBounded(Number_Array1));
		System.out.println(isSequentiallyBounded(Number_Array2));
		System.out.println(isSequentiallyBounded(Number_Array3));
		System.out.println(isSequentiallyBounded(Number_Array4));
		System.out.println(isSequentiallyBounded(Number_Array5));
		System.out.println(isSequentiallyBounded(Number_Array6));
		System.out.println(isSequentiallyBounded(Number_Array7));
		System.out.println(isSequentiallyBounded(Number_Array8));
	}

}
