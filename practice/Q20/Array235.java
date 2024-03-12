package Q20;

public class Array235 {

	public static int is234Array(int[] a) {
		int twoCount = 0, threeCount = 0, fiveCount = 0, nonDivCount = 0;
		int total = 0;
		if (a.length == 0 || a == null)
			return 1;
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 == 0)
				twoCount++;
			if (a[i] % 3 == 0)
				threeCount++;
			if (a[i] % 5 == 0)
				fiveCount++;
			if (a[i] % 2 != 0 && a[i] % 3 != 0 && a[i] % 5 != 0)
				nonDivCount++;
		}
		total = twoCount + threeCount + fiveCount + nonDivCount;
		if (total == a.length)
			return 1;
		else
			return 0;
	}

	public static void main(String[] args) {
		int[] a = { 2, 3, 5, 7, 11 };
		int[] b = { 2, 3, 6, 7, 11 };
		int[] c = { 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int[] d = { 2, 4, 8, 16, 32 };
		int[] e = { 3, 9, 27, 7, 1, 1, 1, 1, 1 };
		int[] f = { 7, 11, 77, 49 };
		int[] g = { 2 };
		int[] h = {};

		System.out.println(is234Array(a));
		System.out.println(is234Array(b));
		System.out.println(is234Array(c));
		System.out.println(is234Array(d));
		System.out.println(is234Array(e));
		System.out.println(is234Array(f));
		System.out.println(is234Array(g));
		System.out.println(is234Array(h));

	}

}
