package Q14;

public class MatchedPattern {
	public static int matchPattern(int[] a, int[] pattern) {
		int k = 0;
		int i = 0;
		int matches = 0;
		for (i = 0; i < a.length; i++) {
			if (a[i] == pattern[k])
				matches++;
			else if (matches == 0 || k == pattern.length - 1) {
				return 0;
			} else {
				k++;
				matches = 0;
				if (a[i] == pattern[k])
					matches++;     
				else
					return 0;
			}
		}
		if (i == a.length && k == pattern.length - 1)
			return 1;
		else
			return 0;
	}

	public static void main(String[] args) {
		int[] a = { 1, 1, 1, 1, 1 };
		int[] b = { 1 };
		int[] c = { 1, 1, 2, 2, 2, 2 };
		int[] d = { 1, 2, 3 };
		int[] e = { 1, 2 };
		int[] f = { 1, 1, 2, 2, 2, 2, 3 };
		int[] g = { 1, 1, 1, 1 };
		int[] h = { 1, 1, 1, 1, 2, 2, 3, 3 };
		int[] i = { 1, 1, 10, 4, 4, 3 };
		int[] j = { 1, 3 };
		int[] k = { 1, 4, 3 };

		System.out.println(matchPattern(a, b));
		System.out.println(matchPattern(b, b));
		System.out.println(matchPattern(c, e));
		System.out.println(matchPattern(d, e));
		System.out.println(matchPattern(e, d));
		System.out.println(matchPattern(f, j));
		System.out.println(matchPattern(g, e));
		System.out.println(matchPattern(h, e));
		System.out.println(matchPattern(i, k));
	}

}
