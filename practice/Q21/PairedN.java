package Q21;

public class PairedN {

	public static int isPairedN(int[] a, int n) {

		if (a.length == 0 || a == null || (a.length - 2 + a.length - 1) < n)
			return 0;
		else {
			for (int i = 0; i < a.length; i++) {
				for (int j = i + 1; j < a.length; j++) {
					if (i + j == n && (a[i] + a[j]) == n)
						return 1;
				}
			}
			return 0;
		}
	}

	public static void main(String[] args) {
		int[] a = { 1, 4, 1, 4, 5, 6 };
		int[] b = { 0, 1, 2, 3, 4, 5, 6, 7, 8 };
		int[] c = { 1, 4, 1 };
		int[] d = { 8, 8, 8, 8, 7, 7, 7 };
		int[] e = { 8, -8, 8, 8, 7, 7, -7 };
		int[] f = { 3 };
		int[] g = {};

		System.out.println(isPairedN(a, 5));
		System.out.println(isPairedN(a, 6));
		System.out.println(isPairedN(b, 6));
		System.out.println(isPairedN(c, 5));
		System.out.println(isPairedN(d, 15));
		System.out.println(isPairedN(e, -15));
		System.out.println(isPairedN(f, 3));
		System.out.println(isPairedN(g, 0));

	}

}
