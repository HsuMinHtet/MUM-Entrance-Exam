package MIU_SampleTest;

public class Odd_Even {

	public static int Sum_Odd_Even(int[] a) {
		int Even= 0;
		int Odd =0;
		
		if (a.length == 0) {
			return 0;
		}
		else {
			for(int i= 0; i < a.length; i++) {
				if(a[i]%2 == 0) 
					Even += a[i];
				else 
					Odd += a[i];
			}
			return Odd-Even;
		}
		
	}
	
	public static void main(String[] args) {
		int[] Number_Array0 = {1};
		int[] Number_Array1 = {1,2};
		int[] Number_Array2 = {1,2,3};
		int[] Number_Array3 = {1,2,3,4};
		int[] Number_Array4 = {3,3,4,4};
		int[] Number_Array5 = {3,2,3,4};
		int[] Number_Array7 = {4,1,2,3};
		int[] Number_Array8 = {1,1};
		int[] Number_Array9 = {};
		System.out.println("Result 1	:" + Sum_Odd_Even(Number_Array0));
		System.out.println("Result 2	:" + Sum_Odd_Even(Number_Array1));
		System.out.println("Result 3	:" + Sum_Odd_Even(Number_Array2));
		System.out.println("Result 4	:" + Sum_Odd_Even(Number_Array3));
		System.out.println("Result 5	:" + Sum_Odd_Even(Number_Array4));
		System.out.println("Result 6	:" + Sum_Odd_Even(Number_Array5));
		System.out.println("Result 7	:" + Sum_Odd_Even(Number_Array7));
		System.out.println("Result 8	:" + Sum_Odd_Even(Number_Array8));
		System.out.println("Result 9	:" + Sum_Odd_Even(Number_Array9));
		

	}

}
