package Q18;

import java.util.*;

public class Anagrams {

	public static int areAnagrams(char[] a1, char[] a2) {
		int count = 0;
		int tCount = 0;
		boolean duplicate = false;
		List<Integer> list = new ArrayList<>();
		// same length or not
		if (a1.length == 0 || a2.length == 0) {
			return 1;
		} else if (a1.length != a2.length) {
			return 0;
		} else {
			// a1 element in a2?
			for (int i = 0; i < a1.length; i++) {
				for (int j = 0; j < a2.length; j++) {
					// if a1 element in a2
					if (a1[i] == a2[j]) {
						if (list.size() == 0) {
							list.add(j);
							count++;
							break;
						} else {
							// not count same letter in twice from a2
							for (int x = 0; x < list.size(); x++) {
								if (list.get(x) == j) {
									duplicate = true;
								}
							}
							if (duplicate == false) {
								list.add(j);
								count++;
								break;
							}
						}
					}
					duplicate = false;
				}
				// not a1 in a2
				if (count == 0)
					return 0;
				else
					tCount += count;
				count = 0;
			}
			if (tCount == a1.length)
				return 1;
			else
				return 0;
		}
	}

	public static void main(String[] args) {
		char[] a = { 's', 'i', 't' };
		char[] b = { 'i', 't', 's' };
		char[] c = { 'p', 'o', 'o', 'l' };
		char[] d = { 'o', 'p', 'o', 'l' };
		char[] e = {};
		char[] f = { 'b', 'b', 'b' };
		char[] g = { 'b', 'i', 't' };

		System.out.println(areAnagrams(a, b));
		System.out.println(areAnagrams(c, d));
		System.out.println(areAnagrams(e, e));
		System.out.println(areAnagrams(f, f));
		System.out.println(areAnagrams(g, f));
		System.out.println(areAnagrams(f, g));

	}

}
