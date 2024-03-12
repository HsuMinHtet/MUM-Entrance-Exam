package Q15;

public class Cube {
	public static int isCubePowerful(int n) {
		int mod, total = 0, cube=1;
		int div = n;
		if (n <= 0) {
			return 0;
		} else {
			while (div != 0) {
				mod = div % 10;
				div /= 10;
				for (int i = 1; i <= 3; i++) {
					cube *= mod;
				}
				total += cube;
				mod = 0;
				cube=1;
			}
			if (total == n)
				return 1;
			else
				return 0;
		}
	}

	public static void main(String[] args) {
		System.out.println(isCubePowerful(153));
		System.out.println(isCubePowerful(370));
		System.out.println(isCubePowerful(371));
		System.out.println(isCubePowerful(407));
		System.out.println(isCubePowerful(87));
		System.out.println(isCubePowerful(0));
		System.out.println(isCubePowerful(-81));
	}

}
