package MIU_SampleTest;

public class POE {
	public static int POE_equilibrium(int[] a) {
		int i = 0;
		int front = a[i];
		int j = a.length;
		int back = a[j - 1];
		if (a.length < 3) {
			return -1;
		}
		for (int x = 0; x < a.length - 1; x++) {
			if (front < back) {
				i++;
				front += a[i];
			}
			if (front > back) {
				back += a[j - 2];
				j--;
			}
			if (front == back && i != 0 && i + 2 != j) {
				return i + 1;
			}
			if (i == 0 && j == a.length) {
				i++;
				j--;
			}
		}
		return -1;
	}

	public static int POE_2(int[] a) {
		if (a.length < 3)
			return -1;
		int i = 0;
		int j = a.length - 1;
		int idx = 1;
		int leftSum = a[i];
		int rightSum = a[j];
		for (int k = 1; k < a.length - 2; k++) {
			if (leftSum < rightSum) {
				i++;
				leftSum += a[i];
				idx = i + 1;
			} else {
				j--;
				rightSum += a[j];
				idx = j - 1;
			}
		}
		if (leftSum == rightSum)
			return idx;
		else
			return -1;
	}

	public static void main(String[] args) {
		int[] a = { 1, 8, 3, 7, 10, 2 };
		int[] b = { 1, 5, 3, 1, 1, 1, 1, 1, 1 };
		int[] c = { 2, 1, 1, 1, 2, 1, 7 };
		int[] d = { 1, 2, 3 };
		int[] e = { 3, 4, 5, 10 };
		int[] f = { 1, 2, 10, 3, 4 };
		
		  System.out.println("Result   a: " + POE_equilibrium(a));
		  System.out.println("Result   b: " + POE_equilibrium(b));
		  System.out.println("Result   c: " + POE_equilibrium(c));
		  System.out.println("Result   d: " + POE_equilibrium(d));
		  System.out.println("Result   e: " + POE_equilibrium(e));
		  System.out.println("Result   f: " + POE_equilibrium(f));
		 
		  System.out.println("--------------------" );

		  System.out.println("Result   a: " + POE_2(a));
		  System.out.println("Result   b: " + POE_2(b));
		  System.out.println("Result   c: " + POE_2(c));
		  System.out.println("Result   d: " + POE_2(d));
		  System.out.println("Result   e: " + POE_2(e));
		  System.out.println("Result   f: " + POE_2(f));
		 

	}

}
