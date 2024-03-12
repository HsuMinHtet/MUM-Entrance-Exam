package MIU_SampleTest;

public class Array_Start_Length {

	public static char[] accept_CharArray(char[]a, int start, int len) {
		char[] output_Array;
		if (a == null || start+len > a.length || a.length == 0 || len <0 || start <0 )
			return null;
		else
			{
			output_Array = new char[len];
				for (int i=0 ; i <len; i++) {		
						output_Array[i] = a[start];
						start++;

				}
			return output_Array;
			}
	}
	public static void Print_Char(char[]a) {
		if( a == null || a.length == 0)
		{System.out.println("null");}
		else {
			for (int i=0; i < a.length; i++) {
				System.out.print(a[i]);
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		char[] Char_Array = {'a','b','c'};
		char[] Char_Array1 = { };
		 
		Print_Char(accept_CharArray(Char_Array, 0, 4));
		Print_Char(accept_CharArray(Char_Array, 0, 3));
		Print_Char(accept_CharArray(Char_Array, 0, 2));
		Print_Char(accept_CharArray(Char_Array, 0, 1));
		Print_Char(accept_CharArray(Char_Array, 1, 3));
		Print_Char(accept_CharArray(Char_Array, 1, 2));
		Print_Char(accept_CharArray(Char_Array, 1, 1));
		Print_Char(accept_CharArray(Char_Array, 2, 2));
		Print_Char(accept_CharArray(Char_Array, 2, 1));
		Print_Char(accept_CharArray(Char_Array, 3, 1));
		Print_Char(accept_CharArray(Char_Array, 1, 0));
		Print_Char(accept_CharArray(Char_Array, -1, 2));
		Print_Char(accept_CharArray(Char_Array, -1, -2));
		Print_Char(accept_CharArray(Char_Array1, 0, 1));

	}

}
