package Q11;
public class Smallest {
	public static int smallest(int n) {
		int num = 1;
		int count = 0;
		int result = 0;
		int div, mod;

		while (count != n) {
			count = 0;
			for (int i = 1; i <= n; i++) {
				result = num * i;
				div = result;
				while (div != 0) {
					mod = div % 10;
					div /= 10;
					if (mod == 2) {
						count++;
						break;
					}
				}
			}
			num++;
		}
		return result / n;
	}

	public static void main(String[] args) {
		System.out.println(smallest(4));
		System.out.println(smallest(5));
		System.out.println(smallest(6));
		System.out.println(smallest(7));
		System.out.println(smallest(3));

	}

}
