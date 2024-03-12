package Q16;

public class DigitIncreasing {

	public static int isDigitIncreasing(int n) {
		int div = n;
		int num = 0;
		int sum = 0;
		String increase = "";
		int inc = 0;
		for (int i = 1; i <= 9; i++) {
			do {
				num = div / 10;
				div /= 10;
				increase += 1;
				inc = Integer.parseInt(increase);
				sum += i * inc;

			} while (num > 0);
			if (sum == n)
				return 1;
			if (sum>n)
				return 0;
			increase = "";
			sum = 0;
			div = n;
		}

		return 0;
	}

	public static void main(String[] args) {
		System.out.println(isDigitIncreasing(33));
		System.out.println(isDigitIncreasing(7));
		System.out.println(isDigitIncreasing(36));
		System.out.println(isDigitIncreasing(984));
		System.out.println(isDigitIncreasing(7404));
	}

}
