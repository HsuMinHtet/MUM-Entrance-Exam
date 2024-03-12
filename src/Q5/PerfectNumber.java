package Q5;

public class PerfectNumber {

	public static int henry(int i, int j) {
		if (i == 0 || j == 0)
			return 0;
		else
			return perfectNum(i) + perfectNum(j);
	}

	public static int perfectNum(int n) {
		int i = 0;
		int z = 2;
		int sum = 0;
		while (i != n) {
			for (int x = 1; x < z; x++) {
				if (z % x == 0) {
					sum += x;
				}
				if (sum == z && x == z - 1) {
					i++;
					if (i == n)
						return sum;
					sum = 0;
					break;
				}
			}
			z++;
			sum = 0;
		}
		return 0;
	}

	public static void main(String[] args) {
		// System.out.println("Sum of Perfect1 : " + perfectNum(1));
		// System.out.println("Sum of Perfect2 : " + perfectNum(3));
		System.out.println("Henery : " + henry(1,3));

	}

}
