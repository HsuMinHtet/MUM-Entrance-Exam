package Q_10;

public class CountRepresentation {

	public static int countRepresentations(int numRupees) {
		int count = 0;
		for (int rupee20 = 0; rupee20 <= numRupees / 20; rupee20++) {
			for (int rupee10 = 0; rupee10 <= numRupees / 10; rupee10++) {
				for (int rupee5 = 0; rupee5 <= numRupees / 5; rupee5++) {
					for (int rupee2 = 0; rupee2 <= numRupees / 2; rupee2++) {
						for (int rupee1 = 0; (rupee1 <= numRupees / 1); rupee1++) {
							if (20 * rupee20 + 10 * rupee10 + 5 * rupee5 + 2 * rupee2 + 1 * rupee1 == numRupees)
								count++;
						}
					}
				}
			}
		}
		return count;

	}

	public static void main(String[] args) {
		System.out.println("Rep : " + countRepresentations(6));
		System.out.println("Rep : " + countRepresentations(12));
		System.out.println("Rep : " + countRepresentations(10));

	}

}
