package Q2;

public class GuthrieSequence {
	public static int isGuthrieSequence(int[] a) {
		if (a[a.length - 1] == 1) {
			for (int i = 1; i < a.length - 1; i++) {
				// odd
				if (a[i] % 2 != 0 && a[i + 1] != (a[i] * 3) + 1)
					return 0;
				// even
				else if (a[i] % 2 == 0 && a[i + 1] != a[i] / 2)
					return 0;
			}
			return 1;
		}
		return 0;
	}

	public static void main(String[] args) {
		int[] Number_Array1 = { 8, 4, 2, 1 };
		int[] Number_Array2 = { 8, 17, 4, 1 };
		int[] Number_Array3 = { 8, 4, 1 };
		int[] Number_Array4 = { 8, 4, 2 };
		int[] Number_Array5 = { 7, 22, 11, 34, 17, 52, 26, 13, 40, 20, 10, 5, 16, 8, 4, 2, 1 };

		System.out.println("Result1	: " + isGuthrieSequence(Number_Array1));
		System.out.println("Result2	: " + isGuthrieSequence(Number_Array2));
		System.out.println("Result3	: " + isGuthrieSequence(Number_Array3));
		System.out.println("Result4	: " + isGuthrieSequence(Number_Array4));
		System.out.println("Result5	: " + isGuthrieSequence(Number_Array5));

	}

}
