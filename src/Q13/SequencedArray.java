package Q13;

public class SequencedArray {
	public static int isSequencedArray(int[] a, int m, int n) {
		int count = 0;
		if (a == null || a.length == 0 || n < m || a[0] != m || a[a.length - 1] != n || a[0] == 0)
			return 0;
		else {
			for (int i = 1; i < a.length; i++) {
				if (a[i - 1] > a[i])
					return 0;
			}
			for (int x = m; x <= n; x++) {
				for (int y = 0; y < a.length; y++) {
					if (x == a[y])
						count++;
				}
				if (count == 0)
					return 0;
				count = 0;
			}
			return 1;
		}

	}

	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4,5 };
		int[] b = { 1,3,4,2,5 };
		int[] c = {-5,-5,-4,-4,-3,-3,-2,-2 };
		int[] d = { 0,1,2,3,4,5 };
		int[] e = { 1,2,5 };
		int[] f = { 5,4,3,2,1 };
		System.out.println(isSequencedArray(a,1,5));
		System.out.println(isSequencedArray(b,1,5));
		System.out.println(isSequencedArray(c,-5,-2));
		System.out.println(isSequencedArray(d,1,5));
		System.out.println(isSequencedArray(e,1,5));
		System.out.println(isSequencedArray(f,1,5));

	}

}
