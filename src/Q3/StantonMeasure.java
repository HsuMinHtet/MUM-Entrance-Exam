package Q3;

public class StantonMeasure {

	public static int stantonMeasure(int[] a) {
		int times = 0;
		int n=0;
		for(int i=0; i< a.length; i++) {
			if(a[i]==1) {
				n+=1;
			}
		}
		for (int j=0; j<a.length ; j++) {
			if(a[j]==n) {
				times+=1;
			}
		}
		return times;
	}

	public static void main(String[] args) {
		int[] Number_Array1 = { 1 };
		int[] Number_Array2 = { 0 };
		int[] Number_Array3 = { 3, 1, 1, 4 };
		int[] Number_Array4 = { 1, 3, 1, 1, 3, 3, 2, 3, 3, 3, 4 };
		int[] Number_Array5 = {};
		int[] Number_Array6 = { 1, 4, 3, 2, 1, 2, 3, 2 };

		System.out.println("Result1	: " + stantonMeasure(Number_Array1));
		System.out.println("Result2	: " + stantonMeasure(Number_Array2));
		System.out.println("Result3	: " + stantonMeasure(Number_Array3));
		System.out.println("Result4	: " + stantonMeasure(Number_Array4));
		System.out.println("Result5	: " + stantonMeasure(Number_Array5));
		System.out.println("Result6	: " + stantonMeasure(Number_Array6));

	}

}
