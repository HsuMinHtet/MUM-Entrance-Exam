package Q14;

import java.util.*;

public class LargestPrime {

	public static int largestPrimeFactor(int n) {
		int prime = 0;
		int largest = 0;
		List<Integer> list = new ArrayList<>();
		int i = 1;
		if (n <= 1)
			return 0;
		else {
			while (prime < n) {
				prime = givePrime(i);
				if (n % prime == 0)
					list.add(prime);
				i++;
			}
			if (list.size() > 0)
				largest = list.get(0);
			for (int x = 1; x < list.size(); x++) {
				if (largest < list.get(x))
					largest = list.get(x);
			}
			return largest;
		}
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
		System.out.println(largestPrimeFactor(10));
		System.out.println(largestPrimeFactor(6936));
		System.out.println(largestPrimeFactor(1));
	}
}
