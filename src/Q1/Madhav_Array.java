package Q1;

public class Madhav_Array {
	public static int isMadhavArray(int[] a) {
		int value = 0;
		int times = 0;
		int z=0;
		boolean match = false;
		for (int i = 2; i < a.length; i++) {
			if (a.length == (i * (i + 1) / 2))
				times = i;
		}
		if (times != 0) {
			for (int j = 1; j <= times - 1; j++) {
				z = (j * (j + 1) / 2);
				for (int x = z; x <= z + j; x++) {
					value += a[x];
				}
				if (a[0] == value) {
					value = 0;
					match = true;
				} else
					match = false;
			}
		}
		if (match == false)
			return 0;
		else
			return 1;
	}

	public static void main(String[] args) {
		/*
		 * int i = 1; int j = 2; i+=j++; System.out.println("I :" +i);
		 */
		int[] Number_Array1 = { 2, 1, 1 };
		int[] Number_Array2 = { 2, 1, 1, 4, -1, -1 };
		int[] Number_Array3 = { 6, 2, 4, 2, 2, 2, 1, 5, 0, 0 };
		int[] Number_Array4 = { 18, 9, 10, 6, 6, 6 };
		int[] Number_Array5 = { -6, -3, -3, 8, -5, -4 };
		int[] Number_Array6 = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, -2, -1 };
		int[] Number_Array7 = { 3, 1, 2, 3, 0 };

		System.out.println("Result1	: " + isMadhavArray(Number_Array1));
		System.out.println("Result2	: " + isMadhavArray(Number_Array2));
		System.out.println("Result3	: " + isMadhavArray(Number_Array3));
		System.out.println("Result4	: " + isMadhavArray(Number_Array4));
		System.out.println("Result5	: " + isMadhavArray(Number_Array5));
		System.out.println("Result6	: " + isMadhavArray(Number_Array6));
		System.out.println("Result7	: " + isMadhavArray(Number_Array7));

	}
}
