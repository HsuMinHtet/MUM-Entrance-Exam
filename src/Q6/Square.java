package Q6;

public class Square {

	public static int isSquare(int n) {
		int x = 0;
		if (n < 0)
			return 0;
		while (n != x * x) {
			if (x > n)
				return 0;
			x++;
		}
		return 1;
	}

	public static void main(String[] args) {
		System.out.println("1st sq : " + isSquare(4));
		System.out.println("2st sq : " + isSquare(25));
		System.out.println("3st sq : " + isSquare(-4));
		System.out.println("4st sq : " + isSquare(8));
		System.out.println("5st sq : " + isSquare(0));
	}

}
