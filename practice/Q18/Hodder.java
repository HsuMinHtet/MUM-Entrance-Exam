package Q18;

public class Hodder {

	public static int isHodder(int n) {
		int result = 2;
		int i = 2;
		while (result < n) {
			result *= 2;
		}
		if ((result - 1) == n) {
			while (i != n) {
				if (n % i == 0)
					return 0;
				i++;
			}
			return 1;
		}
		return 0;
	}

	public static void main(String[] args) {
		System.out.println(isHodder(31));
		System.out.println(isHodder(3));
		System.out.println(isHodder(7));
		System.out.println(isHodder(128));

	}

}
