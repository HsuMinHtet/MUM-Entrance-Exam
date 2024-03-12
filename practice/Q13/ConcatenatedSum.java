package Q13;

public class ConcatenatedSum {

	public static int checkConcatenatedSum(int n, int catlen) {
		int num = n;
		int cat;
		int mod;
		int totalSum = 0;
		int sum = 0;
		do {
			mod = num % 10;
			num /= 10;
			cat = mod;
			for (int i = 2; i <= catlen; i++) {
				cat *= 10;
				sum += cat;
			}
			sum += mod;
			totalSum += sum;
			sum = 0;
		} while (num != 0);
		if (totalSum == n)
			return 1;
		return 0;
	}

	/*public static int checkConcatenatedSum(int n, int catlen) {
		StringBuilder catlenStr = new StringBuilder();
		for (int i = 0; i < catlen; i++) {
			catlenStr.append(1);
		}
		if (n % Integer.valueOf(catlenStr.toString()) == 0) {
			return 1;
		}
		return 0;
	}*/

	public static void main(String[] args) {
		System.out.println(checkConcatenatedSum(198, 2));
		System.out.println(checkConcatenatedSum(198, 3));
		System.out.println(checkConcatenatedSum(2997, 3));
		System.out.println(checkConcatenatedSum(2997, 2));
		System.out.println(checkConcatenatedSum(13332, 4));
		System.out.println(checkConcatenatedSum(9, 1));

	}

}
