package Q6;

public class ConvertToBase10 {

	public static int convertToBase10(int[] a, int base) {
		int result = 0;
		int n_base = 1;
		int n;
		if (1 == isLegalNumber(a, base)) {
			for (int i = 0; i < a.length; i++) {
				n = (a.length - 1) - i;
				if (n == 0) {
					n_base=1;
				} else {
					do {
						n_base *= base;
						n--;
					} while (n > 0);
				}
				result += a[i] * n_base;
				n_base = 1;
			}

			return result;
		}
		return -1;
	}

	public static int isLegalNumber(int[] a, int n) {
		for (int i = 0; i < a.length; i++) {
			if (a[i] > n) {
				return 0;
			}
		}
		return 1;
	}

	public static void main(String[] args) {
		int[] Number_Array1 = { 1, 0, 1, 1 };
		int[] Number_Array2 = { 1, 1, 2 };
		int[] Number_Array3 = { 3, 2, 5 };
		int[] Number_Array4 = { 3, 2, 1 };
		int[] Number_Array5 = { 3, 7, 1 };

		System.out.println(convertToBase10(Number_Array1, 2));
		System.out.println(convertToBase10(Number_Array2, 3));
		System.out.println(convertToBase10(Number_Array3, 8));
		System.out.println(convertToBase10(Number_Array4, 4));
		System.out.println(convertToBase10(Number_Array5, 6));

	}

}
