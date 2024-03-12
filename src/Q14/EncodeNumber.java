package Q14;

import java.util.ArrayList;

import java.util.*;

public class EncodeNumber {
	public static int[] encodeNumber(int n) {
		int i = 1;
		int[] result;
		List<Integer> list = new ArrayList<>();
		int prime = givePrime(i);
		while (n >= prime) {
			if (n % prime == 0) {
				list.add(prime);
				n /= prime;
			} else {
				i++;
				prime = givePrime(i);
			}
		}
		if (list.size() == 0 || list == null) {
			return null;
		} else {
			result = new int[list.size()];
			for (int j = 0; j < list.size(); j++) {
				result[j] = list.get(j);
			}
		}
		return result;
	}

	public static int givePrime(int time) {
		int result = 0;
		int i = 2;
		int t = 0;
		while (time != t) {
			if (i == 2 || i == 3 || i == 5 || i == 7) {
				result = i;
				t++;
			} else {
				int n = 2;
				while (n <= i) {
					if (i % n == 0)
						break;
					n++;
				}
				if (n == i) {
					result = i;
					t++;
				}
			}
			i++;
		}
		if (time == t)
			return result;
		return 0;
	}

	public static void main(String[] args) {
		System.out.println(Arrays.toString(encodeNumber(2)));
		System.out.println(Arrays.toString(encodeNumber(6)));
		System.out.println(Arrays.toString(encodeNumber(14)));
		System.out.println(Arrays.toString(encodeNumber(24)));
		System.out.println(Arrays.toString(encodeNumber(1200)));
		System.out.println(Arrays.toString(encodeNumber(1)));
		System.out.println(Arrays.toString(encodeNumber(-18)));

	}

}
