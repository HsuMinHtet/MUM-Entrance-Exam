package Q21;

public class MartianArray {

	public static int isMartian(int[] a) {
		int one = 0, two = 0;
		if (a.length == 0 || a == null)
			return 0;
		else {
			for (int i = 0; i < a.length; i++) {
				if (a[i] == 1)
					one++;
				else if (a[i] == 2) {
					two++;
					if (i != 0 && i != a.length - 1) {
						if (a[i - 1] != a[i + 1])
							return 0;
					} else
						return 0;
				}
			}
			if (one <= two)
				return 0;
			else
				return 1;
		}
	}

	public static void main(String[] args) {
		int[] a = { 1, 3 };
		int[] b = { 1, 2, 1, 2, 1, 2, 1, 2, 1 };
		int[] c = { 1, 3, 2 };
		int[] d = { 1, 3, 2, 2, 1, 5, 1, 5 };
		int[] e = { 1, 2, -18, -18, 1, 2 };
		int[] f = {};
		int[] g = { 1 };
		int[] h = { 2 };

		System.out.println(isMartian(a));
		System.out.println(isMartian(b));
		System.out.println(isMartian(c));
		System.out.println(isMartian(d));
		System.out.println(isMartian(e));
		System.out.println(isMartian(f));
		System.out.println(isMartian(g));
		System.out.println(isMartian(h));

	}

}
