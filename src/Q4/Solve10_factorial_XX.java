package Q4;

import java.util.Arrays;

public class Solve10_factorial_XX {

	public static int[] solve10() {
		int a,b; int result =0;
		int[] array = new int[2];
		for (int i = 0; i <= 10; i++) {
			 a = factorial(i);
			for (int j = 0; j <10; j++) {
				 b = factorial(j);
				 result = a+b;
				 System.out.println(i+"+"+j+"  A+B: "+ result);
				if (a + b == factorial(10)) {
					array[0] = a;
					array[1] = b;
					return array;
				}
			}
		}
		return null;
	}

	public static int factorial(int n) {
		int result = 1;
		if(n==0) return 0;
		for (int x = 1; x <= n; x++) {
			result *= x;
		}
		return result;
	}

	public static void main(String[] args) {
		System.out.println(factorial(0));
		System.out.println(Arrays.toString(solve10()));
	}

}
