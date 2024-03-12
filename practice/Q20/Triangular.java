package Q20;

public class Triangular {

	public static int isTriangular(int n) {
		int i = 0, total = 0;
		while (total < n) {
			total += i;
			i++;
		}
		if (total == n)
			return 1;
		else
			return 0;
	}

	public static void main(String[] args) {
		System.out.println(isTriangular(1));
		System.out.println(isTriangular(2));
		System.out.println(isTriangular(3));
		System.out.println(isTriangular(6));
		System.out.println(isTriangular(9));
		System.out.println(isTriangular(10));

	}

}
