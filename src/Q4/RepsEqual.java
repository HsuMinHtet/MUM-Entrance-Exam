package Q4;

public class RepsEqual {

	public static int repsEqual(int[] a, int n) {
		if (a!= null && a.length !=0) {
			for (int i=a.length-1 ; i>=0 ; i--) {
				if (a[i]!=(n%10)) {
					return 0;
				}
				n/=10;
			}
			return 1;
		}
		return 0;
	}

	public static void main(String[] args) {
		int[] Number_Array1 = { 3, 2, 0, 5, 3 };
		int[] Number_Array2 = { 3, 2, 0, 5 };
		int[] Number_Array3 = { 3, 2, 0, 5, 3, 4 };
		int[] Number_Array4 = { 9, 3, 1, 1, 2 };
		int[] Number_Array5 = { 0, 3, 2, 0, 5, 3 };

		System.out.println(repsEqual(Number_Array1, 32053));
		System.out.println(repsEqual(Number_Array2, 32053));
		System.out.println(repsEqual(Number_Array3, 32053));
		System.out.println(repsEqual(Number_Array4, 32053));
		System.out.println(repsEqual(Number_Array5, 32053));

	}

}
