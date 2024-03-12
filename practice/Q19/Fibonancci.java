package Q19;

public class Fibonancci {

	public static int isFibonancci(int n) {
		int result = 0;
		int i = 1, j = 0;

		while (result < n) {
			result = i + j;
			j = i;
			i = result;
		}
		if (result == n)
			return 1;
		else
			return 0;
	}

	public static void main(String[] args) {
		System.out.println(isFibonancci(13));
		System.out.println(isFibonancci(34));
		System.out.println(isFibonancci(9));

	}

}
