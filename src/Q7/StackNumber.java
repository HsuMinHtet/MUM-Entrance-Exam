package Q7;

public class StackNumber {
	public static int isStacked(int n) {
		int sum =0;
		int i =0;
		while(n!=sum) {
			i++;
			sum +=i;
			if (sum > n)
				return 0;
		}
		return 1;
	}

	public static void main(String[] args) {
		System.out.println("Stack : " + isStacked(1));
		System.out.println("Stack : " + isStacked(3));
		System.out.println("Stack : " + isStacked(6));
		System.out.println("Stack : " + isStacked(12));
		System.out.println("Stack : " + isStacked(7));
		System.out.println("Stack : " + isStacked(8));
		System.out.println("Stack : " + isStacked(9));
	}

}
