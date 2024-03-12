package MIU_SampleTest;

public class Reverse {
	
	//own
	public static int reverse_Serial (int n) {
		int modulus;
		int i=0;
		int result = 0;
		int sign = 1;
		
		if(n<=0) {
			sign = -1;
			n=-n;
		}
		while(n!=0) {
			modulus = n%10;
			if (i==0 && n>10)
				result = modulus*10;
			else if(i!=0 && n>10)
				result = (result+modulus) *10;
			else if (i!=0&& n<10)
				result = (result+modulus);
			n = n/10;
			i++;
		}
		return sign*result;
	}
	//refer
	public static int reverse_Nemeric (int n) {
		int result=0;
		if(n==0) return 0;
		while (n!=0) {
			result = (result *10)+(n%10);
			n/=10;
		}
		return result;
	}

	public static void main(String[] args) {
		System.out.println("Reverse Result: " + reverse_Serial(12345));
		System.out.println("Reverse Result: " + reverse_Nemeric(-12345));

	}

}
