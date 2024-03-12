package Q1;

public class prime {

	public static int primeCount(int start, int end) {
		int count = 0;
		int i = start;
		if (i < 0)
			i = 2;
		if (start > end)
			return 0;
		while (i <= end) {
			if (i == 2) {
				count++;
			}				
			else if ((i / 10) >= 1) {
				if (i % 2 != 0 && i % 3 != 0 && i % 5 != 0)
					count++;
			} 
			else {
				if (i % 2 != 0 && i != 1 && i % i != 9)
					count++;
			}
			i++;
		}
		return count;
	}

	public static void main(String[] args) {
		System.out.println("Result1	: " + primeCount(10, 30));
		System.out.println("Result2	: " + primeCount(11, 29));
		System.out.println("Result3	: " + primeCount(20, 22));
		System.out.println("Result4	: " + primeCount(1, 1));
		System.out.println("Result5	: " + primeCount(5, 5));
		System.out.println("Result6	: " + primeCount(6, 2));
		System.out.println("Result7	: " + primeCount(-10, 6));
	}

}
