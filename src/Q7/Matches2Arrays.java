package Q7;

public class Matches2Arrays {

	public static int matches(int[] a, int[] p) {
		int times = 0;
		int sum = 0;
		int start = 0;
		for (int i = 0; i < p.length; i++) {
			if (p[i] != 0) {
				times = p[i];
				if (p[i] < 0)
					times = p[i] * (-1);
				sum += times;
				for (int j = start; j < sum; j++) {
					if (p[i] > 0 && a[j] > 0)
						continue;
					else if (p[i] < 0 && a[j] < 0)
						continue;
					else
						return 0;
				}
				start = sum+1;
			} else
				return 0;
		}
		if (sum == a.length)
			return 1;
		else
			return 0;
	}

	public static void main(String[] args) {
		int[] Number_Array1 = { 1, 2, 3, -5, -5, 2, 3, 18 };
		int[] Number_Array2 = { 3, -2, 3 };
		int[] Number_Array3 = { 2, 1, -2, 3 };
		int[] Number_Array4 = { 1, 2, -1, -1, 1, 2 };
		int[] Number_Array5 = { 8 };

		System.out.println(matches(Number_Array1, Number_Array2));
		System.out.println(matches(Number_Array1, Number_Array3));
		System.out.println(matches(Number_Array1, Number_Array4));
		System.out.println(matches(Number_Array1, Number_Array5));
		System.out.println(matches(Number_Array1, Number_Array5));

	}

}
