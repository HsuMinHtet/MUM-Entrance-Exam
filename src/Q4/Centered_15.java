package Q4;

public class Centered_15 {

	public static int isCentered15(int[] a) {
		int center = a.length / 2;
		int sum = a[center];
		int j = 1;
		if (sum == 15)
			return 1;
		else if (a.length % 2 == 0) {
			if ((sum + a[center - 1]) == 15)
				return 1;
			return 0;
		} else {
			for (int i = center - 1; i >= 0; i--) {
				sum += a[i] + a[i + (2 * j)];
				j++;
				if (sum == 15)
					return 1;
			}
			return 0;
		}
	}

	public static void main(String[] args) {
		int[] Number_Array1 = { 3, 2, 10, 4, 1, 6, 9 };
		int[] Number_Array2 = { 2, 10, 4, 1, 6, 9 };
		int[] Number_Array3 = { 3, 2, 10, 4, 1, 6 };
		int[] Number_Array4 = { 1, 1, 8, 3, 1, 1 };
		int[] Number_Array5 = { 9, 15, 6 };
		int[] Number_Array6 = { 1, 1, 2, 2, 1, 1 };
		int[] Number_Array7 = { 1, 1, 15, -1, -1 };

		System.out.println("Result-1 :" + isCentered15(Number_Array1));
		System.out.println("Result-2 :" + isCentered15(Number_Array2));
		System.out.println("Result-3 :" + isCentered15(Number_Array3));
		System.out.println("Result-4 :" + isCentered15(Number_Array4));
		System.out.println("Result-5 :" + isCentered15(Number_Array5));
		System.out.println("Result-6 :" + isCentered15(Number_Array6));
		System.out.println("Result-7 :" + isCentered15(Number_Array7));

	}

}
