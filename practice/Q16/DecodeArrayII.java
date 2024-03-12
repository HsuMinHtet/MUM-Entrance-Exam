package Q16;

public class DecodeArrayII {

	public static int decodeArrayII(int[] a) {
		String num = "";
		int count = 0;
		if (a.length == 0 || a == null || a[a.length - 1] != 1)
			return 0;
		else {
			if (a[0] == -1)
				num += "-";
			for (int i = 0; i < a.length; i++) {
				if (a[i] == 0)
					count++;
				else if (a[i] == 1) {
					num += count;
					count = 0;
				}
			}
		}
		count = Integer.parseInt(num);
		return count;
	}

	public static void main(String[] args) {
		int[] a = { 1 };
		int[] b = { 0, 1 };
		int[] c = { -1, 0, 1 };
		int[] d = { 0, 1, 1, 1, 1, 1, 0, 1 };
		int[] e = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1 };
		int[] f = { 0, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0, 1 };

		System.out.println(decodeArrayII(a));
		System.out.println(decodeArrayII(b));
		System.out.println(decodeArrayII(c));
		System.out.println(decodeArrayII(d));
		System.out.println(decodeArrayII(e));
		System.out.println(decodeArrayII(f));

	}

}
