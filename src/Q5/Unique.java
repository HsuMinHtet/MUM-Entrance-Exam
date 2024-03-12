package Q5;

public class Unique {

	public static int isNUnique(int[] a, int n) {
		int count = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if ((a[i] + a[j]) == n)
					count++;
			}
		}
		if (count == 1)
			return 1;
		else
			return 0;
	}

	public static void main(String[] args) {
		int[] Number_Array1 = { 7, 3, 3, 2, 4 };
		int[] Number_Array2 = { 1 };
		int[] Number_Array3 = { 2, 7, 3, 4 };
		int[] Number_Array4 = { 2, 3, 3, 7 };

		System.out.println(isNUnique(Number_Array1, 6));
		System.out.println(isNUnique(Number_Array1, 10));
		System.out.println(isNUnique(Number_Array1, 11));
		System.out.println(isNUnique(Number_Array1, 8));
		System.out.println(isNUnique(Number_Array1, 4));
		System.out.println(isNUnique(Number_Array2, 0));
		System.out.println(isNUnique(Number_Array3, 5));
		System.out.println(isNUnique(Number_Array4, 5));

	}

}
