package Q16;

public class ZeroPlentiful {

	public static int isZeroPlentiful(int[] a) {
		int count = 0;
		int realCount = 0;
		if (a.length < 4 || a == null)
			return 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] == 0) {
				count++;
				if (i == a.length - 1 && count >= 4)
					realCount++;
			} else {
				if (count >= 4) {
					realCount++;
					count = 0;
				} else if (count != 0 && count < 4) {
					return 0;
				}
			}
		}
		return realCount;
	}

	public static void main(String[] args) {
		int[] a = { 0, 0, 0, 0, 0 };
		int[] b = { 1, 2, 0, 0, 0, 0, 2, -18, 0, 0, 0, 0, 0, 12 };
		int[] c = { 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 8, 0, 0, 0, 0, 0, 0 };
		int[] d = { 1, 2, 3, 4 };
		int[] e = { 1, 0, 0, 0, 2, 0, 0, 0, 0 };
		int[] f = { 0 };
		int[] g = { 1 };

		System.out.println(isZeroPlentiful(a));
		System.out.println(isZeroPlentiful(b));
		System.out.println(isZeroPlentiful(c));
		System.out.println(isZeroPlentiful(d));
		System.out.println(isZeroPlentiful(e));
		System.out.println(isZeroPlentiful(f));
		System.out.println(isZeroPlentiful(g));

	}

}
