package Q12;

import java.util.*;

public class FullnessQuotient {

	public static int fullnessQuotient(int n) {
		boolean hasZero = false;
		int div = n;
		int count = 0;
		List<Integer> list = new ArrayList<>();
		if (n < 1) {
			return -1;
		} else {
			for (int i = 2; i <= 9; i++) {
				while (div != 0) {
					list.add(div % i);
					div /= i;
				}
				for (int j = 0; j < list.size(); j++) {
					if (list.get(j) == 0) {
						hasZero = true;
						break;
					}
				}
				if (hasZero == false)
					count++;
				list.clear();
				hasZero = false;
				div = n;
			}
			return count;
		}
	}

	public static void main(String[] args) {
		System.out.println(fullnessQuotient(94));
		System.out.println(fullnessQuotient(1));
		System.out.println(fullnessQuotient(9));
		System.out.println(fullnessQuotient(360));
		System.out.println(fullnessQuotient(-4));
	}

}
