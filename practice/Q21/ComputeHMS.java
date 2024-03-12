package Q21;

import java.util.Arrays;

public class ComputeHMS {

	public static int[] computeHMS(int seconds) {
		int h = 0, m = 0;
		int[] a = new int[3];

		if (seconds != 0) {
			if (seconds > 3600) {
				h = seconds / 3600;
				seconds %= 3600;
			}
			if (seconds > 60) {
				m = seconds / 60;
				seconds %= 60;
			}
			a[2] = seconds;
		}
		a[0] = h;
		a[1] = m;
		a[2] = seconds;

		return a;
	}

	public static void main(String[] args) {
		System.out.println(Arrays.toString(computeHMS(3735)));
		System.out.println(Arrays.toString(computeHMS(380)));
		System.out.println(Arrays.toString(computeHMS(3650)));
		System.out.println(Arrays.toString(computeHMS(55)));
		System.out.println(Arrays.toString(computeHMS(0)));

	}

}
