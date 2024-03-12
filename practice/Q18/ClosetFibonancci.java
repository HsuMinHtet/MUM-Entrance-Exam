package Q18;

public class ClosetFibonancci {

	public static int closetFibonancci(int n) {
		int result = 0;
		int i = 1, j = 0;
		if (n < 1)
			return 0;
		while (result < n) {
			result = i + j;
			j = i;
			i = result;
		}
		if (result == n)
			return result;
		else if (result > n)
			return j;
		else
			return 0;

	}

	public static void main(String[] args) {
		System.out.println(closetFibonancci(12));
		System.out.println(closetFibonancci(33));
		System.out.println(closetFibonancci(34));
		System.out.println(closetFibonancci(1));

	}

}
