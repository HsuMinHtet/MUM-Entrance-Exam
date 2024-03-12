package Q2;

public class PorcupineNumber {

	public static int findPorcupineNumber(int n) {
		int procupine = 0;
		boolean isPrime = false;
		if (n % 10 == 9) {
			procupine = n;
			do{
				procupine = procupine+10;
				if (procupine % 2 != 0 && procupine % 3 != 0 && procupine % 5 != 0 && procupine % 7 != 0)
					isPrime = true;
			}while (isPrime == false);
			return procupine;
		}
		return procupine;
	}

	/*
	 * public static int findPorcupineNumber_2(int n) { while (true) { if
	 * (isPrime(++n) && endWith9(n)) { int j = n; while (true) { if (isPrime(++j)) {
	 * if (endWith9(j)) { return n; } else { break; } } } } } }
	 * 
	 * private static boolean isPrime(int n) { for (int i = 2; i < n; i++) { if (n %
	 * i == 0) { return false; } } return true; }
	 * 
	 * private static boolean endWith9(int n) { if (n % 10 == 9) { return true; }
	 * return false; }
	 */
	public static void main(String[] args) {
		/*
		 * System.out.println("Result1 : " + findPorcupineNumber_2(7));
		 */
		
		System.out.println("Result1 : " + findPorcupineNumber(7));
		System.out.println("Result2	: " + findPorcupineNumber(19));
		System.out.println("Result2 : " + findPorcupineNumber(89));
		System.out.println("Result2 : " + findPorcupineNumber(139));

	}

}
