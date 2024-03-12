package Q15;

import java.util.Arrays;

public class IntegerBasedRound {
	public static int[] doIntegerBasedRounding(int[] a, int n) {
		int[] b = new int[a.length];
		if (n <= 0)
			return a;
		for (int i = 0; i < a.length; i++) {
			if (a[i] <= 0)
				b[i] = a[i];
			else if (a[i] % n >= n / 2 && n % 2 == 0)
				b[i] = up(a[i], n);
			else if (a[i] % n > n / 2 && n % 2 != 0)
				b[i] = up(a[i], n);
			else if (a[i] % n == 0)
				b[i] = (a[i] / n) * n;
			else
				b[i] = down(a[i], n);
		}
		return b;
	}

	public static int up(int a, int n) {
		int compare = n;
		int i = 2;
		if (a < n)
			return n;
		else {
			while (a > compare) {
				compare = n * i;
				i++;
			}
			return compare;
		}
	}

	public static int down(int b, int n) {
		int compare = n;
		int i = 2;
		if (b < n)
			return 0;
		else {
			while (b > compare) {
				compare = n * i;
				i++;
			}
			return compare / (i - 1);
		}
	}

	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 5 };
		int[] b = { -1, -2, -3, -4, -5 };
		int[] c = { -18, 1, 2, 3, 4, 5 };

		System.out.println(Arrays.toString(doIntegerBasedRounding(a, 2)));
		System.out.println(Arrays.toString(doIntegerBasedRounding(a, 3)));
		System.out.println(Arrays.toString(doIntegerBasedRounding(a, -3)));
		System.out.println(Arrays.toString(doIntegerBasedRounding(b, 3)));
		System.out.println(Arrays.toString(doIntegerBasedRounding(c, 4)));
		System.out.println(Arrays.toString(doIntegerBasedRounding(a, 5)));
		System.out.println(Arrays.toString(doIntegerBasedRounding(a, 100)));

	}

}
