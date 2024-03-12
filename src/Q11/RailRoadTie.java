package Q11;

public class RailRoadTie {

	static int isRailroadTie(int[] a) {

		if (a == null || a.length <= 1 || a[0] == 0 || a[1] == 0)
			return 0;
		else {
			for (int i = 1; i < a.length; i++) {
				if (i == a.length - 1) {
					if (a[i] == 0)
						return 0;
				} else if (a[i] != 0) {
					if (a[i - 1] != 0 && a[i + 1] != 0)
						return 0;
				} else {
					if (a[i - 1] == 0 || a[i + 1] == 0)
						return 0;
				}

			}
			return 1;
		}
	}

	public static void main(String[] args) {
		int[] int_Array = { 1, 2 };
		int[] int_Array1 = { 1, 2, 0, 1, 2, 0, 1, 2 };
		int[] int_Array2 = { 3, 3, 0, 3, 3, 0, 3, 3, 0, 3, 3 };
		int[] int_Array3 = { 0, 0, 0, 0 };
		int[] int_Array4 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int[] int_Array5 = { 1, 3, 0, 3, 5, 0 };
		System.out.println(isRailroadTie(int_Array));
		System.out.println(isRailroadTie(int_Array1));
		System.out.println(isRailroadTie(int_Array2));
		System.out.println(isRailroadTie(int_Array3));
		System.out.println(isRailroadTie(int_Array4));
		System.out.println(isRailroadTie(int_Array5));

	}

}
