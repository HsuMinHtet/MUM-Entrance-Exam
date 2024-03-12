package Q9;

import java.util.*;

public class Isolated {

	public static int isIsolated(long n) {
		long square;
		long cube;
		List<Long> list = new ArrayList<>();
		if (n < 1 || n == 2097151)
			return -1;
		else {
			square = n * n;
			cube = n * n * n;
			while (cube != 0) {
				list.add(cube % 10);
				cube /= 10;
			}
			while (square != 0) {
				for (int i = 0; i < list.size(); i++) {
					if (square % 10 == list.get(i))
						return 0;
				}
				square /= 10;
			}
			return 1;
		}
	}

	public static void main(String[] args) {
		System.out.println("Isolate : " + isIsolated(2));
		System.out.println("Isolate : " + isIsolated(163));
		System.out.println("Isolate : " + isIsolated(162));
		System.out.println("Isolate : " + isIsolated(4));
		System.out.println("Isolate : " + isIsolated(2097151));
		System.out.println("Isolate : " + isIsolated(0));
		System.out.println("Isolate : " + isIsolated(1));
		System.out.println("Isolate : " + isIsolated(10));
		System.out.println("Isolate : " + isIsolated(63));
		

	}

}
