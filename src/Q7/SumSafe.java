package Q7;

public class SumSafe {

	public static int isSumSafe(int[] a) {
		int sum = 0;
		if (a == null || a.length == 0)
			return 0;
		for (int i = 0; i < a.length; i++) {
			sum += a[i];
		}
		for (int j = 0; j < a.length; j++) {
			if (sum == a[j])
				return 0;
		}
		return 1;

	}

	public static void main(String[] args) {
		int[] Number_Array1 = { 5, -5, 0 };
		int[] Number_Array2 = { 5, -2, 1 };
		int[] Number_Array3 = { 3, -2, 2 };

		System.out.println(isSumSafe(Number_Array1));
		System.out.println(isSumSafe(Number_Array2));
		System.out.println(isSumSafe(Number_Array3));
	}

}
