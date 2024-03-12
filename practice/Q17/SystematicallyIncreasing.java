package Q17;

public class SystematicallyIncreasing {

	public static int isSystematicallyIncreasing(int[] a) {
		int j = 1;
		int times = 1;
		for (int i = 0; i < a.length; i++) {
			if (a[i] != j)
				return 0;
			if (times == j) {
				times++;
				j = 1;
			} else
				j++;
		}

		return 1;
	}

	public static void main(String[] args) {
		int[] a = { 1 };
		int[] b = { 1, 1, 2, 1, 2, 3, 1, 2, 3, 4, 1, 2, 3, 4, 5 };
		int[] c = { 1, 2, 1, 2, 3 };
		int[] d = { 1, 1, 3 };
		int[] e = { 1, 1, 2, 3 };
		System.out.println(isSystematicallyIncreasing(a));
		System.out.println(isSystematicallyIncreasing(b));
		System.out.println(isSystematicallyIncreasing(c));
		System.out.println(isSystematicallyIncreasing(d));
		System.out.println(isSystematicallyIncreasing(e));
	}

}
