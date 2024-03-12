package MIU_SampleTest;

public class SelectCommonInteger {
	
	public static int[] giveCommonInteger_TwoArray(int[]first, int[] second){
		int[] result = new int[5];
		int index =0;
		if (first == null || second == null || first.length == 0 || second.length ==0){
			return null;
		}
		else {
			for (int i=0; i<first.length; i++)
			{
				for (int j=0; j<second.length;j++) {
					if (first[i]==second[j]) {
						result[index]= first[i];
						index ++;
					}
				}
			}
			return result;
		}
	}

	public static void Print_Char(int[]a) {
		if( a == null)
		{System.out.println("null");}
		else {
			for (int i=0; i < a.length; i++) {
				System.out.print(a[i]);
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		int[] Number_Array0 = {1,8,3,2};
		int[] Number_Array1 = {4,2,6,1};
		int[] Number_Array2 = {1,8,3,2,6};
		int[] Number_Array3 = {2,6,1};
		int[] Number_Array4 = {1,3,7,9};
		int[] Number_Array5 = {7,1,9,3};
		int[] Number_Array6 = {1,2};
		int[] Number_Array7 = {3,4};
		int[] Number_Array8 = {1,2,3};
		int[] Number_Array9 = {};
		 
		Print_Char(giveCommonInteger_TwoArray(Number_Array0,Number_Array1));
		Print_Char(giveCommonInteger_TwoArray(Number_Array2,Number_Array3));
		Print_Char(giveCommonInteger_TwoArray(Number_Array4,Number_Array5));
		Print_Char(giveCommonInteger_TwoArray(Number_Array6, Number_Array7));
		Print_Char(giveCommonInteger_TwoArray(Number_Array9, Number_Array8));
		Print_Char(giveCommonInteger_TwoArray(Number_Array6, Number_Array9));
		Print_Char(giveCommonInteger_TwoArray(Number_Array6, null));
		Print_Char(giveCommonInteger_TwoArray(null, Number_Array9));
		Print_Char(giveCommonInteger_TwoArray(null, null));

	}


}
