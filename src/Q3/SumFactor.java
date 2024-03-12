package Q3;

public class SumFactor {
	
	public static int sumFactor(int[] a) {
		int times =0;
		int sum = 0;
		for (int i=0; i<a.length;i++) {
			sum +=a[i];
		}
		for (int j=0; j<a.length;j++) {
			if (sum==a[j])
				times++;
		}
		return times;
	}
	
	public static void main(String[] args) {
		int[] Number_Array1 = { 3,0,2,-5,0 };
		int[] Number_Array2 = { 9,-3,-3,-1,1 };
		int[] Number_Array3 = { 1 };
		int[] Number_Array4 = { 0,0,0 };
		int[] Number_Array5 = {1,2,3,4};
		int[] Number_Array6 = { 1,-1,1,-1,1,-1,1 };

		System.out.println("Result1	: " + sumFactor(Number_Array1));
		System.out.println("Result2	: " + sumFactor(Number_Array2));
		System.out.println("Result3	: " + sumFactor(Number_Array3));
		System.out.println("Result4	: " + sumFactor(Number_Array4));
		System.out.println("Result5	: " + sumFactor(Number_Array5));
		System.out.println("Result6	: " + sumFactor(Number_Array6));


	}

}
