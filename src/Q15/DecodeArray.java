package Q15;

public class DecodeArray {
	public static int decodeArray(int[] a) {
		int sign = 1;
		int j = 1;
		int total, result = 0;
		if (a[0] < 0) {
			sign = -1;
		}
		for (int i = 1; i < a.length; i++) {
			total = a[i - 1] - a[i];
			if (total < 0)
				total *= -1;
			while (j + i < a.length) {
				total *= 10;
				j++;
			}
			j = 1;
			result += total;
		}
		return result * sign;
	}

	public static void main(String[] args) {
		int[] a = { 0, -3, 0, -4, 0 };
		int[] b = { -1, 5, 8, 17, 15 };
		int[] c = { 1, 5, 8, 17, 15 };
		int[] d = { 111, 115, 118, 127, 125 };
		int[] e = { 1, 1 };
		System.out.println(decodeArray(a));
		System.out.println(decodeArray(b));
		System.out.println(decodeArray(c));
		System.out.println(decodeArray(d));
		System.out.println(decodeArray(e));

	}

}
