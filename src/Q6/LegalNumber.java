package Q6;

public class LegalNumber {

	public static int isLegalNumber(int[] a, int n) {
		for (int i=0; i<a.length; i++) {
			if(a[i]>n) {
				return 0;
			}
		}
		return 1;
	}

	public static void main(String[] args) {
		int[] Number_Array1 = { 1, 0, 1, 1 };
		int[] Number_Array2 = { 1, 1, 2 };
		int[] Number_Array3 = { 3, 2, 5 };
		int[] Number_Array4 = { 3, 2, 1 };
		int[] Number_Array5 = { 3, 7, 1 };

		System.out.println(isLegalNumber(Number_Array1, 2));
		System.out.println(isLegalNumber(Number_Array2, 3));
		System.out.println(isLegalNumber(Number_Array3, 8));
		System.out.println(isLegalNumber(Number_Array4, 4));
		System.out.println(isLegalNumber(Number_Array5, 6));

	}

}
