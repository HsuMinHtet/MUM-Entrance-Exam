package Q12_1;

public class Exponent {
	public static int getExponent(int n, int p) {
		int count = 1;
		if (p <= 1)
			return -1;
		else if (n==0 || n % p != 0)
			return 0;
		else {
			while (n / Math.pow(p, count) != 0) {
				if (n % Math.pow(p, count) == 0)
					count++;
				else
					break;
			}
			return count-1;
		}
	}

	public static void main(String[] args) {
		System.out.println(getExponent(27, 3));
		System.out.println(getExponent(28, 3));
		System.out.println(getExponent(280, 7));
		System.out.println(getExponent(-250, 5));
		System.out.println(getExponent(18, 1));
		System.out.println(getExponent(128, 4));

	}

}
