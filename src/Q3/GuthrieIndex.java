package Q3;

public class GuthrieIndex {

	public static int guthrieIndex(int n) {
		int result = 0;
		while (n != 1) {
			// even
			if (n % 2 == 0)
				n = (n / 2);
			// odd
			else
				n = ((n * 3) + 1);
			result++;
		}
		return result;
	}

	public static void main(String[] args) {
		System.out.println("Result1 : " + guthrieIndex(1));
		System.out.println("Result2	: " + guthrieIndex(2));
		System.out.println("Result2 : " + guthrieIndex(3));
		System.out.println("Result2 : " + guthrieIndex(4));
		System.out.println("Result2 : " + guthrieIndex(42));
		System.out.println("Result2 : " + guthrieIndex(7));

	}

}
