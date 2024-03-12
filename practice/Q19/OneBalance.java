package Q19;

public class OneBalance {

	public static int isOneBalanced(int[] a) {
		int i = 0;
		int begin = 0, middle = 0, conclude = 0;
		if (a.length == 0 || a == null) {
			return 1;
		}
		while (a[i] == 1) {
			begin++;
			if (i != a.length - 1)
				i++;
			else
				break;
		}
		while (a[i] != 1) {
			middle++;
			if (i != a.length - 1)
				i++;
			else
				break;
		}
		while (a[i] == 1) {
			conclude++;
			if (i != a.length - 1)
				i++;
			else
				break;
		}
		if (a.length != (begin + middle + conclude))
			return 0;
		else if ((begin != 0 && middle != 0) || (middle != 0 && conclude != 0))
			return 1;
		else
			return 0;
	}

	public static void main(String[] args) {
		int[] a = { 1, 1, 1, 2, 3, -18, 45, 1 };
		int[] b = { 1, 1, 1, 2, 3, -18, 45, 1, 0 };
		int[] c = { 1, 1, 2, 3, 1, -18, 26, 1 };
		int[] d = {};
		int[] e = { 3, 4, 1, 1 };
		int[] f = { 1, 1, 3, 4 };
		int[] g = { 1, 1, 1, 1, 1, 1 };
		int[] h = { 3, 3, 3, 3, 3 };

		System.out.println(isOneBalanced(a));
		System.out.println(isOneBalanced(b));
		System.out.println(isOneBalanced(c));
		System.out.println(isOneBalanced(d));
		System.out.println(isOneBalanced(e));
		System.out.println(isOneBalanced(f));
		System.out.println(isOneBalanced(g));
		System.out.println(isOneBalanced(h));

	}

}
