package Q5;

public class Divisible {

	public static int isDivisible(int[] a, int divisor) {
		if(a==null || a.length==0) {
			return 1;
		}
		else {
			if(divisor == 0) {
				divisor =1;
			}
			for(int i=0; i<a.length; i++) {
				if(a[i]%divisor != 0)
					return 0;
			}
			return 1;
		}
		
	}

	public static void main(String[] args) {
		int[] Number_Array1 = { 3, 3, 6, 36 };
		int[] Number_Array2 = { 4 };
		int[] Number_Array3 = { 3, 4, 3, 6, 36 };
		int[] Number_Array4 = { 6, 12, 24, 36 };
		int[] Number_Array5 = {};

		System.out.println(isDivisible(Number_Array1, 3));
		System.out.println(isDivisible(Number_Array2, 2));
		System.out.println(isDivisible(Number_Array3, 3));
		System.out.println(isDivisible(Number_Array4, 12));
		System.out.println(isDivisible(Number_Array5, 0));
	}

}
