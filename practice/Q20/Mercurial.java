package Q20;

public class Mercurial {

	public static int isMercurial(int[] a) {
		int left, right;
		boolean front = false, end = false;
		if (a.length == 0 || a == null)
			return 1;

		for (int i = 0; i < a.length; i++) {
			if (a[i] == 3 && i != 0 && i != a.length) {
				left = i;
				right = i;
				front = false;
				end = false;
				while (left != 0 && right != a.length - 1) {
					if (left != 0) {
						left--;
						if (a[left] == 1)
							front = true;
					}
					if (right != a.length - 1) {
						right++;
						if (a[right] == 1)
							end = true;
					}
				}
				if (front == true && end == true)
					return 0;
			}
		}
		return 1;

	}

	public static void main(String[] args) {
		int[] a = { 1, 2, 10, 3, 15, 1, 2, 2 };
		int[] b = { 5, 2, 10, 3, 15, 1, 2, 2 };
		int[] c = { 1, 2, 10, 3, 15, 16, 2, 2 };
		int[] d = { 3, 2, 18, 1, 0, 3, -11, 1, 3 };
		int[] e = { 2, 3, 1, 1, 18 };
		int[] f = { 8, 2, 1, 1, 18, 3, 5 };
		int[] g = { 3, 3, 3, 3, 3, 3 };
		int[] h = { 2 };

		System.out.println(isMercurial(a));
		System.out.println(isMercurial(b));
		System.out.println(isMercurial(c));
		System.out.println(isMercurial(d));
		System.out.println(isMercurial(e));
		System.out.println(isMercurial(f));
		System.out.println(isMercurial(g));
		System.out.println(isMercurial(h));

	}

}
