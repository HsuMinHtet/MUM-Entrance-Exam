package Q19;

public class Vesuvian {

	public static int isVesuvian(int n) {
		int num1, num2;
		int count = 0;
		int result = 0;
		for (int i = 1; i < 9; i++) {
			num1 = i * i;
			for (int j = 1; j < 9; j++) {
				num2 = j * j;
				result = num1 + num2;
				if (n == result)
					// System.out.println(i +":"+ num1 +"+"+ num2);
					count++;
			}
		}
		if (count >= 2)
			return 1;
		else
			return 0;
	}

	public static void main(String[] args) {
		System.out.println(isVesuvian(50));
		System.out.println(isVesuvian(65));
		System.out.println(isVesuvian(85));
		System.out.println(isVesuvian(36));

	}

}
