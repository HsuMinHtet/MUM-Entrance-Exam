package MIU_SampleTest;

public class Smallest_Middle_Odd {
	
	public static int Middle_Odd ( int[] a) {
		int middle_Index = 0 ;
		int middle_Value = 0 ;
		
		if (a.length != 0 || (a.length % 2) != 0) {
		 middle_Index = a.length/2;
		 middle_Value = a[middle_Index];
		}
		else 
			return 0;

		for (int i=0; i<a.length; i++) {
			if(i!= middle_Index && middle_Value >= a[i])
				return 0;
		}
		return 1;
	}

	public static void main(String[] args) {
		int[] Number_Array0 = {1,2,3,4,5};
		int[] Number_Array1 = {3,2,1,4,5};
		int[] Number_Array2 = {3,2,1,4,1};
		int[] Number_Array3 = {1,2,3,4};
		int[] Number_Array4 = {};
		int[] Number_Array5 = {10};
		System.out.println("0 :" + Middle_Odd(Number_Array0));
		System.out.println("1 :" + Middle_Odd(Number_Array1));
		System.out.println("2 :" + Middle_Odd(Number_Array2));
		System.out.println("3 :" + Middle_Odd(Number_Array3));
		System.out.println("4 :" + Middle_Odd(Number_Array4));
		System.out.println("5 :" + Middle_Odd(Number_Array5));
	}

}
