package Q12_1;

public class Array121 {
	public static int is121Array(int[] a) {
		int f = 0;
		int b = a.length - 1;
		int fCount = 0, bCount = 0;
		// abnormal case
		if (a.length < 3 || a == null || a[0] != 1 || a[a.length - 1] != 1)
			return 0;
		else {
			// front
			while (a[f] == 1) {
				fCount++;
				f++;
				if (f == a.length)
					return 0;
			}
			// back
			while (a[b] == 1) {
				bCount++;
				b--;
			}
			// isEqual back and front count of '1'
			if (fCount != bCount)
				return 0;
			else {
				// middle only '2'
				while (f <= b) {
					if (a[f] != 2)
						return 0;
					f++;
				}
			}
			return 1;
		}
	}

	public static void main(String[] args) {
		int[] a = { 1, 2, 1 };
		int[] b = { 1, 1, 2, 2, 2, 1, 1 };
		int[] c = { 1, 1, 2, 2, 2, 1, 1, 1 };
		int[] d = { 1, 1, 2, 1, 2, 1, 1 };
		int[] e = { 1, 1, 1, 2, 2, 2, 1, 1, 1, 3 };
		int[] f = { 1, 1, 1, 1, 1, 1 };
		int[] g = { 2, 2, 2, 1, 1, 1, 2, 2, 2, 1, 1 };
		System.out.println(is121Array(a));
		System.out.println(is121Array(b));
		System.out.println(is121Array(c));
		System.out.println(is121Array(d));
		System.out.println(is121Array(e));
		System.out.println(is121Array(f));
		System.out.println(is121Array(g));
	}

}
