package Q12;

public class Packed {

	public static int isPacked(int[] a) {
		int search = a[0];
		int count = 0;
		int j = 0;
		if (a == null || a.length == 0)
			return 0;
		else {
			while (search != 0) {
				for (int i = 0; i < a.length; i++) {
					if (a[i] <= 0)
						return 0;
					else if (search == a[i])
						count++;
				}
				if (count != search)
					return 0;
				else {
					for (int x = j; x < search; x++) {
						if (a[x] != search)
							return 0;
					}
				}
				j += search;
				count = 0;
				if (j < a.length)
					search = a[j];
				else
					search = 0;
			}
			return 1;
		}
	}

	public static void main(String[] args) {
		int[] a = { 2, 2, 1 };
		int[] b = { 2, 2, 1, 2, 2 };
		int[] c = { 4, 4, 4, 4, 1, 2, 2, 3, 3, 3 };
		int[] d = { 7, 7, 7, 7, 7, 7, 7, 1 };
		int[] e = { -3, -3, -3 };
		int[] f = { 2, 1, 2 };
		System.out.println(isPacked(a));
		System.out.println(isPacked(b));// 0
		System.out.println(isPacked(c));// 1
		System.out.println(isPacked(d));
		System.out.println(isPacked(e));
		System.out.println(isPacked(f));
	}

}
