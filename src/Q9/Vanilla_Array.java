package Q9;

public class Vanilla_Array {

	public static int isVanilla(int[] a) {
		int x = 0;
		int y = 0;
		if (a.length == 0 || a == null) {
			return 1;
		} else {
			x = a[0] % 10;
			for (int i = 0; i < a.length; i++) {
				y = a[i];
				if (a[i] < 0)
					y = a[i] * (-1);
				while (y != 0) {
					if (x != y % 10)
						return 0;
					y /= 10;
				}
			}
			return 1;
		}

	}

	
	public static void main(String[] args) {
		int[] Number_Array1 = { 1 };
		int[] Number_Array2 = { 11, 22, 13, 34, 125 };
		int[] Number_Array3 = { 9, 999, 99999, -999 };
		int[] Number_Array4 = { 1, 1, 11, 1111, 111111 };
		int[] Number_Array5 = { 11, 101, 1111, 11111 };
		int[] Number_Array6 = {  };

		System.out.println(isVanilla(Number_Array1));
		System.out.println(isVanilla(Number_Array2));
		System.out.println(isVanilla(Number_Array3));
		System.out.println(isVanilla(Number_Array4));
		System.out.println(isVanilla(Number_Array5));
		System.out.println(isVanilla(Number_Array6));

	}

}
