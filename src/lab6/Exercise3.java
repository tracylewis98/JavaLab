package lab6;

import java.util.*;

public class Exercise3 {
	public static HashMap getSquare(int[] array) {
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int n : array) {
			map.put(n, n * n);
		}
		return map;
	}

	public static void main(String[] args) {
		int array[] = new int[] { 11, 50, 30, 28, 76, 129, 284 };
		HashMap<Integer, Integer> hmap = getSquare(array);
		Iterator<Integer> itr = hmap.keySet().iterator();
		while (itr.hasNext()) {
			Integer key = itr.next();
			System.out.println("the square of given number is : " + key + " is :- " + hmap.get(key));
		}
	}
}