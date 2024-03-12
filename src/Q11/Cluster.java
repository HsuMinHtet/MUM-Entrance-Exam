package Q11;

import java.util.Arrays;

/**
 * to compress array {0, 0, 0, 2, 0, 2, 0, 2, 0, 0} ={0, 2, 0, 2, 0, 2, 0}
 * {0,0,6,6,-1,7,4}={0,6,-1,7,4} {18}={18} {-5, -5, -5, -5, -5}={-5} {}={}
 */
public class Cluster {

	static int[] clusterCompression(int[] a) {
		if (a == null || a.length <= 1)
			return a;
		int j = 0;
		int count = 1;
		for (int x = 0; x < a.length - 1; x++) {
			if (a[x] != a[x + 1])
				count++;
		}
		int[] arr = new int[count];

		for (int i = 0; i <= a.length - 1; i++) {
			if (i == 0) {
				arr[j] = a[i];
				j++;
			} else if (a[i - 1] != a[i]) {
				arr[j] = a[i];
				j++;
			}
		}
		return arr;
	}

	public static void main(String[] args) {
		int[] int_Array = { 0, 0, 0, 2, 0, 2, 0, 2, 0, 0 };
		int[] int_Array1 = { 18 };
		int[] int_Array2 = {};
		int[] int_Array3 = { -5, -5, -5, -5, -5 };
		int[] int_Array4 = { 1, 1, 1, 1, 1, 2, 1, 1, 1, 1, 1, 1, 1 };
		int[] int_Array5 = { 8, 8, 6, 6, -2, -2, -2 };

		System.out.println(Arrays.toString(clusterCompression(int_Array)));
		System.out.println(Arrays.toString(clusterCompression(int_Array1)));
		System.out.println(Arrays.toString(clusterCompression(int_Array2)));
		System.out.println(Arrays.toString(clusterCompression(int_Array3)));
		System.out.println(Arrays.toString(clusterCompression(int_Array4)));
		System.out.println(Arrays.toString(clusterCompression(int_Array5)));

	}

}
