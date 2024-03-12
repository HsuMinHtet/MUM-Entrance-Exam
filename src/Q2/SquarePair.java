package Q2;

import java.util.ArrayList;
import java.util.Collections;

public class SquarePair {

	public static int countSquarePairs(int[] a) {
		double sum = 0;
		int count = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				sum = Math.sqrt( a[i] + a[j]); // if 9, sum =3; if 11, 3.3166 
				//if (sum == 4 || sum == 9 || sum == 16|| sum == 25) {
				if ( sum *10 % 10 ==0) {
					if (a[i] > 0 && a[j] > 0)
						count++;
				}
			}
		}

		return count;
	}
	public static int countSquarePairs2(int[] a) {
        ArrayList<Integer> list = new ArrayList<>();
        int result = 0;
        for (int i = 0; i < a.length; i++) {
            list.add(a[i]);
        }
        Collections.sort(list);
        for (int out = 0; out < list.size() - 1; out++) {
            if (list.get(out) < 1) {
                continue;
            }
            for (int in = out + 1; in < list.size(); in++) {
                double sqrt = Math.sqrt(list.get(out) + list.get(in));
                if (sqrt * 10 % 10 == 0) {
                    result++;
                }
            }
        }
        return result;
    }

	public static void main(String[] args) {
		int[] Number_Array1 = { 9, 0, 2, -5, 7 };
		int[] Number_Array2 = { 9 };
		int[] Number_Array3 = { 11, 5, 4, 20 };
		System.out.println("Result1_2	: " + countSquarePairs2(Number_Array3));
		System.out.println("Result1_1	: " + countSquarePairs(Number_Array1));
		System.out.println("Result2	: " + countSquarePairs(Number_Array2));
	}

}
