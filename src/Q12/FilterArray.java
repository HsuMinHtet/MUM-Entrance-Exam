package Q12;

import java.util.*;

public class FilterArray {
	public static int[] filterArray(int[] a, int n) {
		int num = n;
		int bi = 1;
		int i = 0;
		List<Integer> list = new ArrayList<>();

		while (num != 0) {
			while (num >= bi) {
				i++;
				bi *= 2;
			}
			num -= (bi / 2);
			i--;
			if (a.length > i)
				list.add(a[i]);
			else
				list = null;
			i = 0;
			bi = 1;
		}
		if(list==null)
			return null;
		int[] result = new int[list.size()];
		for (int j = 0; j < list.size(); j++) {
			result[j] = list.get((list.size()-1)-j);
		}
		return result;

	}

	public static void main(String[] args) {
		int[] a = { 9,-9 };
		int[] b = { 9,-9,5 };
		int[] c = { 0,9,12,18,-6 };
		
		System.out.println(Arrays.toString(filterArray(a,0)));
		System.out.println(Arrays.toString(filterArray(a,1)));
		System.out.println(Arrays.toString(filterArray(a,2)));
		System.out.println(Arrays.toString(filterArray(a,3)));
		System.out.println(Arrays.toString(filterArray(a,4)));
		System.out.println(Arrays.toString(filterArray(b,3)));
		System.out.println(Arrays.toString(filterArray(c,11)));
		

	}

}
