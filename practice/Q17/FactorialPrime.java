package Q17;

public class FactorialPrime {

	public static int isFactorialPrime(int n) {
		int factorial = 1;
		int i = 0;
		if (n >= 2 || isPrime(n) == true) {
			do {
				i++;
				factorial *= i;
			} while (factorial < n);
			if ((factorial / i) + 1 == n)
				return 1;
		}
		return 0;
	}

	public static boolean isPrime(int n) {
		int i = 2;
		while (i < n) {
			if (i != n && n % i == 0)
				return false;

			i++;
		}
		return true;
	}

	public static void main(String[] args) {
		System.out.println(isFactorialPrime(11));

	}

}
